package g_container.array;

/**
 * 数组基础知识-0
 * 1. 长度固定
 * 2. 元素的数据类型固定
 */
public class Basic0 {
    public static void main(String[] args) {
        int[] arr0 = new int[3]; // 创建一个可以存储一个4个int型元素的数组
        for (int i = 0; i < arr0.length; i++) { // 通过.length属性获取数组元素个数
            // int类型数据默认值为0
            System.out.println(arr0[i]); // 数组的遍历(通过下标,从0开始)
        }
        System.out.println("***************************************");

        String[] arr1 = new String[3]; // String为引用数据类型
        for (int i = 0; i < arr1.length; i++) {
            // 引用数据类型默认值为null
            System.out.println(arr1[i]);
        }
        System.out.println("***************************************");

        // int[] arr2 = new int[]{2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 5, 6}; // 创建数组对象并初始化初始值(与上等价,类型推断;省略new int[])
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
