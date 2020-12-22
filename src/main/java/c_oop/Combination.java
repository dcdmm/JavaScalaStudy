package c_oop;

/**
 * 组合:在新类中产生产生现有类的对象
 */
public class Combination {
    private String valve1, valve2, valve3, valve4;
    private CombinationTest ct = new CombinationTest(); // CombinationTest类的对象
    private int i;
    private float f;

    public Combination() {
    }

    @Override
    public String toString() {
        return
                "valve1 = " + valve1 + " " +
                        "valve2 = " + valve2 + " " +
                        "valve3 = " + valve3 + " " +
                        "valve4 = " + valve4 + " " +
                        "i = " + i + " " + "f = " + f + " " +
                        "ct = " + ct;
    }

    public static void main(String[] args) {
        Combination com = new Combination();
        System.out.println(com);
    }
}

class CombinationTest {
    private String s;

    public CombinationTest() {
        System.out.println("CombinationTest()");
        s = "Constrrcted";
    }

    @Override
    public String toString() {
        return s;
    }
}