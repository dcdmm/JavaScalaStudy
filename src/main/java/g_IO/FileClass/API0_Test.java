package g_IO.FileClass;

import org.junit.Test;
import java.io.File;
import java.util.Date;

/**
 * File类常见API
 */
public class API0_Test {

    @Test
    public void test0() {
        File file0 = new File("./src/main/resources/test0.txt");

        System.out.println(file0.getAbsolutePath()); // 获取绝对路径
        System.out.println(file0.getName()); // Returns the name of the file or directory denoted by this abstract pathname.
        System.out.println(file0.getPath()); // Converts this abstract pathname into a pathname string.
        System.out.println(file0.getParent()); // Returns the pathname string of this abstract pathname's parent, or null if this pathname does not name a parent directory.

        // Returns the length(字节) of the file denoted by this abstract pathname.
        System.out.println(file0.length()); // 若文件不存在,返回0

        System.out.println(new Date(file0.lastModified())); // Returns the time that the file denoted by this abstract pathname was last modified.
    }

    @Test
    public void test_list_listFiles() {
        File file0 = new File("./src/main/resources");
        // Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname.
        String[] list = file0.list();
        for (String i : list) {
            System.out.println(i);
        }

        // Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname.
        File[] files = file0.listFiles();
        for (File i : files) {
            System.out.println(i);
        }
    }

    @Test
    public void test_renameTo() {
        File file0 = new File("./src/main/resources/test0.txt");
        File file1 = new File("./src/main/resources/test0.txt");
        // Renames the file denoted by this abstract pathname.
        boolean b = file0.renameTo(file1); // 必须保证file0存在,而file1不存在
        System.out.println(b);
    }

    @Test
    public void test_exists() {
        File file0 = new File("./src/main/resources/test0.txt");
        System.out.println(file0.exists()); // Tests whether the file or directory denoted by this abstract pathname exists.
    }

    @Test
    public void test_isDirectory_isFile() { // 若该文件或目录不存在,则isDirectory和isFile返回值均为false
        File file0 = new File("./src/main/resources/test0.txt");
        System.out.println(file0.isDirectory()); // Tests whether the file denoted by this abstract pathname is a directory.
        System.out.println(file0.isFile()); // Tests whether the file denoted by this abstract pathname is a normal file.
    }

    @Test
    public void test_canRead_canWrite_Hidden() { // 若该文件不存在,则canRead,canWrite,isHidden返回值均为false
        File file0 = new File("./src/main/resources/test0.txt");
        System.out.println(file0.canRead()); // Tests whether the application can read the file denoted by this abstract pathname.
        System.out.println(file0.canWrite()); // Tests whether the application can modify the file denoted by this abstract pathname.
        System.out.println(file0.isHidden()); // Tests whether the file named by this abstract pathname is a hidden file.
    }
}
