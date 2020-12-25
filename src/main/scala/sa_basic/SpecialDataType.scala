package sa_basic

/**
 * Scala特殊数据类型:
 * Unit;Null;Nothing(所有数据类型的子类)
 */
object SpecialDataType {
    def main(args: Array[String]): Unit = {
        val res: Unit = sayHello()
        println("res=" + res) // Unit类似于Java里的void;Unit只有一个实例()
        val dog: Dog = null // Null类型只有一个实例null
    }

    def sayHello(): Unit = {
    }
}

class Dog {
}