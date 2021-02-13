package e_JDK5.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 自限定类型
 *
 * @param <T>
 */
public class SelfBounded<T extends Comparable<? super T>> {
    // <T extends Comparable<? super T>> 解释:
    // 1. 将T限定为实现了Comparable接口===>可以进行比较
    // 2. Comparable接口的类型参数为T或T的父类====>扩大范围
    public T min(Collection<T> a) {
        return Collections.min(a); // 要求T所属的类必须有compareTo方法
    }

    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(22);
        objects.add(32);
        objects.add(52);
        objects.add(12);

        SelfBounded<Integer> integerSelfBounded = new SelfBounded<>();
        System.out.println(integerSelfBounded.min(objects));
    }
}


