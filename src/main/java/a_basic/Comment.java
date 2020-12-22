package a_basic;

/**
 * 类注释:import语句之后,类定义之前
 * @author 创建人
 * @version 版本
 */
public class Comment {
    public static void main(String[] args) {
        /*
        多行注释
        多行注释
        多行注释
         */
        String result = output("2020"); // 单行注释
        System.out.println(result);
    }

    /**
     * 函数注释:所描述的方法之前
     *
     * @param year 变量描述
     * @return return描述
     */
    public static String output(String year) {
        String out = "Now is:" + year;
        return out;
    }
}
