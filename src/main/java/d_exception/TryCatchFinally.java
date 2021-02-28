package d_exception;

import org.junit.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * try {
 *      // Code that might generate exceptons
 * } catch(Type1 id1) {
 *      // Handle exceptions of Type1
 * } catch(Type2 id2) {
 *      // Handle exceptions of Type2
 * } catch(Type3 id3) {
 *      // Handle exceptions of Type3
 * }
 * ******可选******
 * finally {
 *      // 无论异常是否被抛出,finally子句总能被执行
 *     // 一般用于释放资源,在IO流操作和数据库操作中会见到
 * }
 */
public class TryCatchFinally {
    @Test
    public void testBasic() {
        String str = "abc";
        try {
            int num = Integer.parseInt(str); // try子句定义的变量为局部变量
            // try子句一旦出现异常,之后的语句将不再被执行
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            System.out.println("____1____");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        /*
        若存在多个catch子句,则:
        1. 某个catch子句捕获到异常时,之后的catch子句将不再进行匹配
        2. 若捕获的多个异常类之间存在父子关系时,捕获异常时必须先捕获子类,后捕获父类
         */
        } catch (NumberFormatException | IndexOutOfBoundsException e) { // 同一个catch子句中可以捕获多个异常类型(不能是子父类关系)
            System.out.println("字符串转换成数字异常和数组索引越界异常");

            // 输出相应的异常信息
            System.out.println(e.getMessage());
            e.printStackTrace(); // 此方式更加详细
        } catch (Exception e) { // 捕获所有类型的异常:通过捕获异常类的基类Exception
            System.out.println("异常");
        }
        System.out.println("____2____");
    }

    @Test
    public void testFinally() {
        FileInputStream fis = null;
        try {
            File file = new File("./src/main/resources/test0.txt");
            fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
