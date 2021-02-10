package f_container;

import org.junit.Test;
import java.util.*;

/**
 * Collections工具类常见API
 */
public class CollectionsAPI {
    @Test
    public void test_reverse_shuffle() {
        List<Integer> l = new ArrayList<>();
        l.add(234);
        l.add(534);
        l.add(234);
        l.add(24);
        l.add(124);
        System.out.println(l);
        // reverse(List<?> list)===>Reverses the order of the elements in the specified list.
        Collections.reverse(l);
        System.out.println(l);
        System.out.println("********************************");
        // shuffle(List<?> list)===>Randomly permutes the specified list using a default source of randomness.
        Collections.shuffle(l);
        System.out.println(l);
    }

    @Test
    public void test_sort() {
        List<String> l0 = new ArrayList<>();
        l0.add("AA");
        l0.add("KK");
        l0.add("BB");
        l0.add("EE");
        l0.add("DD");
        Collections.sort(l0); // List进行排序(默认通过Comparable接口中compareTo()方法进行比较)
        System.out.println(l0);
        System.out.println("*****************************************");
        List<String> l1 = new ArrayList<>();
        l1.add("AA");
        l1.add("KK");
        l1.add("BB");
        l1.add("EE");
        l1.add("DD");
        Collections.sort(l1, new Comparator<String>() { // List进行排序(通过Comparator接口中的compare()方法进行比较)
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(l1);
    }

    @Test
    public void test_swap() {
        List<String> l = new ArrayList<>();
        l.add("AA");
        l.add("KK");
        l.add("BB");
        l.add("EE");
        l.add("DD");
        System.out.println(l);
        Collections.swap(l, 0, 1);
        System.out.println(l); // Swaps the elements at the specified positions in the specified list.
    }

    @Test
    public void test_min_max() {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(22);
        objects.add(32);
        objects.add(52);
        objects.add(12);
        // min(Collection<? extends T> coll)===>Returns the minimum element of the given collection, according to the natural ordering of its elements.
        // max同理
        System.out.println(Collections.min(objects)); // 默认,通过Comparator接口中的compare()方法进行比较
        System.out.println(Collections.min(objects, new Comparator<Integer>() { // 通过Comparator接口中的compare()方法进行比较
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        }));
    }

    @Test
    public void test_frequency() {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(22);
        objects.add(32);
        objects.add(52);
        objects.add(12);
        objects.add(32);
        // frequency(Collection<?> c, Object o)===>Returns the number of elements in the specified collection equal to the specified object.
        System.out.println(Collections.frequency(objects, 32)); // 32在objects中出现的频率为2
    }

    @Test
    public void test_copy() {
        List<Integer> src = new ArrayList<>();
        src.add(22);
        src.add(32);
        src.add(52);
        src.add(12);
        src.add(32);
        // 	copy(List<? super T> dest, List<? extends T> src)===>Copies all of the elements from one list into another.
        List<Object> dest = Arrays.asList(new Object[src.size()]);
        Collections.copy(dest, src); // 必须保证dest.size()不小于src.size()
        System.out.println(dest);
    }

    @Test
    public void test_replaceAll() {
        List<Integer> src = new ArrayList<>();
        src.add(22);
        src.add(32);
        src.add(52);
        src.add(12);
        src.add(32);
        // replaceAll(List<T> list, T oldVal, T newVal)===>Replaces all occurrences of one specified value in a list with another.
        boolean b0 = Collections.replaceAll(src, 32, 320);
        System.out.println(b0); // 替换成功,所有的32被替换为320
        System.out.println(src);

        boolean b1 = Collections.replaceAll(src, 2, 200);
        System.out.println(b1); // 替换失败
    }

    @Test
    public void test_synchronized() { // 通过synchronized同步代码块
        List<Integer> l = new ArrayList<>();
        l.add(22);
        l.add(32);
        l.add(52);
        l.add(12);
        List<Integer> sl = Collections.synchronizedList(l);// 此时List sl为线程安全

        Set<Integer> h = new HashSet<>();
        h.add(22);
        h.add(32);
        h.add(52);
        Set<Integer> sh = Collections.synchronizedSet(h);// 此时Set sh为线程安全

        Map<Integer, Integer> m = new HashMap<>();
        m.put(11, 1);
        m.put(22, 2);
        m.put(33, 3);
        Map<Integer, Integer> sm = Collections.synchronizedMap(m);// 此时Map sm为线程安全
    }
}
