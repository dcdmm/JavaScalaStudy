package g_container.collection_interface.list_interface;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ArrayList源码分析(动态数组实现;随机访问get和set效率较高)
 * ArrayList(线程不安全)<===>Vector中方法大多被synchronized关键字修饰(线程安全)
 */
public class ArrayListClass<E> {
    // The array buffer into which the elements of the ArrayList are stored
    transient Object[] elementData;

    private int size;

    // Shared empty array instance used for default sized empty instances
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    // Shared empty array instance used for empty instances
    private static final Object[] EMPTY_ELEMENTDATA = {};

    // The number of times this list has been <i>structurally modified
    protected transient int modCount = 0;

    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    // 空参构造器
    public ArrayListClass() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    // 指定初始容量的构造器
    public ArrayListClass(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    public boolean add(E e) {
        modCount++;
        add(e, elementData, size);
        return true;
    }

    private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length)
            elementData = grow();
        elementData[s] = e;
        size = s + 1;
    }

    private Object[] grow() {
        return grow(size + 1);
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData,
                newCapacity(minCapacity));
    }

    private int newCapacity(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1); // 扩容原来容量的1.5倍
        if (newCapacity - minCapacity <= 0) {
            if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
                return Math.max(DEFAULT_CAPACITY, minCapacity);
            if (minCapacity < 0) // overflow
                throw new OutOfMemoryError();
            return minCapacity;
        }
        return (newCapacity - MAX_ARRAY_SIZE <= 0)
                ? newCapacity
                : hugeCapacity(minCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE)
                ? Integer.MAX_VALUE
                : MAX_ARRAY_SIZE;
    }


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(); // 底层通过数组实现
    }
}
