package a_basic;

/**
 * 基本数据类型之间的转换
 * 数据类型精度大小(注意:[Byte, Short]和Char之间不能自动类型转换):
 * byte-->short-->int-->long-->float-->double
 * char-->int-->long-->float-->double
 */
public class BasicDataTypeConversion {
    public static void main(String[] args) {
        // 自动(隐式)类型转换
        char a = 'a';
        int b = 20;
        // 精度低类型自动提升为精度高类型
        System.out.println(a + b); // char + int --> int

        int c = 223;
        double d = 2.31;
        System.out.println(c + d); // int + double --> double

        short s = 98;
        // char c1 = s; // 报错:java: 不兼容的类型: 从short转换到char可能会有损失

        // 强制类型转换
        double e = 3.1415;
        int f = (int) e; // 必须进行强制类型转换(精度高类型转换为精度低类型)
        System.out.println(f);
    }
}
