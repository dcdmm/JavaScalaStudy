package c_oop.method;

/**
 * 重载(方法)
 */
public class Overload {
    public static void main(String[] args) {
        // 不能在方法内定义函数
//        public boolean compare(int a, int b){
//            return a == b;
//        }
        boolean x = new Overload().compare(3, 4);  // 方法的调用
        System.out.println(x);
        boolean y = compare(9, 4, 5);
        System.out.println(y);
        boolean z = compare(3.0, 4.0);
        System.out.println(z);
    }

    public boolean compare(int a, int b) {   // 返回值为boolean
        return a == b;
    }

    // 方法的重载:方法名相同,形式参数不同(与返回值类型无关)
    public static boolean compare(int a, int b, int c) { // 参数个数不同
        return a == (b + c);
    }

    public static boolean compare(double a, double b) { // 参数类型不同
        return a == b;
    }
}
