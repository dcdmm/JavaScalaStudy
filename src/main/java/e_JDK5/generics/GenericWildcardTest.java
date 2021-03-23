package e_JDK5.generics;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 通配符的使用(结合多态理解)
 */
public class GenericWildcardTest {
    public void print0(List<?> list) { // 无限定通配符:任何类型;List<E>的父类
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next(); // 可以进行读取
            System.out.println(next);
        }

        // list.add(new GenericWildcardPerson()); // 报错,不兼容的类型
        list.add(null); // 只能添加null
    }

    public void print1(List<? extends GenericWildcardPerson> list) { // GenericWildcardPerson或GenericWildcardPerson的子类型
        Iterator<? extends GenericWildcardPerson> iterator = list.iterator();
        while (iterator.hasNext()) {
            GenericWildcardPerson next = iterator.next(); // 可以进行读取;此时类型可收缩为GenericWildcardPerson
            System.out.println(next);
        }

        list.add(null); // 只能添加null
    }

    public void print2(List<? super GenericWildcardPerson> list) { // 超类型限定符:GenericWildcardPerson或GenericWildcardPerson的父类型
        Iterator<? super GenericWildcardPerson> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next(); // 可以进行读取
            System.out.println(next);
        }

        list.add(null);
        // 还可以添加GenericWildcardPerson或GenericWildcardPerson的子类
        list.add(new GenericWildcardStudent());
        list.add(new GenericWildcardPerson());
    }

    @Test
    public void test0() {
        List<Object> list0 = new ArrayList<>();
        list0.add(new Object());
        List<GenericWildcardPerson> list1 = new ArrayList<>();
        list1.add(new GenericWildcardPerson());
        List<GenericWildcardStudent> list2 = new ArrayList<>();
        list2.add(new GenericWildcardStudent());

        print0(list0);
        print0(list1);
        print0(list2);
    }

    @Test
    public void test1() {
        List<Object> list0 = new ArrayList<>();
        list0.add(new Object());

        List<GenericWildcardPerson> list1 = new ArrayList<>();
        list1.add(new GenericWildcardPerson());

        List<GenericWildcardStudent> list2 = new ArrayList<>();
        list2.add(new GenericWildcardStudent());

        // print1(list0); // 报错,不兼容的类型===>Object为GenericWildcardPerson的父类
        print1(list1);
        print1(list2);
    }

    @Test
    public void test2() {
        List<Object> list0 = new ArrayList<>();
        list0.add(new Object());

        List<GenericWildcardPerson> list1 = new ArrayList<>();
        list1.add(new GenericWildcardPerson());

        List<GenericWildcardStudent> list2 = new ArrayList<>();
        list2.add(new GenericWildcardStudent());

        print2(list0);
        print2(list1);
        // print2(list2); // 报错,不兼容的类型===>GenericWildcardStudent为GenericWildcardPerson的子类
    }
}


class GenericWildcardPerson {

}


class GenericWildcardStudent extends GenericWildcardPerson {

}
