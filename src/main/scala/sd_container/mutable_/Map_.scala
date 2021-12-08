package sd_container.mutable_

import scala.collection.mutable

/**
 * A base trait for maps that can be mutated
 */
object Map_ {
    def main(args: Array[String]): Unit = {
        val map0 = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2) // 通过伴生对象创建
        println(map0)
    }
}
