package z_other_class_interface;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparator接口
 *      Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort) to allow precise control over the sort order.
 */
public class ComparatorInterface {
    private String name;
    private int age;

    public ComparatorInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComparatorInterface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        String[] arrString = {"AA", "KK", "BB", "CC", "FF", "ZZ", "EE"};
        // 相比于comparable接口更加灵活(不需要修改类),同时存在时使用Comparator接口进行比较
        Arrays.sort(arrString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*
                若:
                正整数表示object o1大于object o2
                负整数表示object o1小于object o2
                整数0表示object o1等于object o2
                此时Arrays.sort排序后正序输出,相反则逆序输出
                 */
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(arrString));  // 逆序输出
        System.out.println("*****************************************************");

        ComparatorInterface[] arrayci = new ComparatorInterface[4];
        arrayci[0] = new ComparatorInterface("dog", 23);
        arrayci[1] = new ComparatorInterface("cat", 34);
        arrayci[2] = new ComparatorInterface("pig", 12);
        arrayci[3] = new ComparatorInterface("mouse", 66);
        Arrays.sort(arrayci, new Comparator<ComparatorInterface>() {
            @Override
            public int compare(ComparatorInterface o1, ComparatorInterface o2) {
                ComparatorInterface ci1 = (ComparatorInterface) o1;
                ComparatorInterface ci2 = (ComparatorInterface) o2;
                return -ci1.getName().compareTo(ci2.getName());
            }
        });
        System.out.println(Arrays.toString(arrayci));
    }
}
