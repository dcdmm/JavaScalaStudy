package sd_container.immutable_

/**
 * A class for immutable linked lists representing ordered collections of elements of type A.
 */
object List_ {
    def main(args: Array[String]): Unit = {
        val list0 = List(1, 2, 3, 4, 5) // 通过伴生对象创建
        println(list0.toString())
        println(list0) // 与上等价
    }
}
