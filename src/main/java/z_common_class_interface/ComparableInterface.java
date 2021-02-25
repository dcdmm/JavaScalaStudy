package z_common_class_interface;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Comparable接口
 * Lists (and arrays) of objects that implement this interface can be sorted automatically by Collections.sort (and Arrays.sort).
 */
public class ComparableInterface implements Comparable<ComparableInterface> { // 实现Comparable接口
    private String name;
    private int age;

    public ComparableInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "ComparableInterface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(@NotNull ComparableInterface o) { // 实现compareTo方法;类型与Comparable类型参数一致
        /*
        若:
        正整数表示当前对象大于object o
        负整数表示当前对象小于object o
        整数0表示当前对象等于object o
        此时Arrays.sort排序后正序输出,相反则逆序输出
         */
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
}


class ComparableTest {
    public static void main(String[] args) {
        // String类实现了Comparable接口
        String[] arrString = {"AA", "KK", "BB", "CC", "FF", "ZZ", "EE"};
        Arrays.sort(arrString);
        System.out.println(Arrays.toString(arrString));
        System.out.println("****************************************************");

        ComparableInterface[] arrayci = new ComparableInterface[4];
        arrayci[0] = new ComparableInterface("dog", 23);
        arrayci[1] = new ComparableInterface("cat", 34);
        arrayci[2] = new ComparableInterface("pig", 12);
        arrayci[3] = new ComparableInterface("mouse", 66);
        Arrays.sort(arrayci);
        System.out.println(Arrays.toString(arrayci));
    }
}