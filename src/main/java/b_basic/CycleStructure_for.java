package b_basic;

/**
 * 循环结构:for循环
 */
public class CycleStructure_for {
    public static void main(String[] args) {
        // 计算0到10的数之和
        int sum_i = 0;
        for (int i = 1; i <= 10; i++) {
            sum_i += i;
            System.out.println(i);
        }
        /*
        执行流程:
        1. 初始化:int i = 1
        2. 判断条件:i <= 10
        3. 循环体:sum_i += i; System.out.println(i)
        4. 控制条件:i++
         */
        System.out.println(sum_i);  // sum0=55;i=1~10
        System.out.println("*****************************************");

        int sum_j = 0;
        for (int j = 1; j <= 10; ) {
            sum_j += j;
            System.out.println(j);
            j++;  // 必须有控制条件语句
        }
        /*
        执行流程:
        1. 初始化:int j = 1
        2. 判断条件:i <= 10
        3. 循环体:sum_i += i; System.out.println(i)
        4. 控制条件(循环体内):j++
        注意:3,4可以调换顺序(结果将不同)
        */
        System.out.println(sum_j);  // sum1=55;j=1~10;与上等价
        System.out.println("*****************************************");

        int sum_k = 0;
        for (int k = 1; k <= 10; ) {
            k++;  // k=2~11
            sum_k += k;
            System.out.println(k);
        }
        System.out.println(sum_k);  // sum2=65;错误的计算结果
    }
}
