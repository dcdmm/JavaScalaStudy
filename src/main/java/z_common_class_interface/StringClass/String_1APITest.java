package z_common_class_interface.StringClass;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Java String常用API
 */
public class String_1APITest {
    @Test
    public void testBasicDataType() {
        // 基本数据类型转换为字符串
        System.out.println(String.valueOf(2));
        System.out.println(String.valueOf(2L));
        System.out.println(String.valueOf(2.4f));
        System.out.println(String.valueOf(2.4));
        System.out.println(String.valueOf('c'));
    }

    @Test
    public void testarray() throws UnsupportedEncodingException {
        // Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
        String s1 = "duanchao段萌萌";
        byte[] arrbyte0 = s1.getBytes(); // 字节数组(字符集:默认)
        for (byte i : arrbyte0) {
            System.out.println(i + "-->" + (char) i);
        }

        System.out.println();

        // Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.
        byte[] arrbyte1 = s1.getBytes("gbk"); // 字节数组(字符集:gbk)
        for (byte i : arrbyte1) {
            System.out.println(i + "-->" + (char) i);
        }

        System.out.println("********************************************");

        // Converts this string to a new character array.
        char[] arrchar = s1.toCharArray();
        for (char i : arrchar) {
            System.out.println(i);
        }
    }
}
