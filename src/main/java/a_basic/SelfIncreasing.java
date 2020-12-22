package a_basic;

/**
 * 自加,自减
 */
public class SelfIncreasing {
    public static void main(String[] args) {
        int a = 5; a++; // 自增+1;自减(--)类似
        int b = 5; ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("******************************************");
        int c = 5;
        int d = c++; // 先赋值后自增,故c=6,d=5
        System.out.println(c);
        System.out.println(d);
        System.out.println("******************************************");
        int e = 5;
        int f = ++e; // 先自增后赋值,故e=f=6
        System.out.println(e);
        System.out.println(f);
    }
}
