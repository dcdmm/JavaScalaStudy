package z_data$structure.array;

/**
 * 数组基础知识-1
 */
public class Basic1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        // 动态初始化
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        int[] arr1 = arr; // arr1与arr共享(堆)内存空间
        arr1[2] = 9; // 修改arr1,arr对应位置也发生改变
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
