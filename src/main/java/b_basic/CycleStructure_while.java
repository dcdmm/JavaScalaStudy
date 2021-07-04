package b_basic;

/**
 * 循环结构:while循环
 */
public class CycleStructure_while {
    public static void main(String[] args) {
        // 计算0到100的数之和
        int sum = 0;
        int i = 0;
        while (i <= 100) {
            sum += i;
            i++;  // 必须有控制条件语句
        }
        /*
        执行流程:
        1. 初始化:int i = 0)
        2. 判断条件:i <= 100
        3. 循环体:sum +=i; i++
        4. 控制条件(循环体内):i++
        注意:3,4可以调换顺序(结果将不同)
         */
        System.out.println(i);
        System.out.println(sum);
    }
}
