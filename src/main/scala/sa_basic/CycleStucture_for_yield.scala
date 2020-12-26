package sa_basic

/**
 * 循环结构:for循环使用yield
 */
object CycleStucture_for_yield {
    def main(args: Array[String]): Unit = {
        val res = {
            // 将for循环的返回值作为一个变量存储
            for (i <- 1 to 10)
                yield {
                    if (i % 2 == 0) {
                        i + "偶数"
                    } else {
                        i + "不是偶数"
                    }
                }
        }
        println(res)
    }
}
