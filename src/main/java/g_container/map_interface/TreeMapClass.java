package g_container.map_interface;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import java.util.*;

/**
 * TreeMap类
 */
public class TreeMapClass {
    @Test
    public void test0() { // Comparable接口进行排序
        TreeMap<Object, Object> tm = new TreeMap<>();
        /*
        比较过程(与相近的两个进行比较;若相同,则使用后面对象的value代替之前对象的value):
        1. tom与tom进行比较===>添加tom的key-value
        *. 此时顺序为[22]
        2. jack与tom比较===>两对象的属性age相等(调用对象的compareTo()方法===>jack.getAge() == tom.getAge()===>两对象相等)===>使用jack的value代替tom的value
        3. rose与tom比较===>两对象age的属性不等===>添加rose的key-value
        * 55和22相比
        *. 此时顺序为[22, 52]
        4. kete与tom比较===>两对象age的属性不等==>kete与rose比较===>两对象age属性不等===>添加kete的key-value
        *. 30和相近的22,52相比
        *. 此时顺序为[22, 30, 52]
        4. duanchao与rose比较===>两对象age属性相等==>使用duanchao的value代替rose的value
        5. dcdmm与kete比较===>两对象age属性不等==>dcdmm与rose比较===>两对象age属性不等===>添加dcdmm的key-value
        *. 82与相近的52,30相比
        *. 此时顺序为[22, 30, 52, 82]
        6. xiaohei与kete比较===>两对象age属性不等==>xiaohei与rose比较===>两对象age属性不等===>添加xiaohei的key-value
        *. 12与相近的22,30相比
        *. 此时顺序为[12, 22, 30, 52, 82]
        6. xiaobai与tom比较===>两对象age属性不等==>xiaobai与xiaohei比较===>两对象age属性不等===>添加xiaobai的key-value
        * 18与相近的12,22相比
        *. 此时顺序为[12, 18, 22, 30, 52, 82]
         */
        tm.put(new TreeMapClassTest("tom", 22), 111);
        tm.put(new TreeMapClassTest("jack", 22), 222);
        tm.put(new TreeMapClassTest("rose", 52), 333);
        tm.put(new TreeMapClassTest("kete", 30), 333);
        tm.put(new TreeMapClassTest("jerry", 52), 444);
        tm.put(new TreeMapClassTest("duanchao", 52), 555);
        tm.put(new TreeMapClassTest("dcdmm", 82), 666);
        tm.put(new TreeMapClassTest("xiaohei", 12), 666);
        tm.put(new TreeMapClassTest("xiaobai", 18), 666);
        Set<Map.Entry<Object, Object>> entries = tm.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test1() {
        TreeMap<Object, Object> tm = new TreeMap<>(new Comparator<Object>() { // Comparator接口进行排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof TreeMapClassTest && o2 instanceof TreeMapClassTest) {
                    TreeMapClassTest s1 = (TreeMapClassTest) o1;
                    TreeMapClassTest s2 = (TreeMapClassTest) o2;
                    return s1.getName().compareTo(s2.getName());
                }
                throw new RuntimeException("类型不一致");
            }
        });
        tm.put(new TreeMapClassTest("tom", 22), 111);
        tm.put(new TreeMapClassTest("jack", 22), 222);
        tm.put(new TreeMapClassTest("rose", 52), 333);
        tm.put(new TreeMapClassTest("kete", 30), 333);
        tm.put(new TreeMapClassTest("jerry", 52), 444);
        tm.put(new TreeMapClassTest("duanchao", 52), 555);
        tm.put(new TreeMapClassTest("dcdmm", 82), 666);
        tm.put(new TreeMapClassTest("xiaohei", 12), 666);
        tm.put(new TreeMapClassTest("xiaobai", 18), 666);
        Set<Map.Entry<Object, Object>> entries = tm.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


@SuppressWarnings("rawtypes")
class TreeMapClassTest implements Comparable {
    private String name;
    private int age;

    public TreeMapClassTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(@NotNull Object o) { // 实现compareTo方法
        System.out.println(this + "  与  " + o + "进行比较!");
        if (o instanceof TreeMapClassTest) {
            TreeMapClassTest ci = (TreeMapClassTest) o;
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