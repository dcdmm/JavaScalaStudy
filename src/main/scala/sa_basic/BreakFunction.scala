package sa_basic

import scala.util.control.Breaks._

/**
 * break函数
 */
object BreakFunction {
    def main(args: Array[String]): Unit = {
        breakable(
            for (n <- 0 to 5) {
                for (m <- 0 to 5) {
                    if (n * m == 15) {
                        println(n)
                        println(m)
                        break() // 跳出当前整个循环,不异常中断
                    }
                }
            }
        )

        println("****************************************")

        for (i <- 0 to 10) {
            for (j <- 0 to 10) {
                if (i * j == 21) {
                    println(i)
                    println(j)
                    break() // 跳出当前整个循环,抛出异常
                }
            }
        }
    }
}
