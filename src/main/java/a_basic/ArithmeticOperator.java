package a_basic;

/**
 * 算法运算符
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 整数与整数相除仍为整数
        System.out.println(a % b); // 取余
        System.out.println("**********************************");
        System.out.println(5 / 4);
        System.out.println(5 / 4.0); // 输出为小数(浮点数参与运算)
        System.out.println("**********************************");
        int c = 'a'; // 字符A的ASCII码是65,a的ASCII码是97
        int d = 10;
        System.out.println(c + d);
        System.out.println("**********************************");
        System.out.println("hello" + "java"); // 字符串的拼接
        System.out.println("hello" + 100);
        // 运算顺序从左至右;
        System.out.println("hello" + 100 + 200); // 输出"hello100200"
        System.out.println(100 + 200 + "hello"); // 输出"300hello"
    }
}
