package c_oop;

/**
 * equals方法
 * Java语言规范要求equals方法具有下面的特性:
 * 1. 自反性:对于任何非空引用x,x.equals(x)应该返回true
 * 2. 对称性:对于任何引用x,y,当前仅当y.equals(x)返回true,x.equals(y)也应该返回true
 * 3. 传递性:对于任何引用x,y,z,如果x.equals(y)返回true,y.equals(z)返回ture,则x.equals(z)也应该返回true
 * 4. 一致性:如果x和y引用的对象没有发生改变,反复调用x.equals(y)应该返回同样的结果
 * 5. 对于任何非空引用x,x.equals(null)应该返回false
 */
public class EqualsMethod {
    public static void main(String[] args) {
        String s1 = new String("duanchao"); // 内部重写了equals方法(类似类的还有Date,file,包装类......)
        String s2 = new String("duanchao");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println("********************************************");
        EqualsMethodTest emt1 = new EqualsMethodTest("duanchao", 24);
        EqualsMethodTest emt2 = new EqualsMethodTest("duanchao", 24);
        System.out.println(emt1 == emt2); // false
        System.out.println(emt1.superEquals(emt2)); // false
        System.out.println(emt1.equals(emt2)); // true
    }
}


class EqualsMethodTest {
    private String name;
    private int age;

    public EqualsMethodTest() {
    }

    public EqualsMethodTest(String name, int age) {
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

    public boolean superEquals(Object obj) {
        System.out.println("=======父类Object的equals方法!=======");
        /*
        // Object类中的equals方法
        public boolean equals(Object obj) {
            return (this == obj);
        }
         */
        return super.equals(obj);
    }

    // 手工重写的equals方法
//    @Override
//    public boolean equals(Object anObject) {
//        System.out.println("=======EqualsMethodTest重写的equals方法!=======");
//        if (this == anObject) { // 引用地址一致
//            return true;
//        }
//        if (anObject instanceof EqualsMethodTest) {
//            EqualsMethodTest p = (EqualsMethodTest) anObject;
//            return this.age == p.age && this.name.equals(p.name);
//        } else {
//            return false;
//        }
//    }

    // 自动导入的equals方法(快捷键:alt + insert)
    @Override
    public boolean equals(Object o) {
        System.out.println("=======EqualsMethodTest重写的equals方法!=======");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsMethodTest that = (EqualsMethodTest) o;
        return age == that.age &&
                name.equals(that.name);
    }
}