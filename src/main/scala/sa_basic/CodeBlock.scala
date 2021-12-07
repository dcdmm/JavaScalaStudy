package sa_basic

/**
 * 在Scala中,大括号意味着将一组执行语句囊括为一个整体,并称之为代码块,代码块的最后一行代码的结果为返回值
 */
object CodeBlock {
    def main(args: Array[String]): Unit = {
        val a: Unit = {
            3
            println("代码块")
        }
        println(a) // Unit
        println("********************************")

        println(1 + 2) // 3

        println({
            1
        } + {
            2
        }) // 3

        println({
            -1
            1
        } + {
            -2
            2
        }) // 3
    }
}
