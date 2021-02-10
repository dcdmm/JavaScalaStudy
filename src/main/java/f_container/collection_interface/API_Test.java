package f_container.collection_interface;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口常见API
 * 1. List接口通过equlas()方法比较对象
 * 2. Set接口
 *      2.1 HashSet,LinkedHashSet通过equlas()丶hashCode()方法比较对象
 *      2.2 TreeSet通过Comparator接口或Comparable接口比较对象
 *
 * 增:
 * 1. add(E e)
 * 2. addAll(Collection< ? extends E > c)
 * 删:
 * 1. remove(Object o)
 * 2. removeAll(Collection< ? > c)
 * 3. clear()
 * 改:
 * 查:
 * 其他:
 * *. isEmpty()
 * *. size()
 * *. contains(Object o)
 * *. containsAll(Collection< ? > c)
 * *. retainAll(Collection< ? > c)
 * *. equals()
 * *. toArray()
 * *. iterator()
 */
public class API_Test {
    @Test
    public void test_size_add_addAll() {
        Collection<Object> coll0 = new ArrayList<>();
        System.out.println(coll0.size()); // 集合中元素的个数
        coll0.add("AA"); // 集合尾部添加元素
        coll0.add("BB");
        coll0.add("CC");
        coll0.add(123);
        System.out.println(coll0.size());
        System.out.println(coll0);
        System.out.println("**********************************");

        Collection<Object> coll1 = new ArrayList<>();
        coll1.add("DD");
        coll1.addAll(coll0); // Adds all of the elements in the specified collection to this collection
        System.out.println(coll1.size());
        System.out.println(coll1);
    }

    @Test
    public void test_isEmpty_clear() {
        Collection<Object> coll0 = new ArrayList<>();
        System.out.println(coll0.isEmpty()); // 判断集合是否为空
        coll0.add("dcdmm");
        System.out.println(coll0.isEmpty());
        coll0.clear(); // Removes all of the elements from this collection
        System.out.println(coll0.isEmpty());
    }

    @Test
    public void test_contains() {
        Collection<Object> coll0 = new ArrayList<>();
        coll0.add("AA");
        coll0.add("BB");
        coll0.add(123);
        coll0.add(new String("dcdmm"));
        class Person {
            private String name;
            private int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        coll0.add(new Person());
        System.out.println(coll0.contains(123)); // Returns true if this collection contains the specified element.
        System.out.println(coll0.contains(new String("dcdmm")));
        System.out.println(coll0.contains(new Person()));
    }

    @Test
    public void test_containsAll() {
        Collection<String> coll0 = new ArrayList<>();
        coll0.add("AA");
        coll0.add("BB");
        coll0.add("CC");

        Collection<String> coll1 = Arrays.asList("AA", new String("BB"));
        // Returns true if this collection contains the specified element.
        System.out.println(coll0.containsAll(coll1));
    }

    @Test
    public void test_remove_removeAll() {
        Collection<String> coll0 = new ArrayList<>();
        coll0.add("AA");
        coll0.add("BB");
        coll0.add("CC");
        coll0.add("DD");
        coll0.add("EE");
        coll0.add(new String("tom"));
        coll0.add(new String("jack"));

        System.out.println(coll0);
        coll0.remove("AA"); // Removes a single instance of the specified element from this collection, if it is present
        System.out.println(coll0);

        coll0.remove(new String("tom"));
        System.out.println(coll0);

        Collection<String> coll1 = Arrays.asList("DD", "EE", new String("jack"), "FF");
        // 类似数学中的差集运算
        coll0.removeAll(coll1); // Removes all of this collection's elements that are also contained in the specified collection
        System.out.println(coll0);
    }

    @Test
    public void test_retainAll() {
        Collection<String> coll0 = new ArrayList<>();
        coll0.add("AA");
        coll0.add("BB");
        coll0.add("CC");
        coll0.add("DD");
        coll0.add("EE");
        coll0.add(new String("tom"));
        coll0.add(new String("jack"));

        Collection<String> coll1 = Arrays.asList("DD", "EE", new String("jack"), "FF");

        // 类似数学中的交集运算
        coll0.retainAll(coll1);
        System.out.println(coll0);
    }

    @Test
    public void test_equals() {
        ArrayList<String> coll0 = new ArrayList<>();
        coll0.add("AA");
        coll0.add("BB");
        coll0.add(new String("jack"));

        Collection<String> coll1 = Arrays.asList("BB", "AA", new String("jack"));
        // ArrayList:Returns true if and only if the specified object is also a list, both lists have the same size, and all corresponding pairs of elements in the two lists are equal.
        System.out.println(coll0.equals(coll1)); // Compares the specified object with this collection for equality.
    }

    @Test
    public void test_toArray() {
        ArrayList<String> coll0 = new ArrayList<>();
        coll0.add("AA");
        coll0.add("BB");
        coll0.add(new String("jack"));

        Object[] obj = coll0.toArray(); // Returns an array containing all of the elements in this collection.
        for (Object i : obj) {
            System.out.println(i);
        }
    }

    @Test
    public void test_iterator() {
        ArrayList<String> coll0 = new ArrayList<>();
        coll0.add("AA");
        coll0.add("BB");
        coll0.add(new String("jack"));

        Iterator<String> iter = coll0.iterator();
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next()); // Returns an iterator over the elements in this collection.
    }
}
