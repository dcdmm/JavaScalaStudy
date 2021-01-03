import org.junit.Test;

/**
 * 单元测试:方法可以独立测试
 */
public class junitTest { // 类修饰符必须为public

    // 测试方法上必须使用@Test(或其他注解)进行修饰
    @Test
    public void testEquals() { // 必须使用public void 进行修饰;且无形参
        String s1 = new String("duanchao");
        String s2 = new String("duanchao");
        System.out.println(s1.equals(s2));
    }

    @Test
    public void showTostring() {
        String s3 = new String("dcdmm");
        System.out.println(s3.toString());
    }
}
