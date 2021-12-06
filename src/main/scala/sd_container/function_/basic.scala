package sd_container.function_

object basic {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, 5)
        println(list.length) // 集合长度
        println(list.size) // 注意继承关系

        val set = Set(1, 2, 3, 4, 5)
        println(set.size)


        // 遍历
        for (elem <- list) {
            println(elem)
        }

        set.foreach(println)

        // 迭代器
        for (elem <- list.iterator) {
            println(elem)
        }

        for (elem <- set.iterator) {
            println(elem)
        }

        // 字符串
        println(list.mkString("-"))
        println(set.mkString("-"))

        println(list.contains(2))
        println(set.contains(23))

    }
}
