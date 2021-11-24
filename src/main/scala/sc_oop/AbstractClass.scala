package sc_oop

/**
 * 抽象类:包含抽象方法或抽象属性的类称为抽象类(其他特性与普通类相同)(抽象类不能被实例化);
 * 如果一个类包含一个或多个抽象方法,则该类必须被限定为抽象的(反之若类即使不含抽象方法,也可以将类声明为抽象类)
 */
object AbstractClass {
    def main(args: Array[String]): Unit = {
        // 实现抽象类的抽象方法
        val abstractStudent = new AbstractStudent("china") {
            override def play(): Int = {
                return 101
            }
        }
    }
}


abstract class AbstractPerson(val location: String) {
    // 非抽象属性
    val name: String = "person"

    // 抽象属性(没有初始化)
    var age: Int

    // 非抽象方法
    def eat(): Unit = {
        println("person eat")
    }

    // 抽象方法(没有方法体)
    def sleep(): Unit

    def play(): Int
}


abstract class AbstractStudent(location: String) extends AbstractPerson(location) {
    override val name: String = "student"
    var age: Int = 19

    def sleep(): Unit = { // 重写抽象方法可以不加override关键字
        println("student sleep")
    }

    override def eat(): Unit = {
        super.eat()
        println("student eat")
    }
}