package b_basic;

/**
 * break关键字
 */
public class BreakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i * j == 21) {
                    System.out.println(i);
                    System.out.println(j);
                    break;  // 跳出当前整个循环
                }
            }
        }
    }
}
