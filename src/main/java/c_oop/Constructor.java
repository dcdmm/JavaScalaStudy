package c_oop;

/**
 * 构造器(构造方法,构造函数)
 * 1. 创建对象(new)之后自动调用
 * 2. 如果类中如果没有定义构造器,则会默认一个无参构造器(无参数且方法体为空),否则以定义的构造器为准
 * 3. 构造器的名称必须与类名相同,包括大小写
 * 4. 构造函数没有返回值,也不能用void修饰
 * 5. 一个类可以定义多个构造方法
 * 6. 构造方法可以进行重载
 * 7. 构造器不能被static,final关键字修饰
 */
public class Constructor {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("duanchao", 25);
        System.out.println(c1.name); // String默认值为null
        System.out.println(c1.age);
        System.out.println(c2.name);
        System.out.println(c1.age);
    }

    private String name;
    private double age;

    // 无参构造器
    public Constructor() {
    }

    // 带有形式参数的构造器
    public Constructor(String name, double age) { // 重载
        this.name = name;
        this.age = age;
    }
}
