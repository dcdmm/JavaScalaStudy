package f_container.map_interface;

import org.junit.Test;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map接口(存放key-value类型数据)常见API
 * 增:
 * 1. put(K key, V value)
 * 2. putAll(Map<? extends K,? extends V> m)
 * 删:
 * 1. remove(Object key)
 * 2. clear()
 * 改:put(K key, V value)
 * 查:get(Object key)
 * 其他:
 * *. isEmpty()
 * *. size()
 * *. keySet()
 * *. values()
 * *. entrySet()
 * *. equals(Object o)
 * *. containsKey(Object key)
 * *. containsValues(Object key)
 */
public class API_Test {
    @Test
    public void test_put_putAll() {
        Map<Object, Object> map = new HashMap<>();
        map.put("AA", 123);  // Associates the specified value with the specified key in this map
        map.put("BB", 123);
        map.put("CC", 123);
        map.put("DD", 123);
        map.put("AA", 234);
        System.out.println(map);

        Map<Object, Object> map1 = new HashMap<>();
        map1.put("EE", 123);
        map1.putAll(map);  // Copies all of the mappings from the specified map to this map
        System.out.println(map1);
    }

    @Test
    public void test_remove() {
        Map<Object, Object> map = new HashMap<>();
        map.put("BB", 123);
        map.put("CC", 123);
        map.put("DD", 123);
        map.put("AA", 234);
        System.out.println(map);
        map.remove("CC");  // Removes the mapping for a key from this map if it is present
        System.out.println(map);
    }

    @Test
    public void test_clear() {
        Map<Object, Object> map = new HashMap<>();
        map.put("BB", 123);
        map.put("CC", 123);
        map.put("DD", 123);
        map.put("AA", 234);
        System.out.println(map);
        map.clear();
        System.out.println(map);  // Removes all of the mappings from this map
        System.out.println(map.size());
    }

    @Test
    public void test_get() {
        Map<Object, Object> map = new HashMap<>();
        map.put("BB", 123);
        map.put("CC", 123);
        map.put("DD", 123);
        map.put("AA", 234);
        System.out.println(map.get("BB"));  // Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
        System.out.println(map.get("ee"));  // null
    }

    @Test
    public void test_containsKey_containsValues() {
        Map<Object, Object> map = new HashMap<>();
        map.put("BB", 123);
        map.put("CC", 123);
        map.put("DD", 123);
        map.put("AA", 234);
        System.out.println(map.containsKey("BB"));  // Returns true if this map contains a mapping for the specified key.
        System.out.println(map.containsKey("bb"));
        System.out.println(map.containsValue(123));  // Returns true if this map maps one or more keys to the specified value.
    }

    @Test
    public void test_size_isEmpty() {
        Map<String, Integer> map = new HashMap<>();
        map.put("BB", 123);
        map.put("CC", 123);
        map.put("DD", 123);
        map.put("AA", 234);
        System.out.println(map.size());     // Returns the number of key-value mappings in this map.
        System.out.println(map.isEmpty());  // Returns true if this map contains no key-value mappings.
    }

    @Test
    public void test_equals() {
        Map<Object, Integer> map = new HashMap<>();
        map.put("BB", 123);
        map.put("CC", 123);
        map.put("DD", 123);

        Map<Object, Object> map1 = new HashMap<>();
        map1.put("BB", 123);
        map1.put("CC", 123);
        map1.put(new String("DD"), 123);

        System.out.println(map.equals(map1));  // Compares the specified object with this map for equality.
    }

    @Test
    public void test_keySet_values() {
        Map<Object, Object> map = new HashMap<>();
        map.put("BB", 123);
        map.put("CC", 234);
        map.put("DD", 456);
        map.put("AA", 567);
        Set<Object> set = map.keySet();  // Returns a Set view of the keys contained in this map.
        System.out.println(set);

        Collection<Object> values = map.values();  // Returns a Collection view of the values contained in this map.
        System.out.println(values);
    }

    @Test
    public void test_entrySet() {
        Map<Object, Object> map = new HashMap<>();
        map.put("BB", 123);
        map.put("CC", 234);
        map.put("DD", 456);
        map.put("AA", 567);
        Set<Map.Entry<Object, Object>> entries = map.entrySet();  // Returns a Set view of the mappings contained in this map.
        System.out.println(entries);
        for (Map.Entry<Object, Object> i : entries) {
            System.out.println(i);
            System.out.println("key=" + i.getKey() + ";value=" + i.getValue());
        }
    }
}


