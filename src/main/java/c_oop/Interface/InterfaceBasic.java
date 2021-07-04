package c_oop.Interface;

/**
 * 接口(基础)
 */
public interface InterfaceBasic {
    // 全局常量
    int MAX_SPEED = 7900;  // 省略了public static final

    // 抽象方法
    void fly();  // 省略了public abstract

    int stop();
}


interface Attackable {
    void attack();
}


// 普通类(即非抽象类)如果实现一个接口,那么必须为接口中所有的抽象方法提供方法定义
class Plane implements InterfaceBasic {  // 要让一个类遵循某个特定接口(或者一组接口),需要使用implements关键字
    @Override
    public void fly() {
        System.out.println("飞机飞");
    }

    @Override
    public int stop() {
        System.out.println("飞机停");
        return 0;
    }
}


// 如果类没有为接口中所有的抽象方法提供方法定义(即仍包含抽象方法),则类仍必须被限定为抽象的
abstract class Kite implements InterfaceBasic {
    @Override
    public void fly() {
        System.out.println("风筝飞");
    }
}


class Structure {
    private String name;

    public Structure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printShow() {
        System.out.println("产地:美国");
    }
}


// 继承类并实现多个接口
class Bullet extends Structure implements InterfaceBasic, Attackable {
    public Bullet(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("子弹飞");
    }

    @Override
    public int stop() {
        System.out.println("子弹停");
        return 0;
    }

    @Override
    public void attack() {
        System.out.println("子弹攻击");
    }
}


class InterfaceBasicTest {
    public static void main(String[] args) {
        // InterfaceBasic ib = new InterfaceBasic();  // 报错:java: c_oop.Interface.InterfaceBasic是抽象的; 无法实例化

        // 多态性
        InterfaceBasic ib = new Bullet("穿甲弹");
        ib.fly();
        System.out.println(ib.stop());
        System.out.println("*******************************************");

        Attackable ak = new Bullet("空尖弹");
        ak.attack();
        System.out.println("*******************************************");

        Structure st = new Bullet("达姆弹");
        System.out.println(st.getName());
        st.printShow();
    }
}