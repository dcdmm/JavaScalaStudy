package sb_fp

/**
 * 函数简化
 */
object FunctionSimplify {
    def main(args: Array[String]): Unit = {
        println(fun_0(1, 2))
        println(fun_1(1, 2))
        println(fun_2(1, 2))
        fun_3(1, 2)

        // 空参,有小括号===>函数调用时可以省略小括号
        fun_4()
        fun_4

        // 空参,无小括号===>函数调用时不能带有小括号
        fun_5
    }

    def fun_0(a: Int, b: Int): Int = {
        a + b
        return a + b  // 执行a + b
        // return关键字之后的语句不再执行
        println(a - b)
        a * b
    }

    def fun_1(a: Int, b: Int): Int = {
        a + b  // 最后一条语句的值作为返回值返回时,可以省略return关键字(之前没有使用return关键字返回的情况下)
    }

    def fun_2(a: Int, b: Int): Int = a + b  // 函数体内只有一条语句,可以省略花括号

    /*
    def fun_3(a: Int, b: Int): Unit = {
        println(a + b)
    }
     */
    // 返回值为Unit,可以省略":Unit ="
    def fun_3(a: Int, b: Int) {
        println(a + b)
    }

    def fun_4(): Unit = {
        println("空参,有小括号")
    }

    def fun_5 {
        println("空参,无小括号")
    }
}
