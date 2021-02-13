package e_JDK5.generics;

/**
 * 泛型类(泛型接口类似)
 *
 * @param <T>
 * @param <K>
 * @param <V>
 */
public class GenericClass<T, K, V> { // extends Exception{
    // 泛型类可以有多个类型参数
    // 泛型类不能为异常类===>既不能抛出也不能捕获泛型类对象
    String name;
    int age;
    T school;
    K country;
    V payment;

    public GenericClass() { // 泛型类的空参构造器
        /*
        创造类型参数为T的数组
         */
        // T[] arr = new T[10]; // 编译不通过
        T[] objects = (T[]) new Object[10]; // 正确写法
    }

    public GenericClass(String name, int age, T school, K country, V payment) { // 泛型类的带有形式参数的构造器
        this.name = name;
        this.age = age;
        this.school = school;
        this.country = country;
        this.payment = payment;
    }

//    // 静态方法中不能使用类的类型参数
//    public static void show() {
//        System.out.println(school);
//    }
//
//    public static void show1(K country) {
//    }

    public T getSchool() {
        return school;
    }

    public void setSchool(T school) {
        this.school = school;
    }

    public K getCountry() {
        return country;
    }

    public void setCountry(K country) {
        this.country = country;
    }

    public V getPayment() {
        return payment;
    }

    public void setPayment(V payment) {
        this.payment = payment;
    }

    public static void main(String[] args) {
        // 类型参数不能为基本数据类型(使用包装类代替)
        GenericClass<String, String, Float> gc = new GenericClass<>();
        gc.setSchool("BaiShui");
        System.out.println(gc.getSchool());
    }
}