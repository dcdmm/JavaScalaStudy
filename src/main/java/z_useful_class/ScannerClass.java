package z_useful_class;

import java.util.Scanner; // 导包

/**
 * Scanner类:从键盘获取输入
 */
public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 对象初始化
        System.out.println("请输入一个整数:");
        int a = sc.nextInt(); // the int scanned from the input
        /*
        short a1 = sc.nextShort(); // Scans the next token of the input as a short.
        long a2 = sc.nextLong(); // Scans the next token of the input as a long.
        float a3 = sc.nextFloat(); // Scans the next token of the input as a float
        double a4 = sc.nextDouble(); // Scans the next token of the input as a double.
        byte a5 = sc.nextByte(); // Scans the next token of the input as a byte.
        */
        System.out.println("请再输入一个整数:");
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
