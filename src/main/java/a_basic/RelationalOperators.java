package a_basic;

/**
 * 关系运算符
 */
public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a != b); // 不等于
        System.out.println(a > b);  // 大于
        System.out.println(a < b);  // 小于
        System.out.println(a >= b); // 大于等于
        System.out.println(a <= b); // 小于等于
        System.out.println("**********************************************");

        int j = 65;
        int k = 65;
        short s = 65;
        long l = 65L;
        double x = 65.0;
        char y = 65;
        char m = 'A';
        // 基本数据类型:比较变量保存的数据是否相等(类型不一定要求相同)
        System.out.println(j == k);
        System.out.println(j == x);
        System.out.println(j == s);
        System.out.println(j == l);
        System.out.println(j == y);
        System.out.println(j == m);
        System.out.println("**********************************************");

        // 引用数据类型:比较两个对象的地址值是否相同
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(arr1 == arr2); // false

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);  // false
    }
}
