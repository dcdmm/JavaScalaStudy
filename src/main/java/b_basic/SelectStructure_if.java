package b_basic;

/**
 * 条件选择结构:if/else语句
 */
public class SelectStructure_if {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }

        System.out.println("****************************");

        double grade = 42.5;
        if (grade >= 90) {
            System.out.println("成绩很优秀");
        } else if (grade >= 80) {
            System.out.println("成绩还可以");
        } else if (grade >= 70) {
            System.out.println("一般");
        } else if (grade >= 60) {
            System.out.println("刚刚及格");
        } else {
            System.out.println("不及格");
        }
    }
}
