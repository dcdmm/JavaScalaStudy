package c_oop;

/**
 * 参数传递(方法)
 * 1. 值传递:实际参数传递值给对应的形式参数,形式参数值的改变不影响实际参数的值
 *      * 适用数据类型范围:boolean,char,byte,short,int,long,float,double,String
 * 2. 引用传递:实际参数传递引用(地址)给相对应的形式参数,形式参数和实际参数共享(堆)内存地址
 *      * 适用数据类型范围:其他所有类型对象
 */
public class ParameterTransfer {
    public static void main(String[] args) {
        int a = 10;
        String s = "duanchao";
        int[] arr = {1, 2, 3};
        change_value(a);
        change_value(s);
        change_quote(arr);
        System.out.println(a); // a不变
        System.out.println(s); // s不变
        for (int i : arr) { // arr对应位置发生改变
            System.out.println(i);
        }
    }

    // 值传递
    public static void change_value(int a) {
        a = a * 999;
    }

    public static void change_value(String s) {
        s = s + "!!!!!!";
    }

    // 引用传递
    public static void change_quote(int[] arr) {
        arr[0] = arr[0] * 999;
    }
}
