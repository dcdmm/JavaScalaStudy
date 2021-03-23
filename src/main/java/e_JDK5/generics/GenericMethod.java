package e_JDK5.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型方法
 * *. 泛型方法可以定义在普通类中,也可以定义在泛型类中
 * *. 泛型方法可以声明为静态的
 *
 * @param <E>
 */
public class GenericMethod<E> {
    // 普通泛型方法:方法形参类型参数和泛型类类型参数相同
    public List<E> copyOf_(E[] arr) {
        ArrayList<E> al = new ArrayList<>();
        for (E i : arr) {
            al.add(i);
        }
        return al;
    }

    /*
    泛型方法:方法形参类型参数和泛型类类型参数参数不同
    格式:修饰符 <方法形参类型参数> 返回值 方法名(形参类型 形参)
     */
    public <V> List<V> copyOf(V[] arr) {
        ArrayList<V> al = new ArrayList<>();
        for (V i : arr) {
            al.add(i);
        }
        return al;
    }

    public static void main(String[] args) {
        GenericMethod<String> gm = new GenericMethod<>();
        List<Integer> integers = gm.copyOf(new Integer[]{1, 2, 3, 4});
        System.out.println(integers);
        System.out.println("**********************************************");

        GenericMethod<Integer> gm_ = new GenericMethod<>();
        List<Integer> integers_ = gm_.copyOf_(new Integer[]{1, 2, 3, 4});
        System.out.println(integers_);
    }
}
