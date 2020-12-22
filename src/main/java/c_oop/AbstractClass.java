package c_oop;

/**
 * 抽象类:包含抽象方法的类称为抽象类(其他特性与普通类相同);
 *      如果一个类包含一个或多个抽象方法,则该类必须被限定为抽象的(反之若类即使不含抽象方法,也可以将类声明为抽象类,但此时该类不能实例化)
 * 注意:
 * 1. abstract关键字不能修饰成员属性,构造器
 * 2. abstract关键字不能与private,static(静态方法可以被类及其对象调用),final关键字共存
 */
public abstract class AbstractClass {
    private int i; // 成员变量

    // 抽象类可以有构造方法(注意和接口的区别)
    public AbstractClass() {
    }

    public AbstractClass(int i) {
        this.i = i;
    }

    // setter和getter方法
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public abstract void printName(String name); // 抽象方法

    public abstract void adjust();

    public String what() { // 非抽象方法
        return "Instrument";
    }
}


// 没有为基类中所有的抽象方法提供方法定义(即仍包含抽象方法),该类仍必须被限定为抽象的
abstract class Child0AbstractClass extends AbstractClass {
    @Override
    public void adjust() {
        System.out.println("adjust");
    }
}


// 普通类如果从一个抽象类继承,那么必须为基类中所有的抽象方法提供方法定义
class Child1AbstractClass extends AbstractClass {

    public Child1AbstractClass() {
    }

    public Child1AbstractClass(int i) {
        super(i);
    }

    @Override
    public void printName(String name) {
        System.out.println(name);
    }

    @Override
    public void adjust() {
    }
}


class AbstractClassTest {
    public static void main(String[] args) {
        // AbstractClass ac0 = new AbstractClass(); // 报错:java: oop.AbstractClass是抽象的; 无法实例化
        AbstractClass ac = new Child1AbstractClass(332); // 向上转型
        // 多态
        ac.printName("duanchao");
        System.out.println(ac.what());
        System.out.println(ac.getI());
    }
}
