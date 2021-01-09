package g_container.collection_interface.list_interface;

import java.util.ArrayList;

/**
 * ArrayList源码分析
 *
 * transient Object[] elementData;===>The array buffer into which the elements of the ArrayList are stored.
 * private int size;===>The size of the ArrayList (the number of elements it contains).
 * private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
 * private static final Object[] EMPTY_ELEMENTDATA = {};
 *
 * // 空参构造构造器
 *     public ArrayList() {
 *         this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
 *     }
 *
 * // 指定初始容量的构造器
 *     public ArrayList(int initialCapacity) {
 *         if (initialCapacity > 0) {
 *             this.elementData = new Object[initialCapacity];
 *         } else if (initialCapacity == 0) {
 *             this.elementData = EMPTY_ELEMENTDATA;
 *         } else {
 *             throw new IllegalArgumentException("Illegal Capacity: "+
 *                                                initialCapacity);
 *         }
 *     }
 *
 *
 * // add方法
 *     public boolean add(E e) {
 *         modCount++;
 *         add(e, elementData, size);
 *         return true;
 *     }
 *
 *     private void add(E e, Object[] elementData, int s) {
 *         if (s == elementData.length)
 *             elementData = grow();
 *         elementData[s] = e;
 *         size = s + 1;
 *     }
 *
 *     private Object[] grow() {
 *         return grow(size + 1);
 *     }
 *
 *     private Object[] grow(int minCapacity) {
 *         return elementData = Arrays.copyOf(elementData,
 *                                            newCapacity(minCapacity));
 *     }
 *
 *     private int newCapacity(int minCapacity) {
 *         // overflow-conscious code
 *         int oldCapacity = elementData.length;
 *         int newCapacity = oldCapacity + (oldCapacity >> 1); // 扩容原来容量的1.5倍
 *         if (newCapacity - minCapacity <= 0) {
 *             if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
 *                 return Math.max(DEFAULT_CAPACITY, minCapacity);
 *             if (minCapacity < 0) // overflow
 *                 throw new OutOfMemoryError();
 *             return minCapacity;
 *         }
 *         return (newCapacity - MAX_ARRAY_SIZE <= 0)
 *             ? newCapacity
 *             : hugeCapacity(minCapacity);
 *     }
 */
public class ArrayListClass {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList al = new ArrayList();
    }
}
