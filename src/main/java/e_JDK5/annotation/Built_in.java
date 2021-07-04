package e_JDK5.annotation;

import java.util.ArrayList;

/**
 * 内置注解
 */
public class Built_in {
    public static void main(String[] args) {
        /*
        "all":抑制所有警告
        "unused":抑制没被使用过的代码的警告
        "rawtypes":to suppress warnings relative to un-specific types when using generics on class params
         */
        // 关闭不当的编译器警告信息
        @SuppressWarnings("unused")  // 抑制单类型警告;
        int num = 10;
        @SuppressWarnings({"unused", "rawtypes"})  // 抑制多类型的警告
        ArrayList alst = new ArrayList();
    }

    public void show() {
        System.out.println("父类show()方法");
    }

    // 使用@Deprecated的元素,编译器会发出警告信息
    @Deprecated
    public void show1() {
        System.out.println("Deprecated!!!");
    }
}


class SubBuilt_in extends Built_in {
    // 覆盖超类中的方法,如果拼接错误,或方法签名对不上被覆盖的方法,编译器就会发出错误提示
    @Override
    public void show() {
        System.out.println("子类show()方法");
    }
}