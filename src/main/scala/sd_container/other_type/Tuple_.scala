package sd_container.other_type

/**
 * 元组
 */
object Tuple_ {
    def main(args: Array[String]): Unit = {
        // 最大数量为22个
        val tuple1: (String, Int, String, Boolean) = ("hello", 100, "a", true)
        println(tuple1)

        // 访问数据
        println(tuple1._1) // 第一个元素
        println(tuple1._2)
        println(tuple1._3)
        println(tuple1._4)

        // 遍历元组
        for (elem <- tuple1.productIterator) {
            println(elem)
        }

        // 嵌套元素
        val multuple = (12, 0.3, "duanchao", ("java", "c++", "python"))
        println(multuple._4)
        println(multuple._4._2)
    }
}
