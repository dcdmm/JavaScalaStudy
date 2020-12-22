package c_oop;

/**
 * super关键字:是一个指示编译器调用超类(最近的那个)方法的特殊关键字
 */
public class SuperKeyward {
    int age = 12;

    public SuperKeyward() {
        this("dc", 111);
        System.out.println("调用了父类的无参构造方法");
    }

    public SuperKeyward(String name, int age) {
        this.age = age; // 该this.age表示当前对象(父类中的)成员变量age
        System.out.println("调用了父类的有参构造方法:name;age");
    }

    public SuperKeyward(String name, int age, String sex) {
        this("dc", 111);
        System.out.println("调用了父类的有参构造方法:name;age;sex");
    }

    public void showAge() {
        System.out.println("调用了父类的showAge方法");
    }
}


class SubSuperKeyword extends SuperKeyward {
    int age = 24;

    /*
     * 如果子类的构造器没有显式地调用超类的构造器,则将自动地调用超类默认(没有参数)的构造器
     * 如果超类没有不带参数的构造器,并且在子类的构造器中又没有显式地调用超类的其他构造器,则Java编译器将报告错误。
     */
    public SubSuperKeyword() {
        super(); // 显式地调用父类的(无参)构造方法;必须为构造器的第一条语句出现
        // this("dc", 25); // 此时不能通过this调用其他构造器
        System.out.println("调用了子类的无参构造方法");
    }

    public SubSuperKeyword(String name, int age) {
        System.out.println("调用了子类的有参构造方法:name,age");
    }

    public SubSuperKeyword(String name, int age, String sex) {
        super(name, age, sex); // 调用父类的有参构造方法
        this.age = age; // 该this.age表示当前对象成员变量age
        System.out.println("调用了子类的有参构造方法:name,age,sex");
    }

    @Override
    public void showAge() {
        int age = 25;
        System.out.println("调用了子类的showAge方法");
        System.out.println(age); // 局部变量
        System.out.println(this.age); // 当前对象的成员变量
        System.out.println(super.age); // 当前对象(父类中的)成员变量(当子类成员变量和父类成员变量重名时)
        super.showAge(); // 当前对象(父类中的)成员方法(当子类重写父类方法时)
    }

    public static void main(String[] args) {
        SubSuperKeyword ssk0 = new SubSuperKeyword();
        ssk0.showAge();
        System.out.println("******************************************************************");
        SubSuperKeyword ssk1 = new SubSuperKeyword("duanchao", 222);
        ssk1.showAge();
        System.out.println("******************************************************************");
        SubSuperKeyword ssk2 = new SubSuperKeyword("duanchao", 333, "man");
        ssk2.showAge();
    }
}

