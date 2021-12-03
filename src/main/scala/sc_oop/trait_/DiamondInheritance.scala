package sc_oop.trait_

/**
 * 钻石继承
 */
object DiamondInheritance {
    def main(args: Array[String]): Unit = {
        val myFootBall = new MyFootBall()
        println(myFootBall.describe())
        myFootBall.printInfo()
    }
}

trait Ball {
    def describe(): String = "ball"


}

trait ColorBall extends Ball {
    val color: String = "red"

    override def describe(): String = color + "-" + super.describe()
}

trait CategoryBall extends Ball {
    var category: String = "football"

    override def describe(): String = category + "-" + super.describe()
}

class MyFootBall extends CategoryBall with ColorBall {
    override def describe(): String = {
        // 钻石继承
        // 执行顺序:MyFootBall===>ColorBall===>CategoryBall===>Ball
        "my ball is:" + super.describe()
    }

    def printInfo(): Unit = {
        println(super.describe())
        // 指定调用父类/特质的方法
        println(super[ColorBall].describe())
        println(super[CategoryBall].describe())
    }
}