package sd_container.immutable_

/**
 * A map from keys of type A to values of type B.
 */
object Map_ {
    def main(args: Array[String]): Unit = {
        val map1: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2) // 通过伴生对象创建
        println(map1.toString())
        println(map1) // 与上等价
    }
}
