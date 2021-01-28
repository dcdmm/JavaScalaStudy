package g_container.collection_interface.set_interface;

import org.junit.Test;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Set接口(元素无序,不可重复)
 */
public class SetTest {
    @Test
    public void test0() {
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
        public LinkedHashSet() {
            super(16, .75f, true);
        }

        HashSet(int initialCapacity, float loadFactor, boolean dummy) {
            map = new LinkedHashMap<>(initialCapacity, loadFactor); // 通过LindedHashMap进行存储
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
        Set<Object> set = new HashSet<>();

    }
}
