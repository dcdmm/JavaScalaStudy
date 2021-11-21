package sc_oop.rights

object SonClass {
    def main(args: Array[String]): Unit = {
        val person: Person = new Person()
        // println(person.idCard)  // private:只有本类和伴生对象可以访问
        // println(person.name)  // protected:只有本类和子类可以访问,同包中其他类不可以访问
        println(person.age)
        println(person.sex)

        println("*****************************************")
        val student: Student = new Student()
        // println(student.name)  // protected:只有本类和子类可以访问,同包中其他类不可以访问
        println(student.age)
        println(student.sex)
        student.printInfor()
        println(student.bool_init)
        println(student.int_init)
        println(student.double_init)
        println("|" + student.char_init + "|")
        println(student.bool_init)
        println(student.str_init)
    }
}


class Student extends Person {
    // 属性定义时,"_"表示该类型的初始值
    // Byte初始值为false
    var byte_init: Byte = _
    // Boolean初始值为False
    var bool_init: Boolean = _
    // Short/Int/Long初始值为0
    var int_init: Int = _
    // Float/Double初始值为0.0
    var double_init: Double = _
    // Char初始值为" "
    var char_init: Char = _
    // String初始值为null
    var str_init: String = _

    override def printInfor(): Unit = { // 方法重写
        // idCard = "20310101"  // private:只有本类和伴生对象可以访问
        println("student:")
        name = "dmm"
        sex = "woman"
        age = 26
        println(s"Peson:$name $sex $age")
    }
}