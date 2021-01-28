package g_container.map_interface;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap源码分析
 */
public class LinkdedHashMapClass {
    /**
     * static class Entry< K,V> extends HashMap.Node< K,V> {
     *         Entry< K,V> before, after; // 能够记录添加元素的顺序
     *         Entry(int hash, K key, V value, Node< K,V> next) {
     *             super(hash, key, value, next);
     *         }
     *     }
     *
     * // LindedHashMap重写了HashMap中的newNode方法
     * Node< K,V> newNode(int hash, K key, V value, Node< K,V> e) {
     *      LinkedHashMap.Entry< K,V> p =
     *          new LinkedHashMap.Entry<>(hash, key, value, e);
     *      linkNodeLast(p);
     *      return p;
     * }
     */

    public static void main(String[] args) {
        LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
        lhm.put(123, "AA");
        lhm.put(234, "BB");
        lhm.put(345, "CC");
        lhm.put(456, "DD");
        System.out.println(lhm); // 与添加顺序相同,有序
    }
}
