package z_common_class_interface;

import org.junit.Test;

/**
 * 字符串:StringBuffer/StringBuilder
 * 区别:StringBuffer类线程安全(更快),所有public方法都被synchronized关键字修饰;StringBuilder类线程不安全
 * public final class StringBuffer extends AbstractStringBuilder implements java.io.Serializable, Comparable<StringBuffer>, CharSequence
 * public final class StringBuilder extends AbstractStringBuilder implements java.io.Serializable, Comparable<StringBuilder>, CharSequence
 * byte[] value; ===>The value is used for character storage.
 */
public class StringBuffer_StringBuilderClass { // StringBuilder类同理
    @Test
    public void testConstructors() {
        /*
        Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
        public StringBuffer() {
            super(capacity:16);
        }
         */
        StringBuffer sb0 = new StringBuffer();

        /*
        Constructs a string buffer initialized to the contents of the specified string.
        public StringBuffer(String str) {
            super(capacity:str.length() + 16);
            append(str);
        }
         */
        StringBuffer sb1 = new StringBuffer("abc");

        /*
        Constructs a string buffer with no characters in it and the specified initial capacity.
        public StringBuffer(int capacity) {
            super(capacity);
        }
         */
        StringBuffer sb2 = new StringBuffer(40); // 指定初始容量为40
        System.out.println(sb2.capacity());
    }

    @Test
    public void testlength_capacity() {
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb.length()); // 当前长度
        System.out.println(sb.capacity()); // 当前容量
    }

    @Test
    public void testappend() {
        StringBuffer sb = new StringBuffer();

        sb.append(1); // Appends the string representation of the int argument to this sequence.
        System.out.println(sb);

        sb.append(9.9); // Appends the string representation of the double argument to this sequence.
        System.out.println(sb);

        sb.append('a'); // Appends the string representation of the char argument to this sequence.
        System.out.println(sb);

        sb.append("duan"); // appends the specified string to this character sequence.
        System.out.println(sb);

        char[] arrchar = {'c', 'h', 'a', 'o'};
        sb.append(arrchar); // Appends the string representation of the char array argument to this sequence.
        System.out.println(sb);

        /*
        offset - the index of the first char to append.
        len - the number of chars to append.
         */
        sb.append(arrchar, 0, 4);

        /*
        扩容机制:
        private void ensureCapacityInternal(int minimumCapacity) {
            // overflow-conscious code
            int oldCapacity = value.length >> coder;
            if (minimumCapacity - oldCapacity > 0) {
                value = Arrays.copyOf(value,
                         newCapacity(minimumCapacity) << coder); // 复制原有数组中的元素到新的数组中并重新设定长度
            }
        }

        private int newCapacity(int minCapacity) {
            // overflow-conscious code
            int oldCapacity = value.length >> coder;
            int newCapacity = (oldCapacity << 1) + 2; // 默认扩容为原来容量的2倍+2
            if (newCapacity - minCapacity < 0) {
                newCapacity = minCapacity;
        }
        int SAFE_BOUND = MAX_ARRAY_SIZE >> coder;
        return (newCapacity <= 0 || SAFE_BOUND - newCapacity < 0)
            ? hugeCapacity(minCapacity)
            : newCapacity;
        }
         */
    }

    @Test
    public void testdelete() {
        StringBuffer sb = new StringBuffer("DUANCHAO");
        /*
        start - The beginning index, inclusive.
        end - The ending index, exclusive.
         */
        sb.delete(0, 2); // Removes the characters in a substring of this sequence.
        System.out.println(sb);
    }

    @Test
    public void testreplace() {
        StringBuffer sb = new StringBuffer("DUANCHAO");
        /*
        start – The beginning index, inclusive.
        end – The ending index, exclusive.
         */
        sb.replace(0, 1, "hello"); // Replaces the characters in a substring of this sequence with characters in the specified String.
        System.out.println(sb);
    }

    @Test
    public void testinsert() {
        StringBuffer sb = new StringBuffer("DUANCHAO");
        // 指定位置插入数据
        sb.insert(1, 1); //  inserts the string representation of the second int argument into this sequence.
        sb.insert(1, 9.9); // Inserts the string representation of the double argument into this sequence.
        sb.insert(1, 'a'); // Inserts the string representation of the char argument into this sequence.
        sb.insert(1, "**FALSE**"); // Inserts the string into this character sequence.
        char[] arrchar = {'c', 'h', 'a', 'o'};
        sb.insert(1, arrchar); // Inserts the string representation of the char array argument into this sequence.
        sb.insert(1, arrchar, 0, 4); // Inserts the string representation of a subarray of the str array argument into this sequence
        System.out.println(sb);
    }

    @Test
    public void testreverse() {
        StringBuffer sb = new StringBuffer("duanchao");
        sb.reverse(); // Causes this character sequence to be replaced by the reverse of the sequence.
        System.out.println(sb);
    }

    @Test
    public void testindexof() {
        StringBuffer sb = new StringBuffer("duanduan");
        System.out.println(sb.indexOf("ua")); // 返回字符串"ua"第一次出现处的索引
        // fromIndex – the index from which to start the search.
        System.out.println(sb.indexOf("ua", 3)); // 返回字符串"ua"第一次出现处的索引
    }

    @Test
    public void testsubString() {
        StringBuffer sb = new StringBuffer("duandmm");
        System.out.println(sb.substring(2)); // 字符串切片,起始索引为2
        System.out.println(sb.substring(2, 5)); // 字符串切片,起始索引为2(包含),结束索引为5(不包含)
    }

    @Test
    public void testCharAt() {
        StringBuffer sb = new StringBuffer("duandmm");
        System.out.println(sb.charAt(0)); // Returns the char value in this sequence at the specified index.
        System.out.println(sb.charAt(1));
        System.out.println(sb.charAt(2));
    }

    @Test
    public void testsetCharAt() {
        StringBuffer sb = new StringBuffer("duandmm");
        sb.setCharAt(0, 'A'); // The character at the specified index is set to ch.
        System.out.println(sb);
    }

    @Test
    public void testtoString() {
        StringBuffer sb = new StringBuffer("hello python");
        String str = sb.toString(); // StringBuffer转换为String
        System.out.println(str);
    }
}
