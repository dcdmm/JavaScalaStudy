package c_oop;

/**
 * java类基本介绍
 */
public class ClassBasic {
    /*
    成员变量
    1. 堆内存空间中
    2. 类中方法外
    3. 有默认初始值
    3. 随着对象的创建而存在,随着对象的消失而消失
     */
    private String name = "dc";  // private:可以修饰成员变量和成员方(被其修饰的成员只能在本类中被访问)
    /*
    public修饰符
    1. 可以被任意包内的类访问
    2. 被public修饰的类,类名必须与文件名相同
     */
    public int age;

    // 成员方法
    public void printName() {
        /*
        局部变量
        1. 栈内存空间中
        2. 方法或者代码块或形式参数中
        3. 没有默认初始值，使用之前需要赋值
        4. 随着方法的调用或者代码块的执行而存在
         */
        String name = "duanchao";  // 局部变量和成员变量重名时,采用就近原则
        System.out.println("my name is:" + name);
    }

    public void printAge() {
        System.out.println("my age is:" + age);
    }

    // 属性的(setter)方法和取值(getter)方法,用于属性的读写
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ClassDefineTest {
    /**
     * main方法:java应用程序的入口(静态方法)
     * 每一个类可以有一个main方法,这是一个常用于对类进行单元测试的技巧
     */
    public static void main(String[] args) {
        ClassBasic cd = new ClassBasic();  // ClassBasic对象的创建
        cd.printName();
        System.out.println(cd.age);
        // System.out.println(cd.name);  // 报错:java: name 在 oop.ClassDefine 中是 private 访问控制
        System.out.println(cd.getName());  // 通过setter和getter方法,进行属性的读写
    }
}