package e_JDK5.generics;

/**
 * 自定义泛型类
 * @param <T>
 */
public class GenericClass<T> { // 泛型接口类似
    String name;
    int age;
    T school;

    public GenericClass() {
    }

    public GenericClass(String name, int age, T school) {
        this.name = name;
        this.age = age;
        this.school = school;
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

    public T getSchool() {
        return school;
    }

    public void setSchool(T school) {
        this.school = school;
    }

    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass<>();
        gc.setSchool("BaiShui");
        System.out.println(gc.getSchool());
    }
}


class SubGenericClass0 extends GenericClass<String> {

}


class SubGenericClass1<E> extends GenericClass<E> {

}