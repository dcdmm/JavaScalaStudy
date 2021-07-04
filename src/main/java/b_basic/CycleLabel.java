package b_basic;

/**
 * 带标签的循环(可以让break,continue的使用更加灵活)
 */
public class CycleLabel {
    public static void main(String[] args) {
        // 外层循环的标签:out_b
        out_b:
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i * j == 21) {
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println();
                    break out_b;  // 跳出整个外层循环
                }
            }
        }
        System.out.println("********************");

        out_c:
        for (int j = 0; j <= 10; j++) {
            for (int k = 0; k <= 10; k++) {
                if (j * k == 21) {
                    System.out.println(j);
                    System.out.println(k);
                    System.out.println();
                    continue out_c;  // 跳过本次外层循环
                }
            }
        }
        System.out.println("********************");

        int m = 0;
        while (m <= 10) {
            m++;
            int n = 0;
            // 中间循环的标签:mid_v
            mid_v:
            while (n <= 10) {
                n++;
                int v = 0;
                while (v <= 10) {
                    v++;
                    if (n * m * v == 105) {
                        System.out.println(m);
                        System.out.println(n);
                        System.out.println(v);
                        System.out.println();
                        break mid_v;  // 跳出整个中间循环
                    }
                }
            }
        }
    }
}
