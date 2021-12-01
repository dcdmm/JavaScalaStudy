package sc_oop

/**
 * 构造器
 */
object Constructor {
    def main(args: Array[String]): Unit = {
        var const0 = new Const0()
        println("***************************************")
        var const1 = new Const1("hunan")
        // const1.location = "guangdong"  // 报错(val修饰形参,不能被修改)
        println("***************************************")
        var const1_0 = new Const2("duanchao", 18)
        println(const1_0.name)
        const1_0.name = "duanmengmeng" // 可以被修改(// var修饰形参,可以被修改)
        println(const1_0.name)
        println("***************************************")
        var const1_1 = new Const2("duanchao", 18, school = "baishui")
        println("***************************************")
        var const1_2 = new Const2("duanchao", 18, school = "baishui", sex = false)
    }
}


class Const0() { // 无参构造器可以省略"()"
    println("主构造器无参")
}

class Const0_0 private() { // 主构造器可以使用权限修饰符修饰

}

class Const1(val location: String) { // val修饰形参,不能被修改
    println("主构造器有参")
}

class Const2(var name: String, var age: Int) { // var修饰形参,可以被修改
    var school: String = _
    var sex: Boolean = _
    println("1. \"主构造器\"被调用")
    println("name=" + name + ";age=" + age)

    // 辅助构造器不能使用权限修饰符修饰
    // 辅助构造器形参不能使用val/var修饰
    def this(name: String, age: Int, school: String) {
        // 调用其他的构造器;只能调用一个;必须为构造器的第一条语句出现
        this(name, age) // 可以看出这里调用的是"主构造器"
        this.school = school
        println("2. \"辅助构造器一\"被调用")
        println("name=" + name + ";age=" + age + ";school=" + school)
    }

    def this(name: String, age: Int, school: String, sex: Boolean) {
        this(name, age, school) // 可以看出这里调用的是"辅助构造器一"
        this.sex = sex
        println("2. \"辅助构造器二\"被调用")
        println("name=" + name + ";age=" + age + ";school=" + school + ";sex=" + sex)
    }
}