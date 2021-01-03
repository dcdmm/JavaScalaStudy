package z_useful_class.StringClass;

import java.io.UnsupportedEncodingException;

/**
 * String的创建
 */
public class StringEstablish {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str0 = "duanchao"; // 字面量
        System.out.println("str0:" + str0);

        System.out.println("*******************************************");

        // Initializes a newly created String object so that it represents an empty character sequence.
        String str1 = new String(); // 对象(new)
        System.out.println("str1:" + str1);

        System.out.println("*******************************************");

        // Initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string.
        String str2 = new String("duanchao");
        System.out.println("str2:" + str2);

        System.out.println("*******************************************");

        // Allocates a new String so that it represents the sequence of characters currently contained in the character array argument.
        char[] arr = {'d', 'u', 'a', 'n', 'c', 'h', 'a', 'o'};
        String str3 = new String(arr);
        System.out.println("str3:" + str3);

        // Allocates a new String that contains characters from a subarray of the character array argument.
        /*
        Parameters:
            value - Array that is the source of characters
            offset - The initial offset
            count - The length
         */
        String str4 = new String(arr, 0, 3);
        System.out.println("str4:" + str4);

        System.out.println("*******************************************");

        String name = "段萌萌dmm";
        byte[] arrbytedefault = name.getBytes(); // 默认字符集编码
        byte[] arrbytegbk = name.getBytes("gbk"); // gbk字符集编码

        // Constructs a new String by decoding the specified array of bytes using the platform's default charset.
        System.out.println(new String(arrbytedefault)); // 默认字符集解码
        System.out.println(new String(arrbytegbk)); // 乱码(编码集和解码集不一致)

        // Constructs a new String by decoding the specified array of bytes using the platform's default charset.
        System.out.println(new String(arrbytegbk, "utf-8")); // utf-8字符集解码
        System.out.println(new String(arrbytegbk, "gbk")); // gbk字符集解码
    }
}
