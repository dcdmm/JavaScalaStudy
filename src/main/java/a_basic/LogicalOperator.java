package a_basic;

/**
 * 逻辑运算符:&&;||;!
 */
public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println(true && true);  // print->true
        System.out.println(true && false);   // print->false
        System.out.println(false && false);   // print->false
        System.out.println("*******************************");

        System.out.println(true || true);  // print->true
        System.out.println(true || false);   // tprint->rue
        System.out.println(false || false);   // print->false
        System.out.println("*******************************");

        System.out.println(!true);   // print->false
        System.out.println(!false);  // print->true
    }
}
