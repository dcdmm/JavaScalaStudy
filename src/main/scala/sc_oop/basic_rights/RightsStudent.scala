package sc_oop.basic_rights


object Test {
    def main(args: Array[String]): Unit = {
        val person: RightsPerson = new RightsPerson() // 创建对象
        // println(person.idCard)  // 报错;===>private:只有本类或伴生对象可以访问
        // println(person.name)  // 报错;===>protected:只有本类(伴生对象)和子类(伴生对象)可以访问,同包中其他类不可以访问
        println(person.age) // ===>private[包名]:指定包下的其他类也可以访问
        println(person.sex) // ===>Scala中的默认权限,所有的类都可以访问(不可以显式声明,没有public关键字)

        println("*****************************************")
        val student: RightsStudent = new RightsStudent()
        // println(student.name)  // 报错;===>protected:只有本类(伴生对象)和子类(伴生对象)可以访问,同包中其他类不可以访问
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


class RightsStudent extends RightsPerson {
    // 属性定义时,"_"表示属性类型的初始值
    // Byte初始值为false
    var byte_init: Byte = _ // _ 表示某一类型的默认值
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

    override def printInfor(): Unit = { // 方法重写,override关键字
        // idCard = "20310101"  // 报错;===>private:只有本类和伴生对象可以访问
        name = "dcdmm"
        sex = "woman"
        age = 26
        println(s"student::$name $sex $age")
    }
}

object RightsStudent {
    def main(args: Array[String]): Unit = {
        val rs = new RightsStudent()
        // protected:只有本类(伴生对象)和子类(伴生对象)可以访问,同包中其他类不可以访问
        println(rs.name)
    }
}