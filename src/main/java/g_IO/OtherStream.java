package g_IO;

import org.junit.Test;
import java.io.*;

/**
 * 其他常见流:
 * 标准I/O流:System.in/System.out/System.err
 * 打印流:PrintStream/PrintWrite
 * 数据流:DataOutputStream/DataInputStream
 */
public class OtherStream {
    public static void main(String[] args) {
        /*
        标准I/O流

        System.in
            public static final InputStream in = null     The "standard" input stream(默认从键盘输入).
        System.out
            public static final PrintStream out = null    The "standard" output stream(默认控制台输出).
        System.err
            public static final PrintStream err = null    The "standard" error output stream.

        static void	setIn(InputStream in)	   Reassigns the "standard" input stream.
        static void	setOut(PrintStream out)	   Reassigns the "standard" output stream.
        static void	setErr(PrintStream err)    Reassigns the "standard" error output stream.
         */
        BufferedReader bufferedReader = null;
        try {
            System.out.println("******从键盘开始获得输入*****");
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String data = bufferedReader.readLine();
                if (data.equals("e") || data.equals("exit")) {
                    System.out.println("程序执行结束!");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test0() {
        /*
        打印流

        PrintStream(OutputStream out)
            参数out:The output stream to which values and objects will be printed
        PrintWriter (Writer out)
         */
        PrintStream printStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("src/main/resources/test1.txt"), true);
            printStream = new PrintStream(fileOutputStream);

            printStream.print(2); // 将2打印到test1.txt中
            printStream.print("duanchao"); // 将"duanchao"打印到test1.txt中
            printStream.print(new char[]{'a', 'b', 'c'});
            printStream.println(2);
            printStream.println("duanchao");
            printStream.println(new char[]{'a', 'b', 'c'});
            printStream.println();

            if (printStream != null) {
                System.setOut(printStream); // 将System.out重定向为printStream.此时通过System.out.print方法将打印数据到test1.txt中
            }
            for (int i = 0; i < 255; i++) {
                System.out.print((char) i);
                if (i % 50 == 0)
                    System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printStream != null) {
                printStream.close();
            }
        }
    }

    @Test
    public void test_DataOutputStream() {
        DataOutputStream dataOutputStream = null;
        try {
            // 数据流,DataOutputStream(OutputStream out):将内存中的数据(基本数据类型,字符串,字节数组)写入到文件中
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File("src/main/resources/test4.txt")));
            dataOutputStream.writeInt(25);
            dataOutputStream.writeChar('A');
            dataOutputStream.writeUTF("duanchao");
            dataOutputStream.writeUTF("duanmengmeng");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataOutputStream != null)
                    dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test_DataInputStream() {
        DataInputStream dataInputStream = null;
        try {
            // 数据流,DataInputStream(InputStream in):将文件中的数据(基本数据类型,字符串,字节数组)读出到内存中
            dataInputStream = new DataInputStream(new FileInputStream("src/main/resources/test4.txt"));
            int str = dataInputStream.readInt();
            char c = dataInputStream.readChar();
            String s0 = dataInputStream.readUTF();
            String s1 = dataInputStream.readUTF();

            // 读取顺序必须与DataOutputStream的写入的过程一致
            System.out.println(str); // 25
            System.out.println(c); // 'A'
            System.out.println(s0); // "duanchao"
            System.out.println(s1); // "duanmengmeng"
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataInputStream != null)
                    dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
