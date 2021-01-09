package c_oop.method;

/**
 * 可变参数(方法)
 * 格式:paramType…paramName
 *    * paramType表示可变参数的类型
 *    * ...是声明可变参数的标识
 *    * paramName表示可变参数名称
 */
public class VariableParameters {
    public void print(int year, String... names) { // 可变参数位置必须位于最后
        int count = names.length;    // 可变参数元素的个数
        System.out.println("本次参加考试的有" + count + "人，名单如下：");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void main(String[] args) {
        VariableParameters student = new VariableParameters();
        student.print(2018,"张强", "李成", "王勇");
        student.print(2019, new String[]{"段超", "段萌萌"}); // 也可以用数组形式调用
    }
}