package c_oop;

/**
 * 包装类
 * 基本数据类型      包装类
 * byte            Byte
 * short           Short
 * int             Integer
 * long            Long
 * float           Float
 * double          Double
 * boolean         Boolean
 * char            Character
 */
public class WrapperClasses {
    public static void main(String[] args) {
        // 基本数据类型转换为包装类的过程称为装箱
        Integer in1 = 34;
        Float fl1 = 2.2f;
        Boolean bo1 = true;
        Character c1 = 'A';

        // 包装类变为基本数据类型的过程称为拆箱
        int in11 = in1;
        float fl11 = fl1;
        boolean bo11 = bo1;
        char c11 = c1;

        // 字符串转换为数值类型
        String str1 = "123";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);

        String str2 = "true";
        boolean num2 = Boolean.parseBoolean(str2);
        System.out.println(num2);

        // 数值类型转换为字符串
        System.out.println(Integer.toString(num1));
        System.out.println(Boolean.toString(num2));
    }
}
