package sd_container.Array_

object ff {
    def main(args: Array[String]): Unit = {
        val arr0: Array[Int] = new Array[Int](5) // 初始值为0
        println(arr0(0)) // 数组元素索引
        arr0(0) = 111
        println(arr0(0))

        println(arr0.length) // 数组长度
        println(arr0.indices) // 数组索引
        println("****************************************************")

        // 遍历数组方式一:
        for (i <- 0 until arr0.length) {
            println(arr0(i))
        }
        println()

        // 遍历数组方式二:
        for (i <- arr0.indices) {
            println(arr0(i))
        }
        println()

        // 遍历数组方式三(增强for循环):
        for (elem <- arr0) {
            println(elem)
        }
        println()

        // 遍历数组方式四:
        val iter = arr0.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
        println()



        // 遍历数组方式五:
        arr0.foreach((elem: Int) => println(elem))

        println(arr0.mkString("-"))
        // val arr2 = Array(0, 1, 2, 3, 4, 5) // 指定元素值初始化
        //        println(arr0.getClass)
        //        val arr2 = Array.range(5, 10)

        // 添加元素
        val newArr = arr0 :+ 234
        println(arr0.mkString("-"))
        println(newArr.mkString("-"))

        val newArr1 = 30 +: arr0
        println(newArr1.mkString("-"))

    }
}
