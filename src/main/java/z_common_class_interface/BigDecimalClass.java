package z_common_class_interface;

import org.junit.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal类(Immutable, arbitrary-precision signed decimal numbers)
 */
public class BigDecimalClass {
    @Test
    public void test0() {
        System.out.println(0.1 + 0.2);  // 不精确
        System.out.println(0.3 - 0.1);
        System.out.println(0.2 * 0.1);
        System.out.println(0.3 / 0.1);
    }

    @Test
    public void test1() {
        BigDecimal a = new BigDecimal("0.1");  // 字符串构造
        BigDecimal b = new BigDecimal("0.2");
        BigDecimal c = new BigDecimal("0.3");

        System.out.println(a.add(b));       // 加法操作
        System.out.println(c.subtract(a));  // 减法操作
        System.out.println(b.multiply(a));  // 乘法操作

        BigDecimal d = new BigDecimal("0.23");
        /*
        不同的舍入模式:
        CEILING     Rounding mode to round towards positive infinity.
        DOWN        Rounding mode to round towards zero.
        FLOOR       Rounding mode to round towards negative infinity.
        HALF_DOWN   Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round down.
        HALF_EVEN   Rounding mode to round towards the "nearest neighbor" unless both neighbors are equidistant, in which case, round towards the even neighbor.
        HALF_UP     Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round up.
        UNNECESSARY Rounding mode to assert that the requested operation has an exact result, hence no rounding is necessary.
        UP          Rounding mode to round away from zero.
         */
        System.out.println(a.divide(d,  // a除以b
                30,   // 保留10位有效数字
                RoundingMode.HALF_UP));  // 舍入模式:HALF_EVEN

        /*
        if (a > b) {
            return a
        } else {
            return b
        }
         */
        System.out.println(a.max(b));

        System.out.println(a.min(b));
    }
}
