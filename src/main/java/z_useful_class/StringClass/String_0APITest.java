package z_useful_class.StringClass;

import org.junit.Test;

/**
 * Java字符串常用API
 */
public class String_0APITest {
    @Test
    public void testlength() {
        // Returns the length of this string.
        String s1 = "duan";
        System.out.println(s1.length());
    }

    @Test
    public void testintern() {
        String s0 = new String("A" + "B"); // 创建了4个对象===>1.字符串常量池:"A","B","AB";2.堆空间:String("AB")
        String s1 = new String("duan"); // 创建了2个对象===>1.字符串常量池:"duan";2.堆空间:String("duan")
        String s2 = "duan";
        System.out.println(s1 == s2); // false
        System.out.println(s1.intern() == s2); // 返回字符串常量池中的该字符串(若没有则创建)
    }

    @Test
    public void testcharAt() {
        // Returns the char value at the specified index.
        String s1 = "duan";
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
    }

    @Test
    public void testisEmpty() {
        // Returns true if, and only if, length() is 0.
        String s1 = "duan";
        System.out.println(s1.isEmpty()); // false
        String s2 = "";
        System.out.println(s2.isEmpty()); // true
    }

    @Test
    public void testtoLowerCase_toUpperCase() {
        String s1 = "duan";
        System.out.println(s1.toLowerCase()); // 字符串全部转换为小写
        String s2 = "CHAO";
        System.out.println(s2.toUpperCase()); // 字符串全部转行为大写
    }

    @Test
    public void testtrim() {
        String s1 = "  du an  ";
        System.out.println("****" + s1 + "****");
        System.out.println("****" + s1.trim() + "****"); // 去除字符串首尾空格
    }

    @Test
    public void testequals_equalsIgnoreCase() {
        String s1 = "java";
        String s2 = "JAVA";
        System.out.println(s1.equals(s2)); // 字符串内容是否相等
        System.out.println(s1.equalsIgnoreCase(s2)); // 忽略大小写的情况下,字符串内容是否相等
    }

    @Test
    public void testcompareTo() {
        String s1 = "duan";
        String s2 = "duAn";
        System.out.println(s1.compareTo(s2)); // 按顺序(ASCII码)比较2个字符串
    }

    @Test
    public void testsubstring() {
        String s1 = "duandmm";
        /*
        Parameters:
            beginIndex - the beginning index, inclusive.
            endIndex - the ending index, exclusive.
         */
        System.out.println(s1.substring(2)); // 字符串切片,起始索引为2
        System.out.println(s1.substring(2, 5)); // 字符串切片,起始索引为2(包含),结束索引为5(不包含)
    }

    @Test
    public void testendWith_startwith() {
        String s1 = "duan";
        System.out.println(s1.endsWith("an")); // 字符串"an"是否为字符串s1的后缀
        System.out.println(s1.startsWith("Du")); // s字符串"An"是否为字符串s1的前缀
        System.out.println(s1.startsWith("ua", 1)); // 从索引1开始,s字符串"ua"是否为字符串s1的前缀
    }

    @Test
    public void testcontains() {
        // Returns true if and only if this string contains the specified sequence of char values.
        String s1 = "duanchao";
        System.out.println(s1.contains("anch"));
    }

    @Test
    public void testindexOf() {
        String s1 = "duanduanduan";
        System.out.println(s1.indexOf("lol")); // -1表示字符串未出现
        System.out.println(s1.indexOf("ua")); // 返回字符串"ao"第一次出现处的索引

        // fromIndex - the index to start the search from.
        System.out.println(s1.indexOf("ua", 1 + 1));
        System.out.println(s1.indexOf("ua", 5 + 1));
    }

    @Test
    public void testlastOf() {
        String s1 = "duanduanduan";
        System.out.println(s1.lastIndexOf("lol")); // -1表示字符串未出现
        System.out.println(s1.lastIndexOf("an")); // 返回字符串"an"最后一次出现处的索引

        // the index to start the search from.
        System.out.println(s1.lastIndexOf("an", 8)); // 从后往前找
    }

    @Test
    public void testreplace() {
        String s1 = "duanduan";
        System.out.println(s1.replace('d', 'D')); // 替换字符串中所有的字符'd'为字符'D'
        System.out.println(s1.replace("du", "DU")); // 替换字符串中的所有字符串"du"为字符串"DU"
    }

    @Test
    public void testreplaceAll() {
        String s1 = "12hello34world5java789mysql10python";
        // Replaces each substring of this string that matches the given regular expression with the given replacement.
        System.out.println(s1.replaceAll("\\d+", "数字")); // regex - the regular expression to which this string is to be matched
    }

    @Test
    public void testmatches() {
        String s1 = "123456";
        String s2 = "123456@qq.com";
        System.out.println(s1.matches("\\d+")); // 判断字符串是否与给定的正则表达式匹配
        System.out.println(s2.matches("\\d+"));
    }

    @Test
    public void testsplit() {
        String s1 = "c++|java|python|mysql|c#|go|r|";

        String[] arr = s1.split("\\|");
        for (String i : arr) {
            System.out.println(i);
        }

        System.out.println("**************************************");

        String[] arr1 = s1.split("\\|", 3); // 限制字符串数组的长度不超过limit(3),即最多拆分limit-1次
        for (String i : arr1) {
            System.out.println(i);
        }
    }
}
