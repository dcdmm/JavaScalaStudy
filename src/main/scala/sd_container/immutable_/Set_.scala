package sd_container.immutable_

/**
 * A generic trait for immutable sets.
 * A set is a collection that contains no duplicate elements.
 */
object Set_ {
    def main(args: Array[String]): Unit = {
        // 通过伴生对象创建
        val set0 = Set(1, 2, 3, 4, 4, 5) // 无序不重复
        println(set0.toString())
        println(set0) // 与上等价
    }
}
