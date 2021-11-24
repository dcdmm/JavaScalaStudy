package sc_oop

/**
 * 多态
 * Scala中属性和方法都是动态绑定的(java中只有方法是动态绑定的)
 */
object Polymorphism {
    def main(args: Array[String]): Unit = {
        def personInfo(polymorphismfather: PolymorphismFather): Unit = {
            polymorphismfather.printInfo()
            println(polymorphismfather.localtion)
        }

        val father = new PolymorphismFather(false)
        personInfo(father)
        father
        println("**********************************************")
        val son = new PolymorphismSon(false)
        personInfo(son)
        println("**********************************************")
        val daughter = new PolymorphismDaughter(true)
        personInfo(daughter)
    }
}

class PolymorphismFather(var sex: Boolean) {
    val localtion: String = "hunan"
    var hobby: String = "game"

    def printInfo(): Unit = {
        println(s"Father: $sex")
    }
}

class PolymorphismSon(sex: Boolean) extends PolymorphismFather(sex) {
    // 子类中的(val)属性覆盖父类中的(val)属性(必须加上override)
    override val localtion: String = "guangdong"

    // 不能覆盖父类中的(var)属性
    // override var hobby = "dance" // 报错

    // 子类中的方法覆盖父类中的方法(必须加上override)
    override def printInfo(): Unit = {
        println(s"Son: $sex")
    }
}


class PolymorphismDaughter(sex: Boolean) extends PolymorphismFather(sex) {
    override val localtion: String = "beijing"

    override def printInfo(): Unit = {
        println(s"Daughter: $sex")
    }
}