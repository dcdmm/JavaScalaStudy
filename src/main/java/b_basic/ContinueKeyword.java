package b_basic;

/**
 * continue关键字
 */
public class ContinueKeyword {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i % 5 == 0) {
                continue; // 跳过本次循环
            }
            for (int j = 1; j <= 2; j++) {
                System.out.println(i * j);
            }
        }
    }
}
