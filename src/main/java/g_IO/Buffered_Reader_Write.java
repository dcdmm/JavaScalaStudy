package g_IO;

import java.io.*;

/**
 * 缓冲字符流:默认的缓冲大小是8192字符===>提高读写效率
 * <p>
 * BufferedReader(Reader in);
 * read()
 * read(char cbuf[])
 * read(char cbuf[], int off, int len)
 * <p>
 * BufferedWriter(Writer out)
 * write(String str)
 * write(String str, int off, int len)
 * write(int c)
 * write(char cbuf[])
 * write(char cbuf[], int off, int len)
 * readLine()
 */
public class Buffered_Reader_Write {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File("src/main/resources/test2.txt");
            File file1 = new File("src/main/resources/test3.txt");

            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter(file1);

            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);
//            // 方式一
//            char[] charArr = new char[4];
//            int len;
//            while ((len = bufferedReader.read(charArr)) != -1) {
//                bufferedWriter.write(charArr, 0, len);
//            }

            // 方式二
            String data;
            // A String containing the contents of the line, not including any line-termination characters, or null if the end of the stream has been reached without reading any characters
            while ((data = bufferedReader.readLine()) != null) {
                bufferedWriter.write(data);  // 不包括终止符"\n"
                bufferedWriter.newLine();  // Writes a line separator.
            }
            System.out.println("文件复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
