package sb_fp

/**
 * 控制抽象
 */
object ControlAbstraction0 {
    def main(args: Array[String]): Unit = {
        f2(f1())
        println("****************************************")

        f3(11)  // 表示代码块{11}传入函数f3
        println("****************************************")
        f3(f1)  // 等价于f2(f1());此处f1不会被执行
        println("****************************************")
        f3({
            println("这是一段代码块")
            28
        })
    }

    def f1(): Int = {
        println("f1被调用")
        12
    }

    // 传值参数
    def f2(a: Int): Unit = {
        println("a: " + a)  // a表示值
        println("a: " + a)
    }

    // 传名参数
    // 形参a表示代码块;形参a的参数类型为 => Int
    def f3(a: => Int): Unit = {
        // 执行a两次
        println("a: " + a)  // a表示代码块;将执行a表示的代码块(使用到a时,a才会被执行)
        println("a: " + a)
    }
}
