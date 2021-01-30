package g_container.array;

import org.junit.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Arrays工具类常见API
 */
public class ArraysAPI {
    @Test
    public void test_asList() {
        String[] arr = {"duan", "chao", "hello", "java"};
        List<String> strings = Arrays.asList(arr); // Returns a fixed-size list backed by the specified array.
        // List<String> strings = Arrays.asList("duan", "chao", "hello", "java"); 与上等价
        System.out.println(strings);
        System.out.println("************************************");
        System.out.println(Arrays.asList(new int[]{1, 2, 3, 4, 5})); // 数据类型为基本数据类型时,应使用其包装类的形式
        System.out.println(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        // System.out.println(Arrays.asList(1, 2, 3, 4, 5)); // 与上等价
    }

    @Test
    public void test_toString() {
        int[] a = {20, 3, 32, 1, 72, 26, 35};
        String s = Arrays.toString(a); // 数组转换为字符串
        System.out.println(s);
    }

    @Test
    public void test_sort() {
        String[] arrString0 = {"AA", "KK", "BB", "CC", "FF", "ZZ", "EE"};
        Arrays.sort(arrString0); // 数组进行排序(默认通过Comparable接口中compareTo()方法进行比较)
        for (String i : arrString0) {
            System.out.println(i);
        }
        System.out.println("************************************************");
        String[] arrString1 = {"AA", "KK", "BB", "CC", "FF", "ZZ", "EE"};
        Arrays.sort(arrString1, new Comparator<String>() { // 数组进行排序(通过Comparator接口中的compare()方法进行比较)
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        for (String i : arrString1) {
            System.out.println(i);
        }
    }
}
