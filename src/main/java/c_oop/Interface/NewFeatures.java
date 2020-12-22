package c_oop.Interface;

/**
 * Java8新特性:
 * 1. 静态方法:接口中定义的静态方法,只能通过接口来调用
 * 2. 默认方法:
 *      1. 通过实现类的对象,可以调用接口中的默认方法
 *      2. 如果实现类重写了接口中的默认方法,调用的是重写之后的方法
 *      3. 如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的默认方法(子类在没有重写此方法的情况下),默认调用的是父类中的该方法--->类优先原则
 *      4. 如果实现类实现了多个(2个或2个以上)接口,若这些接口中定义了同名同参数的默认方法,那么必须重写该默认方法(否则将报错)--->接口冲突
 */
interface NewFeaturesA {
    String NAME = "dcdmm";

    void eat();

    static void methodStatic() { // 省略了public
        System.out.println("静态方法!");
    }

    default void methodDefault0() { // 省略了public
        System.out.println("接口A默认方法0!");
    }

    default void methodDefault1() {
        System.out.println("接口A默认方法1!");
    }

    default void methodDefault2() {
        System.out.println("接口A默认方法2!");
    }
}


interface NewFeaturesB {
    default void methodDefault2() {
        System.out.println("接口B默认方法2!");
    }
}


class DefaultSupter {
    public void methodDefault1() {
        System.out.println("父类默认方法1!");
    }
}


class NewFeaturesClass extends DefaultSupter implements NewFeaturesA, NewFeaturesB {
    @Override
    public void eat() {
    }

    @Override
    public void methodDefault0() {
        System.out.println("实现类重写接口A默认方法0!");
    }

    @Override
    public void methodDefault2() { // 必须重写methodDefault2
    }

    public void showDefaultMethod() {
        NewFeaturesA.super.methodDefault0(); // 调用接口中被重写的方法
    }
}


class NewFeaturesTest {
    public static void main(String[] args) {
        NewFeaturesA.methodStatic();
        NewFeaturesClass nfc = new NewFeaturesClass();
        nfc.methodDefault0();
        nfc.methodDefault1();
        nfc.showDefaultMethod();
    }
}