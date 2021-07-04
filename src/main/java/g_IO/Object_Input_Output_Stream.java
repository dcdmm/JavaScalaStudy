package g_IO;

import org.junit.Test;
import java.io.*;

/**
 * 对象流:ObjectOutputStream(OutputStream out)/ObjectInputStream(InputStream in)
 * Java的对象序列号将那些实现了Serializable接口的对象转换成一个字节序列,并能够在以后将这个字节训序列完全恢复成原来的对象.这一过程甚至可通过网络进行
 * 注意:
 * 1. 实现了Serializable接口类的所有属性必须是可序列化的
 * 2. 被static关键字修饰的成员变量不能被序列化
 * 3. 被transient关键字修饰的成员变量不能被序列化
 * 4.
 */
public class Object_Input_Output_Stream {
    @Test
    public void test0() {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("src/main/resources/test0.dat")));
            // 序列化.可以序列基本数据类型,字节数组,对象
            objectOutputStream.writeInt(23);
            objectOutputStream.writeChar('C');
            objectOutputStream.writeObject(new String("duanmengmengchongya"));
            objectOutputStream.writeObject(new Object_Input_Output_Stream_sub0("dc", 1, 25,
                    new Object_Input_Output_Stream_sub_sub(20000, "master")));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null)
                    objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test1() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/test0.dat"));
            // 反序列化
            // 读取顺序必须与ObjectOutputStream的写入的过程一致
            int i = objectInputStream.readInt();
            System.out.println(i);
            char c = objectInputStream.readChar();
            System.out.println(c);
            Object o = objectInputStream.readObject();
            System.out.println(o);
            Object o1 = objectInputStream.readObject();
            System.out.println(o1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null)
                    objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Object_Input_Output_Stream_sub0 implements Serializable {  // Serializable接口也叫标记型接口

    // Java序列化机制通过在运行时判断类的serialVersionUID常量来验证版本的一致性
    // 如果没有声明serialVersionUID,JVM将使用自己的算法生成默认的SerialVersionUID,最好显式声明
    private static final long serialVersionUID = -2347251470754667710L;

    // 被static和transient关键字修饰的成员变量不能被序列化
    private static String name;
    private transient int id;

    private double age;

    // Object_Input_Output_Stream_sub_sub也必须可序列化
    private Object_Input_Output_Stream_sub_sub sub_sub;

    public Object_Input_Output_Stream_sub0(String name, int id, double age, Object_Input_Output_Stream_sub_sub sub_sub) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sub_sub = sub_sub;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Object_Input_Output_Stream_sub0.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Object_Input_Output_Stream_sub_sub getSub_sub() {
        return sub_sub;
    }

    public void setSub_sub(Object_Input_Output_Stream_sub_sub sub_sub) {
        this.sub_sub = sub_sub;
    }

    @Override
    public String toString() {
        return "Object_Input_Output_Stream_sub0{" +
                "id=" + id +
                ", age=" + age +
                ", sub_sub=" + sub_sub +
                '}';
    }
}


class Object_Input_Output_Stream_sub_sub implements Serializable {
    private static final long serialVersionUID = -6849794754667710L;
    private double payment;
    private String education;

    public Object_Input_Output_Stream_sub_sub(double payment, String education) {
        this.payment = payment;
        this.education = education;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Object_Input_Output_Stream_sub_sub{" +
                "payment=" + payment +
                ", education='" + education + '\'' +
                '}';
    }
}