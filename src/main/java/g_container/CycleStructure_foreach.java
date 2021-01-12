package g_container;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循环:foreach
 */
public class CycleStructure_foreach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) { // 遍历数组
            System.out.println(i);
        }
        System.out.println("**************************");

        @SuppressWarnings("rawtypes")
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("tom");
        coll.add("jack");
        for (Object i : coll) { // 遍历集合
            System.out.println(i);
        }
    }
}