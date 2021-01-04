package z_common$class$interface;

import java.util.Scanner; // 导包

/**
 * Scanner类:从键盘获取输入
 */
public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 对象初始化
        // nextLine()方法的结束符是Enter键,即nextLine()方法返回的是Enter键之前的所有字符串,所以nextLine()方法可以获取到带有空格的字符串
        String str = sc.nextLine();
        System.out.println(str);

        System.out.println("*********************************");

        // next()方法在遇到有效字符前所遇到的空格、tab键、enter键都不能当作结束符,next()方法会自动将其去掉,
        // 只有当next()方法遇到有效字符之后,next()方法才将其后输入的空格键、Tab键或Enter键等视为分隔符或结束符,
        // 所以next()不能得到带有空格的字符串,只能得到部分字符串(空格前面的)。
        String st = sc.next();
        System.out.println(st);

        System.out.println("*********************************");

        int in = sc.nextInt(); // the int scanned from the input
        System.out.println("整数:" + in);
        /*
        short a1 = sc.nextShort(); // Scans the next token of the input as a short.
        long a2 = sc.nextLong(); // Scans the next token of the input as a long.
        float a3 = sc.nextFloat(); // Scans the next token of the input as a float
        double a4 = sc.nextDouble(); // Scans the next token of the input as a double.
        byte a5 = sc.nextByte(); // Scans the next token of the input as a byte.
        */
    }
}
