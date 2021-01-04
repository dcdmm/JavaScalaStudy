package z_common$class$interface;

/**
 * Math类
 */
public class MathClass {
    public static void main(String[] args) {
        double a = 24.5;
        double b = 24.5;
        System.out.println(Math.abs(a)); // 绝对值

        System.out.println(Math.max(a, b)); // 最大值

        System.out.println(Math.min(a, b)); // 最大值

        // 三角函数(acos,asin,atan,cos,sin,tan)
        System.out.println(Math.sin(a));

        System.out.println(Math.sqrt(a)); // a开根号

        System.out.println(Math.pow(a, b)); // a的b次幂

        System.out.println(Math.exp(a)); // e的a次幂

        System.out.println(Math.log(a)); // 自然对数

        System.out.println(Math.log10(a)); // 10为底的对数

        System.out.println(Math.random()); // Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.

        System.out.println(Math.round(2.5)); // 四舍五入(返回值为整数)
    }
}
