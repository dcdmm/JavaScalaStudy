package sd_container.Array_

import scala.collection.mutable

object mul {
    def main(args: Array[String]): Unit = {
        // 创建二维数组
        val array =Array.ofDim[Int](2, 3)
        println(array(0)(0)) // 索引

        println(array.mkString("-"))

        // 多维数组的遍历
        for (i <- array.indices; j <- array(i).indices) {
            println(array(i)(j))
        }
        println()

        // foreach
        array.foreach((elem: Array[Int]) => elem.foreach(i => println(i)))

        mutable.Stack
    }
}
