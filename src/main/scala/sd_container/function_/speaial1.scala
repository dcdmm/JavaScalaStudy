package sd_container.function_

object speaial1 {
    def main(args: Array[String]): Unit = {
        val list0 = List(1, 3, 5, 7, 2, 89)
        val list1 = List(3, 7, 2, 45, 4, 8, 19)

        // 并集
        val union = list0.union(list1)
        println(union)

        // 交集
        val intersection = list0.intersect(list1)
        println(intersection)

        // 差集
        val diff = list0.diff(list1)
        println(diff)

        // 拉链
        println(list1.zip(list0))
        println(list0.zip(list1))

        // 滑窗
        println(list1.sliding(3))
        for (elem <- list0.sliding(3)) { // 默认步长为1
            println(elem)
        }
        println("****************************")

        for (elem <- list0.sliding(3, 2)) { // 第二个参数为步长
            println(elem)
        }
    }
}
