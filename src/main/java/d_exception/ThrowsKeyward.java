package d_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * thorws关键字:将异常抛给方法的调用者处理;main方法也可以使用throws声明抛出异常,此时该异常将交给JVM处理
 */
public class ThrowsKeyward {

    public static void main(String[] args) {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        method3(); // method3已经method1抛出的异常,此时main方法不需要处理该异常
    }

    public static void method3() {
        try {
            method1();
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException {
        method1();
    }

    public static void method1() throws RuntimeException, IOException {
        File file = new File("./src/main/resources/test0.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }
}
