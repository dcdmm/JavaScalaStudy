package sc_oop.basic_rights

/**
 * 权限修饰符
 */
class RightsPerson() {
    var sex: String = "man" // Scala中的默认权限,所有的类都可以访问(不可以显式声明,没有public关键字)
    private var idCard: String = "199507237311" // 只有本类(伴生对象)可以访问
    protected var name: String = "duanchao" // 只有本类(伴生对象)和子类(伴生对象)可以访问,同包中其他类不可以访问
    private[basic_rights] var age: Int = 18 // private[包名]:指定包下的其他类也可以访问

    def printInfor(): Unit = {
        println(s"Peson:$idCard $name $sex $age") // ===>private:只有本类(伴生对象)可以访问
    }
}

object RightsPerson {
    def main(args: Array[String]): Unit = {
        val rp = new RightsPerson()
        // ===>private:只有本类(伴生对象)可以访问
        println(rp.sex)
        println(rp.idCard)
        println(rp.name)
        println(rp.age)
    }
}