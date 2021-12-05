package sd_container.Array_

import scala.collection.mutable.ArrayBuffer

object zz {
    def main(args: Array[String]): Unit = {
        val arr0 = ArrayBuffer[Int]()
        val arr1 = ArrayBuffer(1, 2, 3, 4, 5)

        println(arr0)
        println(arr0.mkString("-")) // arr0没有任何元素

        println(arr1.toString())
        println(arr1) // 与上等价

        println(arr1(0))
        arr1(0) = 111
        println(arr1(0))
        println("*************************")
        // 添加元素
        //        val newArr1 = arr0 :+ 15
        //        println(newArr1)
        //        println(newArr1 == arr0)
        //
        //        arr0 += 19
        //        println(arr0)
        //
        //        22 +=: arr0
        //        println(arr0)
        arr0.append(23, 231)  // 后面
        arr0.prepend(11, 34) // 前面
        println(arr0)
        arr0.insert(0, 11, 22) // 任意位置添加
        println(arr0)
        arr0.insertAll(2, arr1)
        arr0.appendAll(arr1)
        arr0.prependAll(arr1)
        println(arr0)
        println("*" * 100)

        arr0.remove(2) // 2为索引位置
        arr0.remove(0, 2) // 从0开始删除2个
        println(arr0)

        arr0 -= 11 // 删除11(1个)
        arr0 -= 11 // 删除11
        arr0 -= 11 // 删除11
        println(arr0)
    }
}
