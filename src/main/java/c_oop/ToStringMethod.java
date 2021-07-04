package c_oop;

/**
 * toString方法
 */
public class ToStringMethod {
    public static void main(String[] args) {
        String str = new String("duanchao");
        System.out.println(str.toString());  // 内部重写了toString方法(类似类的还有Date,file,包装类......)
        System.out.println(str);  // 与上等价
        System.out.println("***************************************************");

        ToStringTest s = new ToStringTest("duanchao", 22);
        System.out.println(s.toString());
        System.out.println(s);
    }
}


class ToStringTest {
    private String name;
    private int age;

    public ToStringTest() {
    }

    public ToStringTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写toString方法
    @Override
    public String toString() {
        System.out.println(super.toString());  // (继承自Object类)该字符串由对象为实例的类的名称,符合字符"@"和对象的哈希码的无符号十六进制组成
        return getClass().getName() + "[name=" + name +
                ",age=" + age + "]";
    }
}
