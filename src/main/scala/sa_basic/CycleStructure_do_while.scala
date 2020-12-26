package sa_basic

/**
 * 循环结构:do while循环
 */
object CycleStructure_do_while {
    def main(args: Array[String]): Unit = {
        var sum = 0
        var i = 1
        do {
            sum += i
            i += 1 // 必须有控制条件语句
        } while (i <= 100)
        println(sum)
        println(i)
    }
}
