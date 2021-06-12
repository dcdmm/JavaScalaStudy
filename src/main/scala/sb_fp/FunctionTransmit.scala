package sb_fp

/**
 * 函数作为值/参数/返回值传递(类似python)
 */
object FunctionTransmit {
    def main(args: Array[String]): Unit = {
        def func(n: Int): Int = {
            println("func被调用!")
            n
        }

        // f0,f1为函数
        // val f = func // 报错;missing argument list for method func
        val f0 = func _ // 将函数func作为值传递给f0
        val f1: Int => Int = func // 指定f1的类型;与上等价

        println(f0)
        println(f1)

        println(f0(2))
        println(f1(2))
        println("***************************************************")

        def add(a: Int, b: Int): Int = {
            return a + b
        }

        def func1(f: (Int, Int) => Int, m: Int, n: Int): Int = {
            return f(m, n)
        }

        println(func1(add, 2, 4)) // 将函数add作为参数传递给func1
        println(func1((a, b) => a + b, 2, 4)) // 匿名函数的写法
        println("***************************************************")

        def func2(s: Int): (Int, Int) => Int = { // add的返回值类型为(Int, Int) => Int
            def func2_inner(a: Int, b: Int): Int = {
                return a + b + s
            }

            return func2_inner // 函数func2的返回值为func2_inner
        }

        // 匿名函数的写法;与函数func2等价
        def func2_lambda(s: Int): (Int, Int) => Int = {
            (a, b) => a + b + s
        }

        println(func2(1))
        println(func2(1)(2, 4))
        println(func2_lambda(1)(2, 4))
    }
}
