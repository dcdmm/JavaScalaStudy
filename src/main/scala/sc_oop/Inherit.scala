package sc_oop

/**
 * 继承
 */
object Inherit {
    def main(args: Array[String]): Unit = {
        // 父类的主构造器调用
        // Son的主构造器调用
        val son0 = new InheritSon(false, "DNF")
        son0.printInfo()
        println("\n***************************************")
        // 父类的主构造器调用
        // Son的主构造器调用
        // Son的辅助构造器调用
        val son1 = new InheritSon(false, "001")
        son1.printInfo()
        println("\n***************************************")
        // 父类的主构造器调用
        // 父类的辅助构造器调用
        // Daughter的主构造器调用
        val daughter0 = new InheritDaughter(true, "dcdmm", 15)
        daughter0.printInfo()
        println("\n***************************************")
        // 父类的主构造器调用
        // 父类的辅助构造器调用
        // Daughter的主构造器调用
        // Doughter的辅助构造器调用
        val daughter1 = new InheritDaughter(sex = true, name = "duanmengmeng", age = 11, stdNo = "002")
        daughter1.printInfo()
    }
}


class InheritFather(var sex: Boolean) {
    var name: String = _
    var age: Int = _
    println("父类的主构造器调用")

    def this(sex: Boolean, name: String, age: Int) {
        this(sex)
        this.name = name
        this.age = age
        println("父类的辅助构造器调用")
    }

    def printInfo(): Unit = {
        println(s"Father: $sex $name $age")
    }
}

// 继承的调用顺序:父类构造器--->子类构造器
// 单继承;子类的主构造器继承父类的主构造器
// 子类继承自父类的形参不能使用val/var修饰
class InheritSon(sex: Boolean, var game: String) extends InheritFather(sex) { // 形参sex不能使用var/val修饰
    var stdNo: String = _
    println("Son的主构造器调用")

    def this(sex: Boolean, game: String, stdNo: String) {
        this(sex, game)
        this.stdNo = stdNo
        println("Son的辅助构造器调用")
    }

    override def printInfo(): Unit = {
        // 通过super关键字调用父类中的方法
        super.printInfo()
        print(s"Son: $sex $stdNo $game")
    }
}


class InheritDaughter(sex: Boolean, name: String, age: Int) extends InheritFather(sex, name, age) { // 子类的主构造器继承父类的辅助构造器
    var stdNo: String = _
    println("Daughter的主构造器调用")

    def this(sex: Boolean, name: String, age: Int, stdNo: String) {
        this(sex, name, age)
        this.stdNo = stdNo
        println("Doughter的辅助构造器调用")
    }

    override def printInfo(): Unit = {
        print(s"Daughter: $sex $name $age $stdNo")
    }
}