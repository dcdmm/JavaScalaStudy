package c_oop;

/**
 * 多态(总结:编译看左,运行看右)
 * 将一个方法调用同一个方法主体关联起来被称为绑定.若在程序执行前进行绑定,叫做前期绑定
 * 后期绑定(动态绑定):在运行时根据对象的类型进行绑定,如果一种语言想实现后期绑定,就必须具有某种机制,以便在运行时能判断对象的类型,从而调用恰当的方法.也就是说,编译器一直不知道对象的类型,但是方法调用机制能找到正确的方法体.
 * java中除了static和final方法(private方法属于final方法)之外,其他的方法都是后期绑定
 * java中所有的方法都是通过后期绑定实现多态
 */
public class Polymorphism {
    private String name;

    public Polymorphism() {
    }

    public Polymorphism(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}


class MousePolymorphism extends Polymorphism {

    public MousePolymorphism(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃奶酪");
    }
}


class DogPolymorphism extends Polymorphism {
    public DogPolymorphism(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃骨头");
    }
}


class CatPolymorphism extends Polymorphism {
    public CatPolymorphism(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃鱼干");
    }
}


class PolymorphismTest {
    public static void main(String[] args) {
        Polymorphism mp = new MousePolymorphism("老鼠");  // 向上转型机制
        Polymorphism dp = new DogPolymorphism("狗");
        Polymorphism cp = new CatPolymorphism("猫");
        show(mp);
        show(dp);
        show(cp);
    }

    public static void show(Polymorphism polymorphism) {
        polymorphism.eat();
    }
}