package a_basic;

/**
 * 数据类型大小:
 * byte-->short-->int-->long-->float-->double
 * char-->int-->long-->float-->double
 */
public class TypeConversion {
    public static void main(String[] args) {
        // 自动类型转换
        char a = 'a';
        int b = 20;
        // 小数据类型自动提升为大数据类型
        System.out.println(a + b); // char + int --> int

        int c = 223;
        double d = 2.31;
        System.out.println(c + d); // int + double --> double

        // 强制类型转换
        double e = 3.1415;
        int f = (int) e; // 强制类型转换
        System.out.println(f);
    }
}
