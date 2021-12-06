package sc_oop

/**
 * 类型检查和转换
 */
object CheckConversion {
    def main(args: Array[String]): Unit = {
        val student0: CheckConversionStudent = new CheckConversionStudent("alice", 12)
        val person0: CheckConversionPerson = new CheckConversionPerson("bob", 33)
        val person1: CheckConversionPerson = new CheckConversionStudent("tom", 15)

        // 类型检查
        println(student0.isInstanceOf[CheckConversionPerson]) // student0是否为CheckConversionPerson的实例
        println(student0.isInstanceOf[CheckConversionStudent])

        println(person0.isInstanceOf[CheckConversionPerson])
        println(person0.isInstanceOf[CheckConversionStudent])

        println(person1.isInstanceOf[CheckConversionPerson])
        println(person1.isInstanceOf[CheckConversionStudent])
        person1.sayHi() // 多态
        println("****************************************************************")

        if (person1.isInstanceOf[CheckConversionStudent]) {
            val person1_convert = person1.asInstanceOf[CheckConversionStudent] // 类型转换
            person1_convert.study()
            println(person1.getClass) // 获取对象的类型
            println(person1_convert.getClass)
        }
    }
}


class CheckConversionPerson(val name: String, val age: Int) {
    def sayHi(): Unit = {
        println("hi from person " + name)
    }
}

class CheckConversionStudent(name: String, age: Int) extends CheckConversionPerson(name, age) {
    override def sayHi(): Unit = {
        println("hi from student " + name)
    }

    def study(): Unit = {
        println("student study")
    }
}