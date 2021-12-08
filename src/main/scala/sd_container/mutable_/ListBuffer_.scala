package sd_container.mutable_

import scala.collection.mutable.ListBuffer

/**
 * A Buffer implementation backed by a list. It provides constant time prepend and append. Most other operations are linear.
 */
object ListBuffer_ {
    def main(args: Array[String]): Unit = {
        val list0: ListBuffer[Int] = new ListBuffer[Int]()
        println(list0)
        println(list0.mkString("-")) // list0没有任何元素

        val list1 = ListBuffer(1, 2, 3, 4, 5) // 通过伴生对象创建
        println(list1.toString())
        println(list1) // 与上等价
    }
}
