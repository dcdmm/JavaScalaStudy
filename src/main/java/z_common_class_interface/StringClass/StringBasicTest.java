package z_common_class_interface.StringClass;

import org.junit.Test;

/**
 * String类基础
 * public final class String implements java.io.Serializable, Comparable< String >, CharSequence
 * 注:
 * 1. final:不可被继承
 * 2. java.io.Serializable:可序列化
 * 3. Comparable< String >:可比较大小
 * <p>
 * private final byte[] value;===>The value is used for character storage.
 */
public class StringBasicTest {
    @Test
    public void test0() {
        String s1 = "abc";  // 字符串(字面量);元空间字符串常量池中(常量池中所有相同的字符串常量被合并,只占用一个空间,从而节约内存)
        for (byte i : s1.getBytes()) {
            System.out.println(i + ":" + (char) i);
        }
        String s2 = "abc";
        System.out.println(s1 == s2);
        s1 = "abcd";  // 数据发生改变后,变量的内存地址发生了改变(不可变数据类型)
        System.out.println(s1 == s2);
    }

    @Test
    public void test1() {
        String s1 = "javaEE";
        String s2 = "javaEE";
        String s3 = new String("javaEE");  // 字符串(new 对象);堆空间中
        String s4 = new String("javaEE");
        System.out.println(s1 == s2);  // ture
        System.out.println(s3 == s4);  // false
        System.out.println("**********************************************");

        StringTestClass stc = new StringTestClass("tom", 12);
        StringTestClass stc1 = new StringTestClass("tom", 12);
        System.out.println(stc.name == stc1.name);  // true

        StringTestClass stc3 = new StringTestClass(new String("jack"), 12);
        StringTestClass stc4 = new StringTestClass(new String("jack"), 12);
        System.out.println(stc3.name == stc4.name);  // false
    }

    @Test
    public void test2() {
        // a,b,c,d,e1字符串常量池中
        String a = "hello";
        final String a1 = "hello";  // 常量(final修饰)
        String b = "world";
        String c = "hello" + "world";
        String d = "helloworld";
        String e1 = a1 + "world";

        // e,f,h堆空间中(变量参与拼接)
        String e = a + "world";
        String f = "hello" + b;
        String h = a + b;

        System.out.println(c == d);   // true
        System.out.println(c == e);   // false
        System.out.println(c == e1);  // true
        System.out.println(c == f);   // false
        System.out.println(c == h);   // false
    }
}


class StringTestClass {
    String name;
    int age;

    public StringTestClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
}