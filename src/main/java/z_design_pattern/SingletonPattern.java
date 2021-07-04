package z_design_pattern;

/**
 * 单例模式(只存在一个对象实例)
 */
public class SingletonPattern {
    public static void main(String[] args) {
        Lazy0 lazy0 = Lazy0.getInstance();
        Lazy0 lazy1 = Lazy0.getInstance();
        System.out.println(lazy0 == lazy1);
    }
}


/**
 * 饿汉式:线程安全
 */
class Lazy0 {
    public static void main(String[] args) {
    }

    // 私有化构造函数
    private Lazy0() {
    }

    private static final Lazy0 instance = new Lazy0();  // 类内部创建对象实例

    public static Lazy0 getInstance() {
        return instance;
    }

}


/**
 * 懒汉式:线程不安全
 */
class Lazy1 {
    // 私有化构造函数
    private Lazy1() {
    }

    private static Lazy1 instance;  // 类内部创建对象实例

    public static Lazy1 getInstance() {
        if (instance == null) {
            synchronized (Lazy1.class) {  // 利用synchronized关键字解决线程不安全问题
                if (instance == null) {
                    instance = new Lazy1();
                }
            }
        }
        return instance;
    }
}
