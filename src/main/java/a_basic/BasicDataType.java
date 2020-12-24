package a_basic;

/**
 * java基本数据类型:
 * byte, short, int(默认整形), long, float, double(默认浮点型), char, boolean
 */
public class BasicDataType {
    public static void main(String[] args) {
        byte b = 10;  // 8bits
        System.out.println(b);
        short s = 50;  // 16bits
        System.out.println(s);
        int i = 520;  // 32bits
        System.out.println(i);
        long l = 1999999999990L;  // 64bits;注:后面需加上L
        System.out.println(l);
        float f = 10.331f;  // 32bits;注:后面需要加上f
        System.out.println(f);
        double d = 10.3;  // 64bits
        System.out.println(1.03E-2); // 科学计数法
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean bo = true; // 只能为ture或false
        System.out.println(bo);
    }
}
