package c_oop;

/**
 * 向上转型:子类引用的对象转换为父类类型(不用强制转换)
 * 注意:只能访问继承自父类的方法和变量或子类重写的方法;子类中后定义的成员(变量和方法)不能被调用(但可通过重写的方法进行访问)
 */
public class UpwardTransformation {
    int age = 11;
    String sex = "woman";

    public void sing() {
        System.out.println("sing!;父类" + age);
    }

    public void play() {
        System.out.println("play!;父类" + age);
    }

    static void tune(UpwardTransformation i) { // 接受一个UpwardTransformation的引用,同时也接受任何导出自UpwardTransformation的类(多态)
        i.sing(); // 继承自父类的sing方法
        i.play(); // 子类重写的play方法
        // 继承自父类的变量
        System.out.println(i.age);
        System.out.println(i.sex);
        // 子类中自己后定义的成员(变量或方法)不能被调用
        // System.out.println(i.name);
        // i.dance();
    }
}

class SubUpwardTransformation extends UpwardTransformation {
    int age = 99;
    String sex = "man";
    String name = "duanchao";

    @Override
    public void play() {
        // 通过重写的play方法访问子类中后定义的成员(变量和方法)
        System.out.println("play!;子类" + age + " " + sex + " " + name);
        dance();
    }

    public void dance() {
        System.out.println("dance!");
    }

    public static void main(String[] args) {
        SubUpwardTransformation sut = new SubUpwardTransformation();
        UpwardTransformation.tune(sut);
    }
}