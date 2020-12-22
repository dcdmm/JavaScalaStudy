package a_basic;

/**
 * 赋值运算符
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10; // 基本的赋值运运算符
        System.out.println("***************************");
        a += 20; // +=,-=,/=,*=,%=;(自动进行强制类型转换)
        System.out.println(a);
        System.out.println("***************************");
        short s = 2;
        // s = s + 1; // 报错1是int类型数据,故s+1也是int类型数据
        /*
        解决方法如下:
        1, s = (short)(s+1);
        2, s += 1;
        */
    }
}
