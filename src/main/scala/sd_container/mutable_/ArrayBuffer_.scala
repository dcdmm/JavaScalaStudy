package sd_container.mutable_

import scala.collection.mutable.ArrayBuffer

/**
 * An implementation of the Buffer class using an array to represent the assembled sequence internally. Append, update and random access take constant time (amortized time).
 * Prepends and removes are linear in the buffer size.
 */
object ArrayBuffer_ {
    def main(args: Array[String]): Unit = {
        val arr0 = ArrayBuffer[Int]()
        println(arr0)
        println(arr0.mkString("-")) // arr0没有任何元素

        val arr1 = ArrayBuffer(1, 2, 3, 4, 5) // 通过伴生对象创建
        println(arr1.toString())
        println(arr1) // 与上等价
    }
}
