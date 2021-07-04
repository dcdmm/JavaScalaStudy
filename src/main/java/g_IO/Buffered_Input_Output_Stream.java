package g_IO;

import java.io.*;

/**
 * 缓冲字节流:默认的缓冲大小是8192字节,===>提高读写效率
 * <p>
 * BufferedInputStream(InputStream in);继承于FilterInputStream
 * read()
 * read(byte b[])
 * read(byte b[], int off, int len)
 * <p>
 * BufferedOutputStream(OutputStream out);继承于FilterOutputStream
 * write(int b)
 * write(byte b[])
 * write(byte b[], int off, int len)
 */
public class Buffered_Input_Output_Stream {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File("./src/main/resources/test0.png");
            File file1 = new File("./src/main/resources/test2.png");

            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file1);

            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] byteArr = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(byteArr)) != -1) {
                bufferedOutputStream.write(byteArr, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedInputStream != null)
                    bufferedInputStream.close();  // 只需要关闭处理流即可,内部节点流自动关闭
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedOutputStream != null)
                    bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
