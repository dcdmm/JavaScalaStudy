package sd_container.function_test

import org.junit.Test

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * 集合长度
 */
class Test_length_size {
    @Test
    def Contains_Array(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        println(arr.length)
    }

    @Test
    def Contains_ArrayBuffer(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        println(arr.length)
    }

    @Test
    def Contains_String(): Unit = {
        val str = "duanchao"
        println(str.length)
    }

    @Test
    def Contains_Range(): Unit = {
        val ran = Range(1, 14, 3)
        println(ran.size)
    }

    @Test
    def Contains_List(): Unit = {
        val list = List(1, 2, 3, 4, 5)
        println(list.size)
    }

    @Test
    def Contains_ListBuffer(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)
        println(list.size)
    }

    @Test
    def Contains_Set(): Unit = {
        val set = Set(1, 2, 3, 4, 5)
        println(set.size)
    }

    @Test
    def Contains_Set_mutable(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)
        println(set.size)
    }

    @Test
    def Contains_Map(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map.size)
    }

    @Test
    def Contains_Map_mutable(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map.size)
    }
}
