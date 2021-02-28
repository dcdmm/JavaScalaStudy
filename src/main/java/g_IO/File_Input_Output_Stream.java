package g_IO;

import java.io.*;

/**
 * 字节输入流:FileInputStream(File file)
 * read()
 * read(byte b[])
 * read(byte b[], int off, int len)
 *
 * 字节输出流:FileOutputStream(File file, boolean append)
 * write(int b)
 * write(byte b[])
 * write(byte b[], int off, int len)
 */
public class File_Input_Output_Stream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File("./src/main/resources/test0.png");
            File file1 = new File("./src/main/resources/test1.png");
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1, false);

            byte[] byteArr = new byte[1024]; // byte类型数组
            int len;
            while ((len = fileInputStream.read(byteArr)) != -1) {
                fileOutputStream.write(byteArr, 0, len); // 复制操作
            }
            System.out.println("图片复制成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
