package sb_fp

/**
 * 匿名函数(lambda表达式)
 */
object FunctionLambda {
    def main(args: Array[String]): Unit = {
        // python中的写法为:func = lambda a, b: a + b
        val func = (a: Double, b: Double) => {
            println(a + b)
        } // func的类型为(Double, Double) => Double
        println(func)
        println(func(1.2, 2.5)) // 输出()
        println("*****************************************")

        def function(f: (Int, Int) => Int, a: Int, b: Int) { // 形参f为函数类型;形参f的参数类型为(Int, Int) => Int
            println(f(a, b))
        }

        // 以下均等价(匿名函数作为参数)
        function((a: Int, b: Int) => {
            a + b
        }, 2, 4)
        function((a: Int, b: Int) => a + b, 2, 4) // 匿名函数体内只有一条语句,可以省略花括号
        function((a, b) => a + b, 2, 4) // 匿名函数的参数类型可以省略(根据形参f的参数类型自动推导)
        function(_ + _, 2, 4) // 匿名函数参数只出现一次,且参数顺序无关===>此时可将(a, b) => a + b省略为_ + _
        println("*****************************************")

        function((a, b) => b - a, 2, 4)
        function(_ - _, 2, 4) // 与上不等价(与参数顺序有关);等价于function((a, b) => a - b, 2, 4)
    }
}
