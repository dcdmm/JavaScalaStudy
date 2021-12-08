package sd_container.immutable_

/**
 * Array is a special kind of collection in Scala.
 * On the one hand, Scala arrays correspond one-to-one to Java arrays.
 * That is, a Scala array Array[Int] is represented as a Java int[], an Array[Double] is represented as a Java double[] and a Array[String] is represented as a Java String[].
 * But at the same time, Scala arrays offer much more than their Java analogues.
 * First, Scala arrays can be generic. That is, you can have an Array[T], where T is a type parameter or abstract type.
 * Second, Scala arrays are compatible with Scala sequences - you can pass an Array[T] where a Seq[T] is required.
 * Finally, Scala arrays also support all sequence operations.
 */
object Array_ {
    def main(args: Array[String]): Unit = {
        val arr0: Array[Int] = new Array[Int](5)
        println(arr0.mkString("Array(", ", ", ")")) // 初始值为0
        println(arr0.length) // 数组长度
        println("*******************************************************")

        val arr1 = Array(1, 2, 3, 4, 5)  // 指定元素值初始化(通过伴生对象)
        println(arr1.mkString("Array(", ", ", ")"))
    }
}
