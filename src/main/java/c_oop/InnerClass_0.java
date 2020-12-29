package c_oop;

/**
 * 内部类-0
 * 1. 静态内部类(类似静态成员变量)
 * 2. 成员内部类(类似一般成员变量)
 */
public class InnerClass_0 {
    String name = "outer";
    private int age = 25;
    static int payment = 50000;

    public void showOuter() {
        System.out.println("外部类");
    }

    static class Dog { // 静态内部类
        String name = "狗";
        static int age = 1;
        public void showDog() {
            // 可以直接访问外部类的所有静态成员
            System.out.println(payment);
            System.out.println("静态内部类:Dog");

            // 如果要访问外部类的实例成员,则需要通过外部类的实例去访问
            InnerClass_0 ic = new InnerClass_0(); // 外部类的实例
            System.out.println(ic.name); // 外部类的实例成员
            ic.showOuter();
        }
    }

    class Bird { // 成员内部类
        String name = "杜鹃";
        static final int age = 3; // 实例内部类中不能定义static成员,除非同时使用final和static修饰
        public void showBird() {
            System.out.println("成员内部类:Bird");
        }

        public void display(String name) {
            // 可以直接访问外部类的所有成员
            showOuter();
            System.out.println(payment);
            System.out.println(age);

            // 属性重名时
            System.out.println(name); // 局部变量
            System.out.println(this.name); // 内部类的成员变量
            System.out.println(InnerClass_0.this.name); // 外部类的成员变量
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.name);

        // Bird b = new Bird(); // 报错:main方法为静态方法,Bird成员内部类为非静态属性
    }
}


class InnerClass_0Test {
    public static void main(String[] args) {
        InnerClass_0.Dog dog = new InnerClass_0.Dog(); // 静态内部内的实例化
        dog.showDog();
        System.out.println(dog.name);
        System.out.println(InnerClass_0.Dog.age); // 通过类名.变量名 访问静态变量(推荐)
        System.out.println(dog.age); // 通过实例名.变量名 访问静态变量
        System.out.println("*************************************");
        InnerClass_0 ic0 = new InnerClass_0();
        InnerClass_0.Bird bird = ic0.new Bird(); // 成员内部内的实例化
        bird.showBird();
        System.out.println(bird.age);
        bird.display("黄鹂");
    }
}
