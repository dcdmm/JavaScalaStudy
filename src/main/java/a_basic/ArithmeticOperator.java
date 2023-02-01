package a_basic;

/**
 * 算术运算符
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  // 整数与整数相除仍为整数
        System.out.println(a % b);  // 取余
        System.out.println("**********************************");

        System.out.println(5 / 4);
        System.out.println(5 / 4.0);  // 输出为小数(浮点数参与运算)
        System.out.println("**********************************");

        int c = 'a';  // 字符A的ASCII码是65,a的ASCII码是97
        int d = 10;
        System.out.println(c + d);
        System.out.println("**********************************");

        System.out.println("hello" + "java");  // 字符串的拼接
        // System.out.println("hello"  * 3);  // 报错;python,scala中可以用来表示字符串的重复
        System.out.println("hello" + 100);
        // 运算顺序从左至右;
        System.out.println("hello" + 100 + 200);  // 输出"hello100200"
        System.out.println(100 + 200 + "hello");  // 输出"300hello"

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
