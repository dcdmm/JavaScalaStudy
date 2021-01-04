package z_common$class$interface;

/**
 * System类
 */
public class SystemClass {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        System.out.println("java版本:" + javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("java安装目录:" + javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("操作系统名称:" + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("操作系统版本:" + osVersion);

        String userName = System.getProperty("user.name");
        System.out.println("User's account name:" + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("User's home directory:" + userHome);

        String userDir = System.getProperty("user.dir");
        System.out.println("User's current working directory:" + userDir);
    }
}
