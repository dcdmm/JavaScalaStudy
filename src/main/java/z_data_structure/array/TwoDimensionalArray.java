package z_data_structure.array;

/**
 * 二维数组(一维数组的嵌套)
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 8}}; // 创建二维数组对象并初始化初始值
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]); // 二维数组的遍历
            }
        }
        System.out.println("******************************************");

        String[][] arr1 = new String[2][3];
        System.out.println(arr[0]);
        String[][] arr2 = new String[2][];
        System.out.println(arr2[0]); // arr[0]为null
        // System.out.println(arr2[0][0]); // 报错:空指针异常
        arr2[0] = new String[3]; // arr[0]被实例化
        System.out.println(arr2[0]);
        System.out.println(arr2[0][0]);
        System.out.println("******************************************");

        // 动态初始化
        arr1[0] = new String[]{"dc", "dmm", "duanchao"};
        arr1[1][0] = "python";
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]); // 二维数组的遍历
            }
        }
    }
}
