package sb_fp

import scala.annotation.tailrec

/**
 * 递归
 */
object Recursion {
    def main(args: Array[String]): Unit = {
        println(fact(5))
        println(tailFact(5))
        println("******************************")

        println(FibonaccRecursion(12))
        println("******************************")

        hanoi(3) // 3层汉诺塔
    }

    def fact(n: Int): Int = {
        if (n == 1) {
            return 1
        }
        return fact(n - 1) * n
    }

    // 尾递归实现阶乘
    def tailFact(n: Int): Int = {
        @tailrec // 尾递归的注解(提示编译器尾递归优化)
        def loop(n: Int, currResult: Int): Int = {
            if (n == 0) {
                return currResult
            }
            return loop(n - 1, currResult * n)
        }

        loop(n, 1)
    }

    // 斐波拉契数列的递归实现
    def FibonaccRecursion(n: Int): Int = {
        if (n == 1 || n == 2) {
            return 1
        } else {
            return FibonaccRecursion(n - 1) + FibonaccRecursion(n - 2)
        }
    }

    // 汉诺塔的递归实现
    def hanoi(n: Int, x: Char = 'x', y: Char = 'y', z: Char = 'z'): Unit = {
        if (n == 1) {
            println(x + "-->" + z)
        } else {
            hanoi(n - 1, x, z, y) // 将前n-1个盘子移动从x移动到y上
            println(x + "-->" + z) // 将最底下的盘子从x移动到z上
            hanoi(n - 1, y, x, z) // 将y上的n-1个盘子移动到z上
        }
    }
}
