package sd_container.Array_

import scala.collection.mutable.ArrayBuffer

object ff_z {
    def main(args: Array[String]): Unit = {
        val arr_buff = ArrayBuffer(1, 2, 3, 4)
        // 可变转不可变
        val newArr = arr_buff.toArray
        println(arr_buff)
        println(newArr.mkString("_"))

        // 不可变转可变
        val buffer = newArr.toBuffer
        println(buffer)
        println(newArr)
    }
}
