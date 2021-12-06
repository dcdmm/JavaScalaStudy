package sd_container.function_


object special0 {
    def main(args: Array[String]): Unit = {
        val list0 = List(1, 3, 5, 7, 2, 89)
        val list1 = List(3, 7, 2, 45, 4, 8, 19)

        // 获取集合的头
        println(list0.head)

        // 获取结合的尾
        println(list0.tail) // 去掉头

        // 集合的一个元素
        println(list0.last)

        // 初始元素(不是最后一个)
        println(list0.init)

        // 反转
        println(list0.reverse)

        // 前n个元素
        println(list0.take(3))
        println(list0.takeRight(3)) // 后3个元素

        // 去掉前n个元素
        println(list0.drop(3))
        println(list0.dropRight(3)) // 去掉后3个元素
    }
}
