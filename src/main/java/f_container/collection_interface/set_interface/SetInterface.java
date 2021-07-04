package f_container.collection_interface.set_interface;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.*;

/**
 * Set接口
 * 1. 无序
 * 2. 不可重复(见HashMapClass.java)
 */
public class SetInterface<E> {
    @Test
    public void test0() {
        /*
        // HashMap源码分析
        private transient HashMap<E, Object> map;

        // Dummy value to associate with an Object in the backing Map
        private static final Object PRESENT = new Object();

        public Hashset() {
            map = new HashMap<>(); // 底层通过HashMap进行存储
        }

        public boolean add(E e) {
            return map.put(e, PRESENT) == null; // keyw为e,value为PRESENT
        }
         */
        Set<Object> set = new HashSet<>();
        set.add(123);
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");
        System.out.println(set);  // 无序(和添加顺序不一致)
    }

    @Test
    public void test1() {
        /*
        // LinkedHashSet源码分析
        public LinkedHashSet() {
            super(16, .75f, true);
        }

        HashSet(int initialCapacity, float loadFactor, boolean dummy) {
            map = new LinkedHashMap<>(initialCapacity, loadFactor);  // 底层通过LindedHashMap进行存储
        }
         */
        Set<Object> set = new LinkedHashSet<>();
        set.add(123);
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");
        System.out.println(set);  // 与添加顺序相同,有序
    }

    @Test
    public void test2() {
        /*
        // TreeSet源码分析
        // Dummy value to associate with an Object in the backing Map
       private static final Object PRESENT = new Object();

        public TreeSet() {
            this(new TreeMap<>());  // 底层通过LindedHashMap进行存储
        }

        public boolean add(E e) {
            return m.put(e, PRESENT)==null;
        }
         */
        TreeSet<SetInterfaceTest> ts = new TreeSet<>();  // Comparator接口进行排序
        ts.add(new SetInterfaceTest("duanchao", 52));
        ts.add(new SetInterfaceTest("jack", 22));
        ts.add(new SetInterfaceTest("tom", 32));
        ts.add(new SetInterfaceTest("jose", 2));
        Iterator<SetInterfaceTest> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("***********************************************************");

        TreeSet<SetInterfaceTest> ts1 = new TreeSet<>(new Comparator<SetInterfaceTest>() {  // Comparator接口进行排序
            @Override
            public int compare(SetInterfaceTest o1, SetInterfaceTest o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });  // Comparator接口进行排序
        ts1.add(new SetInterfaceTest("duanchao", 52));
        ts1.add(new SetInterfaceTest("jack", 22));
        ts1.add(new SetInterfaceTest("tom", 32));
        ts1.add(new SetInterfaceTest("jose", 2));
        Iterator<SetInterfaceTest> iterator1 = ts1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}


class SetInterfaceTest implements Comparable<SetInterfaceTest> {
    private String name;
    private int age;

    public SetInterfaceTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(@NotNull SetInterfaceTest o) { // 实现compareTo方法
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "TreeMapClassTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}