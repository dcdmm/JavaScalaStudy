package g_IO;

import java.io.*;

/**
 * InputStreamReader(InputStream in, String charsetName):An InputStreamReader is a bridge from byte streams to character streams
 * read()
 * read(char cbuf[])
 * read(char cbuf[], int off, int len)
 * <p>
 * OutputStreamWriter(OutputStream out, String charsetName):An OutputStreamWriter is a bridge from character streams to byte streams
 * write(String str)
 * write(String str, int off, int len)
 * write(int c)
 * write(char cbuf[])
 * write(char cbuf[], int off, int len)
 */
public class InputStreamReader_OutputStreamWrite {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/test2.txt"));
            FileOutputStream fileOutputStream = new FileOutputStream(new File("src/main/resources/test3.txt"));

            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8"); // 使用UTF-8编码集进行解码(必须与文件编码的字符集相同,否则显示为乱码)
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "gbK"); // 使用gbk编码集进行编码

            char[] charArr = new char[4];
            int len;
            while ((len = inputStreamReader.read(charArr)) != -1) {
                System.out.println(new String(charArr, 0, len));
                outputStreamWriter.write(charArr, 0, len);
            }
            System.out.println("复制完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStreamReader != null)
                    inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStreamWriter != null)
                    outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
