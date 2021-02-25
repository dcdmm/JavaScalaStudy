package g_IO.FileClass;

import org.junit.Test;
import java.io.File;
import java.io.IOException;

/**
 * File类常见API
 */
public class API1_Test {
    @Test
    public void test_createNewFile_delete() throws IOException {
        File file0 = new File("./src/main/resources/test_createNewFile.txt");
        if (!file0.exists()) {
            boolean create = file0.createNewFile();
            System.out.println(create); // Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
        } else {
            boolean delete = file0.delete(); // 删除目录要求必须该目录必须为空目录
            System.out.println(delete); // Deletes the file or directory denoted by this abstract pathname.
        }
    }

    @Test
    public void test_mkdir() {
        File file0 = new File("./src/main/resources/io/one");
        // Creates the directory named by this abstract pathname.
        boolean mkdir = file0.mkdir();
        System.out.println(mkdir); // io目录不存在,创建失败


        File file1 = new File("./src/main/resources/io/one");
        // Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories.
        boolean mkdirs = file1.mkdirs(); // io目录不存在,一并创建
        System.out.println(mkdirs);
    }
}
