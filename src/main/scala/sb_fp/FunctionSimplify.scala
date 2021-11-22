package sb_fp

/**
 * 函数简化原则
 */
object FunctionSimplify {
    def main(args: Array[String]): Unit = {
        println(fun_0(1, 2))
        println(fun_1(1, 2))
        println(fun_2(1, 2))

        // 空参,有小括号===>函数调用时可以省略小括号
        fun_3()
        fun_3

        // 空参,无小括号===>函数调用时不能带有小括号
        fun_4
    }

    def fun_0(a: Int, b: Int): Int = {  // 返回值为:a - b
        a + b
        return a - b
        // return关键字之后的语句不再执行
        println(a - b)
        a * b
    }

    def fun_1(a: Int, b: Int): Int = {
        a + b  // 最后一条语句的值作为返回值返回时,可以省略return关键字
    }

    def fun_2(a: Int, b: Int): Int = a + b // 函数体内只有一条语句,可以省略花括号

    def fun_3(): Unit = {
        println("空参,有小括号")
    }

    // 空参可以省略括号
    def fun_4: Unit = {
        println("空参,无小括号")
    }
}
