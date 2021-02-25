package e_JDK5.generics;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型类的继承
 *
 * @param <E>
 * @param <K>
 * @param <V>
 */
public class GenericClassExtend<E, K, V> {
    @Test
    public void test0() {
        // 类A是类B的父类,G<A>与G<B>不存在继承关系===>G<A>不是G<B>的父类
        List<Object> l1 = null;
        List<String> l2 = null;
        // l1 = l2; // 报错,不兼容的类型
    }

    @Test
    public void test1() {
        // 类A是类B的父类===>A<E>是B<E>的父类
        List<String> l1 = new ArrayList<String>();
    }

    public void showE(K e) {
        System.out.println("使用了类型E:" + e);
    }

    public void showK(K k) {
        System.out.println("使用了类型K:" + k);
    }

    public void showV(V v) {
        System.out.println("使用了类型V:" + v);
    }
}


// 全部指定具体类型
class GenericClassExtendSub0 extends GenericClassExtend<String, Integer, Float> {
    public static void main(String[] args) {
        GenericClassExtendSub0 gce = new GenericClassExtendSub0(); // 不再为泛型类
    }
}


// 不指定类型
class GenericClassExtendSub1 extends GenericClassExtend { // 此时等价于:extends GenericClassExtend<Object, Object, Object>
}


// 完全保留
class GenericClassExtendSub2<E, K, V> extends GenericClassExtend<E, K, V> {
}


// 部分保留
class GenericClassExtendSub3<K, V> extends GenericClassExtend<String, K, V> {
}


// 完全保留,又新增
class GenericClassExtendSub4<S, E, K, V> extends GenericClassExtend<E, K, V> {
}


// 部分保留,又新增
class GenericClassExtendSub5<S, K, V> extends GenericClassExtend<String, K, V> {
    public void showS(S s) {
        System.out.println("使用了类型S:" + s);
    }

    public static void main(String[] args) {
        GenericClassExtendSub5<Integer, String, Float> ge = new GenericClassExtendSub5<>();
        ge.showE("dc"); // 指定具体类型String

        ge.showK("dmm"); // 保留
        ge.showV(3.3f); // 保留

        ge.showS(100); // 新增
    }
}


