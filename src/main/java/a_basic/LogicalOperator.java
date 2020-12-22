package a_basic;

/**
 * 逻辑运算符:&&;||;!
 */
public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println(true && true); // ture
        System.out.println(true && false);  // false
        System.out.println(false && false);  // false
        System.out.println("*******************************");
        System.out.println(true || true); // ture
        System.out.println(true || false);  // ture
        System.out.println(false || false);  // false
        System.out.println("*******************************");
        System.out.println(!true); // false
        System.out.println(!false);  // ture
    }
}
