package z_common_class_interface;

import java.math.BigInteger;

/**
 * BigInteger类(Immutable arbitrary-precision integers)
 */
public class BigIntegerClass {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("2345623417234234132314289");  // 字符串构造
        BigInteger bi2 = new BigInteger("987654341234213242341234121");

        System.out.println("加法操作：" + bi2.add(bi1));  // 加法操作
        System.out.println("减法操作：" + bi2.subtract(bi1));  // 减法操作
        System.out.println("乘法操作：" + bi2.multiply(bi1));  // 乘法操作
        System.out.println("除法操作：" + bi2.divide(bi1));  // 除法操作(结果仍为BigInteger)

        /*
        if (bi2 > bi1) {
            return bi2
        } else {
            return bi1
        }
         */
        System.out.println("较大数：" + bi2.max(bi1));

        System.out.println("较小数：" + bi2.min(bi1));
    }
}
