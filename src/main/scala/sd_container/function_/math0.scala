package sd_container.function_

object math0 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 3, 4, -2, 9, 10, 7)
        val list1 = List(("a", 1), ("b", 3), ("c", 4), ("d", -2), ("e", 9), ("g", 10), ("h", 7))

        // 求和
        println(list.sum)
        // 求乘积
        println(list.product)

        // 最大最小值
        println(list.max)
        println(list.min)
        println(list1.maxBy((tuple: (String, Int)) => tuple._2))
        println(list1.minBy(tuple => tuple._2)) // 指定排序准则

        // 排序

        println(list.sorted)
        println(list.sorted(Ordering[Int].reverse)) // 从大到小
        println(list1.sortBy(tuple => tuple._2)(Ordering[Int].reverse))

        println(list.sortWith((a, b) => a < b)) // 根据规则进行排序,类似Java中的compare
    }
}
