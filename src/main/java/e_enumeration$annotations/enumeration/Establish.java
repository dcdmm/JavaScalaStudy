package e_enumeration$annotations.enumeration;

/**
 * 枚举类的使用
 */
public class Establish {
    public static void main(String[] args) {
        EnumClass spring = EnumClass.SPRING;
        System.out.println(spring); // 默认输出(toString()方法)当前枚举类对象常量的名称

        System.out.println("***************************************************");

        EnumClass[] eunmarray = EnumClass.values(); // 返回枚举类对象常量组成的数组
        for (EnumClass i : eunmarray) {
            i.show();
            System.out.println(i);
        }

        System.out.println("***************************************************");

        EnumClass winter = EnumClass.valueOf("WINTER"); // 返回该名称的枚举类对象常量
        System.out.println(winter);

        System.out.println("***************************************************");

        EnumClass summary = EnumClass.SMMARY;
        switch (summary) {
            case SPRING: // case的值为枚举类对象常量的名称
                System.out.println("现在是春天了!!!");
                break;
            case SMMARY:
                System.out.println("现在是夏天了!!!");
                break;
            case AUTUMN:
                System.out.println("现在是秋天了!!!");
                break;
            case WINTER:
                System.out.println("现在是冬天了!!!");
                break;
        }
    }
}

interface isShow {
    void show();
}

enum EnumClass implements isShow { // 通过enum关键字声明;默认继承于java.lang.Enum类
    // 枚举类对象常量(若只有一个,则可以作为单例模式的一种实现方式)
    SPRING("春天", "春暖花开") { //

        @Override
        public void show() {
            System.out.println("****春天来了!****"); // 匿名实现
        }
    },
    SMMARY("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("****夏天来了!****");
        }
    },
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冰天雪地"); // 最后以分号结尾

    private final String seasonName;
    private final String seasonDesc;

    EnumClass(String seasonName, String seasonDesc) { // 省略了private
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public void show() {
        System.out.println("****一年四季:春夏秋冬****");
    }

//    @Override
//    public String toString() {
//        return this.name() + "{" +
//                "seasonName=" + seasonName + "," +
//                "seasonName=" + seasonName +
//                "}";
//    }
}