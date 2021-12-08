package sd_container.immutable_

/**
 * A map from keys of type A to values of type B.
 */
object Map_ {
    def main(args: Array[String]): Unit = {
        val map1: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2) // 通过伴生对象创建
        println(map1.toString())
        println(map1) // 与上等价

        println(map1.keys)
        println(map1.values)

        println(map1("a"))

        // println(map1("d")) // 不存在则报错
        println(map1.get("d")) // 不存在则返回None
        println(map1.getOrElse("d", -1)) // 指定不存在时的返回值
    }
}
