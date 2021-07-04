package a_basic;

/**
 * 赋值运算符
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;  // 基本的赋值运运算符
        System.out.println("***************************");

        // +=,-=,/=,*=,%=;(自动进行强制类型转换)
        a += 20.34; // 等价于a = (int)(a + 20.34)
        System.out.println(a);
        System.out.println("***************************");

        short s = 2;
        // s = s + 1;  // 报错:1是int类型数据,故s+1也是int类型数据
        /*
        解决方法如下:
        法1, s = (short)(s+1);
        法2, s += 1;
        */
    }
}
