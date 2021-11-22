package sb_fp

import scala.annotation.tailrec

/**
 * 控制抽象案例(模拟while循环)
 */
object ControlAbstraction1 {
    def main(args: Array[String]): Unit = {
        var n = 10
        while (n >= 1) {
            println(n)
            n -= 1
        }
        println("**********************************************")

        // condition必须为代码块(condition需要不断被更新,故不能为值)
        def myWhile(condition: => Boolean): (=> Unit) => Unit = {
            def doLoop(op: => Unit): Unit = {
                if (condition) {
                    op
                    myWhile(condition)(op)
                }
            }

            doLoop _
        }

        var m = 10
        myWhile(m >= 1)({
            println("执行了op操作!")
            println(m)
            m -= 1
        })
        println("**********************************************")

        // 匿名函数的写法;与函数myWhile等价
        def myWhile1(condition: => Boolean): (=> Unit) => Unit = {
            // (op: => Unit) => {......}  // 报错
            // op表示代码块时,此时必须省略op的数据类型
            op => {
                if (condition) {
                    op
                    myWhile1(condition)(op)
                }
            }
        }

        var y = 10
        myWhile1(y >= 1)({
            println("执行了op操作!")
            println(y)
            y -= 1
        })
        println("**********************************************")

        // 柯里化;与函数myWhile等价
        @tailrec
        def myWhile2(condition: => Boolean)(op: => Unit): Unit = {
            if (condition) {
                op
                myWhile2(condition)(op)
            }
        }

        var z = 10
        myWhile2(z >= 1)({
            println("执行了op操作!")
            println(z)
            z -= 1
        })
    }
}
