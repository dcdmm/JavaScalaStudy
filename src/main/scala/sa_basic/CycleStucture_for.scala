package sa_basic

/**
 * 循环结构:for循环
 */
object CycleStucture_for {
    def main(args: Array[String]): Unit = {
        for (i <- 1 to 3) { // 1-3(包括3)
            // i = 2 // for循环中i为val,不能被修改
            println(i)
        }
        println("****************************************")

        for (j <- 1 until 3)// 1-3(不包括3)
            println(j)
        println("****************************************")

        /*
        for (k <- 1 to 3) {
            if (k != 2) {
                println(k)
            }
        }
         */
        // 与上等价
        for (k <- 1 to 3 if k != 2) { // 循环守卫;Scala没有continue关键字,可使用循环守卫实现continue的效果
            println(k)
        }
        println("****************************************")

        // 控制步长方式一:
        for (h <- 1 to 10 if h % 2 == 1) {
            println(h)
        }

        println()

        // 控制步长方式二:
        for (g <- Range(1, 10, 2)) { // 步长为2
            println(g)
        }
        println("****************************************")

        /*
        for (n <- 1 to 3) {
            for (m <- 1 to 3) {
                println("n=" + n + " m=" + m)
            }
        }
         */
        // 与上等价
        for (n <- 1 to 3; m <- 1 to 3) { // 嵌套循环
            println("n=" + n + " m=" + m)
        }
    }
}
