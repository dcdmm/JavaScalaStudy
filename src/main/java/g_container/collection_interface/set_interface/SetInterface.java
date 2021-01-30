package g_container.collection_interface.set_interface;

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
        System.out.println(set); // 无序(和添加顺序不一致)
    }

    @Test
    public void test1() {
        /*
        // LinkedHashSet源码分析
        public LinkedHashSet() {
            super(16, .75f, true);
        }

        HashSet(int initialCapacity, float loadFactor, boolean dummy) {
            map = new LinkedHashMap<>(initialCapacity, loadFactor); // 底层通过LindedHashMap进行存储
        }
         */
        Set<Object> set = new LinkedHashSet<>();
        set.add(123);
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");
        System.out.println(set); // 与添加顺序相同,有序
    }

    @Test
    public void test2() {
        /*
        // TreeSet源码分析
        // Dummy value to associate with an Object in the backing Map
       private static final Object PRESENT = new Object();

        public TreeSet() {
            this(new TreeMap<>()); // 底层通过LindedHashMap进行存储
        }

        public boolean add(E e) {
            return m.put(e, PRESENT)==null;
        }
         */
        TreeSet<Object> ts = new TreeSet<>(); // Comparator接口进行排序
        ts.add(new SetInterfaceTest("duanchao", 52));
        ts.add(new SetInterfaceTest("jack", 22));
        ts.add(new SetInterfaceTest("tom", 32));
        ts.add(new SetInterfaceTest("jose", 2));
        Iterator<Object> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("***********************************************************");

        TreeSet<Object> ts1 = new TreeSet<>(new Comparator<Object>() {  // Comparator接口进行排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof SetInterfaceTest && o2 instanceof SetInterfaceTest) {
                    SetInterfaceTest s1 = (SetInterfaceTest) o1;
                    SetInterfaceTest s2 = (SetInterfaceTest) o2;
                    return s1.getName().compareTo(s2.getName());
                }
                throw new RuntimeException("类型不一致");
            }
        }); // Comparator接口进行排序
        ts1.add(new SetInterfaceTest("duanchao", 52));
        ts1.add(new SetInterfaceTest("jack", 22));
        ts1.add(new SetInterfaceTest("tom", 32));
        ts1.add(new SetInterfaceTest("jose", 2));
        Iterator<Object> iterator1 = ts1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}


@SuppressWarnings("rawtypes")
class SetInterfaceTest implements Comparable {
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
    public int compareTo(@NotNull Object o) { // 实现compareTo方法
        if (o instanceof SetInterfaceTest) {
            SetInterfaceTest ci = (SetInterfaceTest) o;
            return Integer.compare(this.age, ci.age);
        }
        throw new RuntimeException("类型不一致");
    }

    @Override
    public String toString() {
        return "TreeMapClassTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}