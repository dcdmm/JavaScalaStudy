package f_container.map_interface;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties类(配置文件的操作类)的应用;继承自Hashtable
 */
public class PropertiesClass {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fileInputStream = new FileInputStream("./src/main/resources/testing.properties");
        p.load(fileInputStream);  // Reads a property list (key and element pairs) from the input byte stream.
        String name = p.getProperty("name");  // Searches for the property with the specified key in this property list.
        String age = p.getProperty("age");
        System.out.println("name=" + name + "\n" + "age=" + age);
        System.out.println(p.getProperty("nationality"));
        fileInputStream.close();
    }
}
