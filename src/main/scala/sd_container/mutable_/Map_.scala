package sd_container.mutable_

import scala.collection.mutable

/**
 * A base trait for maps that can be mutated
 */
object Map_ {
    def main(args: Array[String]): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2) // 通过伴生对象创建
        println(map)

        println(map.keys)
        println(map.values)

        println(map("a"))

        // println(map("d")) // 不存在则报错
        println(map.get("d")) // 不存在则返回None
        println(map.getOrElse("d", -1)) // 指定不存在时的返回值
    }
}
