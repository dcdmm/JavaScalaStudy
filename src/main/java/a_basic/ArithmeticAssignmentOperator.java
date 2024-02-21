package a_basic;

/**
 * 算术运算符/赋值运算符
 */
public class ArithmeticAssignmentOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        // 算数运算符:=,-,*,/,%
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  // 整数与整数相除仍为整数
        System.out.println(a % b);  // 取余

        short s = 1;
        // s = s + 0;  // 报错:1是int类型数据,故s+1也是int类型数据
        /*
        解决方法如下:
        法0(强制类型转换), s = (short)(s+1);
        法1, s += 1;
        */
        System.out.println("**********************************");

        System.out.println(5 / 4);
        System.out.println(5 / 4.0);  // 输出为小数(浮点数参与运算)
        System.out.println("**********************************");

        int c = 'a';  // 字符A的ASCII码是65,a的ASCII码是97
        int d = 10;
        System.out.println(c + d);  // print->107
        System.out.println("**********************************");

        System.out.println("hello" + "java");  // 字符串的拼接
        // System.out.println("hello"  * 3);  // 报错;python,scala中可以用来表示字符串的重复
        System.out.println("hello" + 100);
        // 运算顺序从左至右;
        System.out.println("hello" + 100 + 200);  // print->"hello100200"
        System.out.println(100 + 200 + "hello");  // print->"300hello"

        // 赋值运算符:+=,-=,/=,*=,%=(自动进行强制类型转换)
        a += 20.34; // 即等价于:a = (int)(a + 20.34)
        System.out.println(a);
        System.out.println("***************************");
    }
}
