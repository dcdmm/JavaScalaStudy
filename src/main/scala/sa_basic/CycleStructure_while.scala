package sa_basic

/**
 * 循环结构:while循环
 */
object CycleStructure_while {
    def main(args: Array[String]): Unit = {
        // 计算0到100的数之和
        var sum = 0
        var i = 0
        while (
            i <= 100
        ) {
            sum += i
            i += 1  // 必须有控制条件语句
        }
        println(i)
        println(sum)
    }
}
