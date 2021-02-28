package g_IO;

import org.junit.Test;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输入流: FileReader(File file)
 * read()
 * read(char cbuf[])
 * read(char cbuf[], int offset, int length)
 *
 * 字符输出流:FileWriter(File file, boolean append)
 * write(String str)
 * write(String str, int off, int len)
 * write(int c)
 * write(char cbuf[])
 * write(char cbuf[], int off, int len)
 */
public class File_Reader_Write {
    @Test
    public void test_Reader0() {
        FileReader fileReader = null;
        try {
            File file = new File("./src/main/resources/test0.txt");
            fileReader = new FileReader(file);
            int read = fileReader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileReader.read(); // The character read, or -1 if the end of the stream has been reached
            }
        } catch (IOException e) { // IOException为编译时异常
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close(); // 流的关闭操作(必须也使用try/catch进行包裹)
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test_Reader1() {
        FileReader fileReader = null;
        try {
            File file = new File("./src/main/resources/test0.txt");
            fileReader = new FileReader(file);
            char[] charArr = new char[4]; // char类型数组
            int len;
            /*
             * Reads characters into an array.  This method will block until some input
             * is available, an I/O error occurs, or the end of the stream is reached.
             *
             * @param       cbuf  Destination buffer
             *
             * @return      The number of characters read, or -1
             *              if the end of the stream
             *              has been reached
             *
             * @exception   IOException  If an I/O error occurs
             */
            // 写法一:
            while ((len = fileReader.read(charArr)) != -1) { // len===>每次读取的字符个数
                for (char i = 0; i < len; i++) { // 错误的写法===>for (char i = 0; i < charArr.length; i++)
                    System.out.print(charArr[i]);
                }
            }

            // 写法二:
            // String s = new String(charArr, 0, len);
            // System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test_Writer() {
        FileWriter fileWriter = null;
        try {
            File file = new File("./src/main/resources/test2.txt");

            /*
             * 1. 若file对象对应的文件不存在,则创建该文件
             * 2. 若file对象对应的文件存在;if append=true, then bytes will be written to the end of the file rather than the beginning
             */
            fileWriter = new FileWriter(file, false);
            fileWriter.write("i love python\ni love python\n"); // Writes a string
            fileWriter.write(new char[]{'a', 'b', 'c', 'd', '\n'}); // Writes an array of characters.
            fileWriter.write(new char[]{'e', 'f', 'g', 'h', '\n'}, 0, 3); // Writes a portion of an array of characters.
            fileWriter.write(65); // Writes a single character.
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
