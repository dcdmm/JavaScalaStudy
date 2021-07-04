package b_basic;

/**
 * 循环结构:do while循环
 */
public class CycleStructure_do_while {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;  // 必须有控制条件语句
        } while (i <= 100);
        /*
        执行流程:
        1. 初始化:int i = 1
        2. 循环体:sum += i
        3. 控制条件(循环体内):i++
        4. 判断条件:i <= 100
        注:
        * 2,3可以调换顺序(结果将不同)
        * do while 循环体最少执行一次
         */
        System.out.println(i);
        System.out.println(sum);
    }
}
