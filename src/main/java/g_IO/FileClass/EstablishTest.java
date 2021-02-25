package g_IO.FileClass;

import org.junit.Test;
import java.io.File;

/**
 * File类的初始化
 */
public class EstablishTest {
    @Test
    public void test0() {
        // Creates a new File instance by converting the given pathname string into an abstract pathname.
        File file0 = new File("./src/main/resources/java.txt"); // 相对路径(Junit Test根目录为src)
        File file1 = new File("E:\\GitHubProjects\\JavaScalaStudy\\src\\main\\resources"); // 绝对路径(windows:\\;unix:/)
    }

    @Test
    public void test1() {
        // Creates a new File instance from a parent pathname string and a child pathname string.
        File file0 = new File("./src/main", "resources");

        // Creates a new File instance from a parent abstract pathname and a child pathname string.
        File file1 = new File(file0, "java.txt");
    }
}
