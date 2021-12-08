package sd_container.function_test

import org.junit.Test

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * 索引(apply)
 * 修改索引(update)
 */
class Test_apply_update {
    @Test
    def applyUpdate_Array(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        println(arr(0)) // 支持索引

        arr(0) = 999
        // 支持修改索引
        println(arr.mkString("Array(", ", ", ")"))
    }

    @Test
    def applyUpdate_ArrayBuffer(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        // 支持索引
        println(arr(0))

        arr(0) = 999
        // 支持修改索引
        println(arr.mkString("Array(", ", ", ")"))
    }

    @Test
    def applyUpdate_String(): Unit = {
        val str = "duanchao"
        // 支持索引
        println(str(0))
    }

    @Test
    def applyUpdate_Range(): Unit = {
        val ran = Range(1, 14, 3)
        // 支持索引
        println(ran(0))
    }

    @Test
    def applyUpdate_List(): Unit = {
        val list = List(1, 2, 3, 4, 5)
        // 支持索引
        println(list(2))
    }

    @Test
    def applyUpdate_ListBuffer(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)
        // 支持索引
        println(list(2))

        // 支持修改索引
        list(2) = 9999
        println(list)
        list.contains()
    }
}
