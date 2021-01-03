package z_useful_class;

import org.junit.Test;

/**
 * StringBuffer/StringBuilder
 * public final class StringBuffer extends AbstractStringBuilder implements java.io.Serializable, Comparable<StringBuffer>, CharSequence
 * public final class StringBuilder extends AbstractStringBuilder implements java.io.Serializable, Comparable<StringBuilder>, CharSequence
 *
 * byte[] value; ===>The value is used for character storage.
 */
public class StringBufferClass {
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
        StringBuffer sb2 = new StringBuffer(40); // 指定容量
        System.out.println(sb2.capacity());
    }

    @Test
    public void testlength_capacity() {
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb.length()); // 长度
        System.out.println(sb.capacity()); // 容量
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
}
