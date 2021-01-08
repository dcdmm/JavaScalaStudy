package c_oop;

/**
 * 向下转型:与向上转型相反
 * a instanceof A:判断对象a是否是类A的实例;若对象a是类A的实例,则a必定也是类A父类的实例
 */
public class DownwardTransformationInstanceof {
    public void eat() {
        System.out.println("eat!");
    }
}


class Sub0DownwardTransformationInstanceof extends DownwardTransformationInstanceof {
    int payment = 20000;

    @Override
    public void eat() {
        System.out.println("sub0 eat!");
    }

    public void work() {
        System.out.println("work!");
    }
}


class Sub1DownwardTransformationInstanceof extends DownwardTransformationInstanceof {
    int cost = 29999;

    @Override
    public void eat() {
        System.out.println("sub1 eat!");
    }

    public void shop() {
        System.out.println("shop!");
    }
}


class DownwardTransformationInstanceofTest {
    public static void main(String[] args) {
        // (堆)内存实际已经加载了Sub0DownwardTransformationInstanceof类特有的属性和方法,但由于变量被声明为父类类型,导致编译时只能调用父类中声明的属性和方法
        DownwardTransformationInstanceof dti = new Sub0DownwardTransformationInstanceof(); // 向上转型
        dti.eat();
        System.out.println("******************************************************");

        Sub0DownwardTransformationInstanceof s0dti = (Sub0DownwardTransformationInstanceof) dti; // 向下转型(强制类型转换)
        s0dti.eat();
        System.out.println(s0dti.payment);
        System.out.println("******************************************************");

        // Sub1DownwardTransformationInstanceof s1dti = (Sub1DownwardTransformationInstanceof) dti; // 报错:ClassCastException异常
        // 为了避免在向下转型时出现ClassCastException异常,可以在进行向下转型之前,先使用instanceof关键字进行判断
        if (dti instanceof Sub1DownwardTransformationInstanceof) {
            Sub1DownwardTransformationInstanceof s1dti = (Sub1DownwardTransformationInstanceof) dti;
            System.out.println(s1dti.cost);
        } else {
            System.out.println("s1dti不是Sub1DownwardTransformationInstanceof的实例,不能进行向下转型!");
        }
    }
}