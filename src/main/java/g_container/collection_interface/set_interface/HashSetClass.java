package g_container.collection_interface.set_interface;

import java.util.HashMap;

/**
 * HashSet源码分析
 */
public class HashSetClass<E> {
    private transient HashMap<E, Object> map;

    // Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();

    public HashSetClass() {
        map = new HashMap<>(); // 通过HashMap进行存储
    }

    public boolean add(E e) {
        return map.put(e, PRESENT) == null; // keyw为e,value为PRESENT
    }
}
