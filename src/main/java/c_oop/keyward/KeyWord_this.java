package c_oop.keyward;

/**
 * this关键字的用法(类似python中self关键字)
 * 1. this(parma):调用其他的构造器;只能调用一个;必须为构造器的第一条语句出现
 * 2. this.xxx:当前对象的成员变量xxx
 * 3. this.yyy(paras…):当前对象的成员方法yyy
 * 4. this:当前对象(引用)
 */
public class KeyWord_this {
    private String name;

    public KeyWord_this() {
        this("dc");  // 调用本类的KeyWord_this(String name)构造方法,可以实现构造器的默认参数的效果
    }

    public KeyWord_this(String name) {
        this.name = name;
    }

    public KeyWord_this getObject() {
        return this;  // 当前对象的引用
    }

    public void getMethod(String name) {
        this.setName(name);  // 当前对象的成员方法;可简写为setName(name)
    }

    public void setName(String name) {
        this.name = name;  // 当前对象的成员变量
    }

    public String getName() {
        return name;
    }

    public double area(double hight, double width) {
        return hight * width;
    }

    // java不支持设置默认参数
    // 可通过方法重载和this关键字实现间接默认参数的效果
    public double area() {
        return this.area(5, 8);
    }
}


class KeyWord_thisTest {
    public static void main(String[] args) {
        KeyWord_this tk0 = new KeyWord_this();
        KeyWord_this tk1 = new KeyWord_this();
        System.out.println(tk0.getName());  // 实现了默认参数的效果
        System.out.println(tk0.getObject());  // tk0的引用
        System.out.println(tk1.getObject());  // tk1的引用
        System.out.println("**************************");

        tk0.setName("duanmengmeng");
        System.out.println(tk0.getName());
        tk0.getMethod("duanchao");
        System.out.println(tk0.getName());
        System.out.println("**************************");

        System.out.println(tk0.area());
    }
}