package f_container.array;

/**
 * 数组常见异常
 * 1. 数组下标越界异常
 * 2. 空指针异常
 */
public class CommonException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // System.out.println(arr[3]); // 数组下标越界异常

        arr = null;
        System.out.println(arr[0]); // 空指针异常
    }
}
