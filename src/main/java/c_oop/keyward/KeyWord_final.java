package c_oop.keyward;

/**
 * final关键字
 * 1. 修饰类
 * 2. 修饰方法
 * 3. 修饰方法体中的参数
 * 4. 修饰变量
 */
public class KeyWord_final {
    int age = 99;

    // final修饰的方法不能被重写;
    // 注:类中所有的private方法都隐式的被指定为是final的
    final public void show() {
        System.out.println("final");
    }
}

// final修饰的类不能被继承,但可以继承其他类
final class Sub0KeyWord_final extends KeyWord_final {
    // 报错:java: oop.Sub0KeyWord_final中的show()无法覆盖oop.KeyWord_final中的show() 被覆盖的方法为final
    // public void show() {
    // }
}

// 报错:java: 无法从最终oop.Sub0KeyWord_final进行继承
// class Sub1KeyWord_final extends Sub0KeyWord_final {
// }

class KeyWord_finalTest {
    // final修饰的参数:这意味这无法在方法中更改参数引用所指向的对象,这一特性主要用于向匿名内部类传递数据
    public void f(final KeyWord_final g) {
        // g = new KeyWord_final();  // 报错:java: 不能分配最终参数g
    }

    public static void main(String[] args) {
        final int AGE = 20;  // 常量(必须被初始化:显式初始化,构造器初始化,代码块初始化);不能被修改;命名规范:全部大小
        // AGE = 30;  // 报错:java: 无法为最终变量AGE分配值
        final KeyWord_final fk = new KeyWord_final();  // fk为引用数据类型
        // fk = new KeyWord_final();  // 报错:java: 无法为最终变量fk分配值
        System.out.println(fk.age);
        fk.age = 999;  // 仍可以修改其内容
        System.out.println(fk.age);
    }
}