package a_basic;

/**
 * java原始数据类型:
 * byte, short, int(默认整形), long, float, double(默认浮点型), char, boolean
 */
public class DataType {
    public static void main(String[] args) {
        byte b = 10;  // 8bits
        System.out.println(b);
        short s = 50;  // 16bits
        System.out.println(s);
        int i = 520;  // 32bits
        System.out.println(i);
        long l = 1999999999990L;  // 64bits;注:后面需加上L
        System.out.println(l);

        float f = 10.3f;  // 32bits;注:后面需要加上f
        System.out.println(f);
        double d = 10.3;  // 64bits
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean bo = false;
        System.out.println(bo);
    }
}
