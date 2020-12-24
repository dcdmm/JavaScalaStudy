package basic

/**
 * 算术运算符
 */
object ArithmeticOperator {
    def main(args: Array[String]): Unit = {
        val a = 5
        val b = 3
        println(a + b)
        println(a - b)
        println(a * b)
        println(a / b) // 整数与整数相除仍为整数
        println(a % b) // 取余
        println("**********************************")
        println(5 / 4)
        println(5 / 4.0) // 输出为小数(浮点数参与运算)
        println("**********************************")
        val c = 'a' // 字符A的ASCII码是65,a的ASCII码是97
        val d = 10
        println(c + d)
        println("**********************************")
        println("hello" + "scale") // 字符串的拼接
        println("hello" + 100)
        // 运算顺序从左至右;
        println("hello" + 100 + 200) // 输出"hello100200"
        println(100 + 200 + "hello") // 输出"300hello"
    }
}
