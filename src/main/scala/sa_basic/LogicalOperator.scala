package sa_basic

/**
 * 逻辑运算符:&&;||;!
 */
object LogicalOperator {
    def main(args: Array[String]): Unit = {
        println(true)  // true
        println(true && false)  // false
        println(false && false)  // false
        println("*******************************")

        println(true || true)  // true
        println(true || false)  // true
        println(false || false)  // false
        println("*******************************")

        println(!true)  // false
        println(!false)  // true
    }
}
