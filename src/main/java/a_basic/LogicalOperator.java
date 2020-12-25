package a_basic;

/**
 * 逻辑运算符:&&;||;!
 */
public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println(true && true); // true
        System.out.println(true && false);  // false
        System.out.println(false && false);  // false
        System.out.println("*******************************");
        System.out.println(true || true); // true
        System.out.println(true || false);  // true
        System.out.println(false || false);  // false
        System.out.println("*******************************");
        System.out.println(!true); // false
        System.out.println(!false);  // true
    }
}
