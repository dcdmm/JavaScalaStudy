package c_oop;

import org.jetbrains.annotations.NotNull;

/**
 * 内部类-1
 * * 局部内部类(类似局部变量):不仅能够访问包含它们的外部类,还可以访问局部变量
 */
public class InnerClass_1 {
    String name = "dc";

    public Comparable<Object> gegComparable() {
        // 局部变量
        int age = 100;  // 基本数据类型:不能被内部类修改
        final int[] payment = {30000};  // 引用数据类型:不能被内部类修改其地址,但仍可以修改其内容

//        class MyComparable implements Comparable<Object> {  // 局部内部类
//            @Override
//            public int compareTo(@NotNull Object o) {
//                return 0;
//            }
//        }
//
//        return new MyComparable();

        return new Comparable<Object>() {
            @Override
            public int compareTo(@NotNull Object o) {
                System.out.println(name);
                name = "duanchao";  // 可以被修改
                System.out.println(name);
                System.out.println(age);
                // age = 10000;  // 报错
                System.out.println(payment[0]);
                payment[0] = 10000000;  // 不再报错
                System.out.println(payment[0]);
                return 0;
            }
        }; // 匿名内部类;与上代码等价
    }

    public static void main(String[] args) {
        InnerClass_1 ic1 = new InnerClass_1();
        Comparable<Object> objectComparable = ic1.gegComparable();
        objectComparable.compareTo("dc");
    }
}
