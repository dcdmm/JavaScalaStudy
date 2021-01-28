package c_oop.keyward;

/**
 * static关键字
 * 静态变量:被所有的对象所共享,在内存中只有一个副本;随着类的加载而加载;而非静态变量是对象所拥有的,在创建对象的时候被初始化,存在多个副本,各个对象拥有的副本互不影响
 * 静态方法(类似静态变量):
 *      注意:不能访问类的非静态成员变量和非静态成员方法,因为非静态成员方法/变量都是必须依赖具体的对象才能够被调用(易知静态方法中不能使用this关键字)
 */
public class StaticKeyward {
    int age = 22;
    static String name = "duanchao"; // 静态变量;一般和final关键字结合使用,表示静态常量

    public static void showStatic() { // 静态方法
        System.out.println(name);
        // System.out.println(age);
        // dance();
    }

    public void show() {
        System.out.println(name); // 非静态方法可以访问静态变量
        System.out.println(age);
        dance();
        showStatic(); // 非静态方法可以调用静态方法
    }

    public void dance() {
        System.out.println("dance");
    }
}


class StaticKeywardTest {
    public static void main(String[] args) {
        StaticKeyward sk0 = new StaticKeyward();
        System.out.println(sk0.name); // 通过实例名.变量名 访问静态变量
        System.out.println(StaticKeyward.name); // 通过类名.变量名 访问静态变量(推荐)
        sk0.name = "dmm";
        sk0.showStatic(); // 通过实例名.方法名 访问静态方法
        StaticKeyward.showStatic(); // 通过类名.方法名 访问静态方法(推荐)
        System.out.println("**********************************************");

        StaticKeyward sk1 = new StaticKeyward();
        System.out.println(sk1.name);
        System.out.println(StaticKeyward.name);
    }
}