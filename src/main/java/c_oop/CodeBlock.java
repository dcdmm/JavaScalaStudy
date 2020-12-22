package c_oop;

import org.junit.Test;

/**
 * 代码块
 */
class Root {
    // 静态代码块;static关键字修饰
    static {
        System.out.println("Root的静态代码块");
    }

    // 普通代码块
    {
        System.out.println("Root的普通代码块");
    }

    public Root() {
        System.out.println("Root的无参构造器");
    }
}


class Mid extends Root {
    static {
        System.out.println("Mid的静态代码块");
    }

    public Mid() {
        System.out.println("Mid的无参构造方法");
    }

    public Mid(String msg) {
        this();
        System.out.println("Mid的带有形式参数的构造器,其参数为: " + msg);
    }

    {
        System.out.println("Mid的普通代码块");
    }
}


class Leaf extends Mid {
    String name;
    static String city;

    // 不能访问类的非静态成员变量和非静态成员方法
    static {
        city = "wugang"; // 初始化类属性
        System.out.println("Leaf的静态代码块");
    }

    public Leaf() {
        super("dmm");
        System.out.println("Leaf的无参构造方法");
    }

    // 普通代码块可以访问静态成员变量和静态成员方法
    {
        name = "dcdmmcomeon"; // 初始化对象属性
        System.out.println("Leaf的普通代码块");
    }

    public static void main(String[] args) { //
        System.out.println("Leaf的main方法");
        new Leaf();
    }
}


public class CodeBlock {
    @Test
    public void staticBlockTest() {
        // 静态代码块:在类初始化的时候执行一次
        String my_city = Leaf.city;
    }

    // 执行顺序:静态代码块--->普通代码块--->构造器
    @Test
    public void ordinaryBlockTest() {
        // 普通代码块:对象生成时都会被执行一次
        Leaf leaf1 = new Leaf();
        System.out.println("*****************************");
        Leaf leaf2 = new Leaf(); // 此时类已经初始化,不会再执行静态代码块
    }
}
