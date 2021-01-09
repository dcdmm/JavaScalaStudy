package g_container;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 迭代器:Iterator接口
 */
public class IteratorInterface {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList coll0 = new ArrayList();
        coll0.add(123);
        coll0.add("AA");
        coll0.add("BB");
        coll0.add(new String("jack"));

        @SuppressWarnings("rawtypes")
        Iterator iter = coll0.iterator();
        while (iter.hasNext()) { // Returns true if the iteration has more elements.
            Object obj = iter.next(); // Returns the next element in the iteration.
            System.out.println(obj);
        }
    }
}
