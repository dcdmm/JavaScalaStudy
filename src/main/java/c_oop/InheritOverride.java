package c_oop;

/**
 * 继承:子类拥有父类非private的成员变量,成员方法
 * "is-a"关系是继承的一个明显特征
 */
public class InheritOverride {
    public double height = 174;
    public int age = 22;
    private String name = "duanchao";

    public static void print() {
        System.out.println("父类静态方法");
    }

    public InheritOverride() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sing() throws NullPointerException {
        System.out.println("调用了父类的sing方法");
    }
}


// Object类是所有类的父类
class SubInheritOverride extends InheritOverride {
    public int age = 25;

    /*
     * 如果子类的构造器没有显式地调用超类的构造器,则将自动地调用超类默认(没有参数)的构造器
     * 如果超类没有不带参数的构造器,并且在子类的构造器中又没有显式地调用超类的其他构造器(super(*, *, *...)),则Java编译器将报错
     */
    public SubInheritOverride() {
        // 省略了 super();
    }

    public static void print() {
        System.out.println("子类的静态方法"); // 再次声明
    }

    /**
     * 方法重写(Override),又称为方法覆盖;重写是实现多态的前提
     * 定义:子类中创建了一个与父类中相同名称、相同返回值类型、相同参数列表的方法,只是方法体中的实现不同,以实现不同于父类的功能
     * 注意:
     * 1. 重写的方法可以使用@Override注解来标识
     * 2. 构造器方法不能被重写
     * 3. 访问权限不能比父类中被重写的方法的访问权限更低.例:如果父类的一个方法被声明为public,那么在子类中重写该方法就不能声明为protected
     * 4. 子类抛出的异常类型不能比父类抛出的异常类型更宽泛(注意:RuntimeException及其所有子类一样宽泛)
     * 5. 声明为final的方法不能被重写
     * 6. 声明为static的方法不能被重写,但是能够被再次声明
     */
    @Override
    public void sing() throws RuntimeException {
        System.out.println("调用了子类的sing方法");
    }

    public void dance() {
        System.out.println("dance方法");
    }

    public static void main(String[] args) {
        SubInheritOverride sc = new SubInheritOverride();
        System.out.println(sc.height);
        System.out.println(sc.age); // 子类成员变量和父类成员变量重名(容易造成混淆)时,采用就近原则
        // System.out.println(sc.name); // 报错:java: name 在 oop.InheritBasic 中是 private 访问控制
        System.out.println(sc.getName());
        System.out.println("**********************************");
        sc.sing(); // 调用子类的sing方法(重写)
        sc.dance();
        System.out.println("**********************************");
        SubInheritOverride.print();
        InheritOverride io = new SubInheritOverride();
        io.sing();
        io.print(); // 调用的是父类的print方法,没有体现多态性
    }
}
