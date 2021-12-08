package sd_container.mutable_

import scala.collection.mutable

/**
 * A generic trait for mutable sets.
 */
object Set_ {
    def main(args: Array[String]): Unit = {
        val set0 = mutable.Set(1, 2, 3, 4, 5) // 通过伴生对象创建
        println(set0)
    }
}
