package g_container.collection_interface.list_interface;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List接口(元素有序,且可重复)常见API
 * 增:
 * add(int index, E element)
 * addAll(int index, Collection< ? extends E > c)
 * 删:
 * remove(int index)
 * 改:
 * set(int index, E element)
 * 查:
 * get(int index)
 * indexOf(Object o)
 * lastIndexOf(Object o)
 * 其他:
 * subList(int fromIndex, int toIndex)
 */
public class API_Test {
    @Test
    public void test_add_addAll() {
        List<Object> l0 = new ArrayList<>();
        l0.add(123);
        l0.add(456);
        l0.add("AA");
        l0.add("BB");

        // Inserts the specified element at the specified position in this list
        l0.add(0, "CC");
        System.out.println(l0);

        List<Integer> l1 = Arrays.asList(1, 2, 3);
        // Inserts all of the elements in the specified collection into this list at the specified position
        l0.addAll(0, l1);
        System.out.println(l0);
    }

    @Test
    public void test_get() {
        List<Object> l0 = new ArrayList<>();
        l0.add(123);
        l0.add(456);
        l0.add("AA");
        l0.add("BB");

        // Returns the element at the specified position in this list
        System.out.println(l0.get(0));
        System.out.println(l0.get(1));
        System.out.println(l0.get(2));
    }

    @Test
    public void test_indexOf_lastIndexOf() {
        List<Object> l0 = new ArrayList<>();
        l0.add(123);
        l0.add(456);
        l0.add("AA");
        l0.add("BB");
        l0.add(456);

        // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(l0.indexOf(123));

        // Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element
        System.out.println(l0.lastIndexOf(456));
    }

    @Test
    public void test_remove() {
        List<Object> l0 = new ArrayList<>();
        l0.add(123);
        l0.add(456);
        l0.add("AA");
        l0.add("BB");
        l0.add(456);

        System.out.println(l0);
        // Removes the element at the specified position in this list (optional operation).
        System.out.println(l0.remove(0));
        System.out.println(l0);
    }

    @Test
    public void test_set() {
        List<Object> l0 = new ArrayList<>();
        l0.add(123);
        l0.add(456);
        l0.add("AA");
        l0.add("BB");
        l0.add(456);

        System.out.println(l0);
        // Replaces the element at the specified position in this list with the specified element
        l0.set(0, 99999999);
        System.out.println(l0);
    }

    @Test
    public void subList() {
        List<Object> l0 = new ArrayList<>();
        l0.add(123);
        l0.add(456);
        l0.add("AA");
        l0.add("BB");
        l0.add(456);

        //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        List<Object> l1 = l0.subList(0, 3); // 左闭右开
        System.out.println(l1);
    }
}
