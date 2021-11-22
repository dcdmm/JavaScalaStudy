package sc_oop

object Constructor {
    def main(args: Array[String]): Unit = {
        var const0 = new Const0()
        println("***************************************")
        var const1 = new Const1("hunan")
        // const1.location = "guangdong"  // 报错
        println("***************************************")
        var const1_0 = new Const2("duanchao", 18)
        const1_0.name = "duanmengmeng" // 可以被修改
        println(const1_0.name)
        println("***************************************")
        var const1_1 = new Const2("duanchao", 18, school = "baishui")
        println("***************************************")
        var const1_2 = new Const2("duanchao", 18, school = "baishui", sex = false)
    }
}

class Const0 {
    println("无参构造器")
}

class Const1(val location: String) {  // val修饰形参,不能被修改
    println("有参构造器")
}

class Const2(var name: String, var age: Int) {  // var修饰形参,可以被修改
    var school: String = _
    var sex: Boolean = _
    println("1. 主构造方法被调用")
    println("name=" + name + ";age=" + age)

    def this(name: String, age: Int, school: String) {
        this(name, age)  // 调用其他的构造器;只能调用一个;必须为构造器的第一条语句出现
        this.school = school
        println("2. 辅助构造方法一被调用")
        println("name=" + name + ";age=" + age + ";school=" + school)
    }

    def this(name: String, age: Int, school: String, sex: Boolean) {
        this(name, age, school)
        this.sex = sex
        println("2. 辅助构造方法二被调用")
        println("name=" + name + ";age=" + age + ";school=" + school + ";sex=" + sex)
    }
}