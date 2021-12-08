package sd_container.function_test

import org.junit.Test

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * 是否包含(contains)
 * 是否为空(isEmpty)
 */
class Test_contains_isEmpty {
    @Test
    def Contains_Array(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        println(arr.contains(3))
        println(arr.isEmpty)
    }

    @Test
    def Contains_ArrayBuffer(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        println(arr.contains(1))
        println(arr.isEmpty)
    }

    @Test
    def Contains_String(): Unit = {
        val str = "duanchao"
        println(str.contains('d'))
        println(str.isEmpty)
    }

    @Test
    def Contains_Range(): Unit = {
        val ran = Range(1, 14, 3)
        println(ran.contains(4))
        println(ran.isEmpty)
    }

    @Test
    def Contains_List(): Unit = {
        val list = List(1, 2, 3, 4, 5)
        println(list.contains(3))
        println(list.isEmpty)
    }

    @Test
    def Contains_ListBuffer(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)
        println(list.contains(3))
        println(list.isEmpty)
    }

    @Test
    def Contains_Set(): Unit = {
        val set = Set(1, 2, 3, 4, 5)
        println(set.contains(3))
        println(set.isEmpty)
    }

    @Test
    def Contains_Set_mutable(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)
        println(set.contains(3))
        println(set.isEmpty)
    }

    @Test
    def Contains_Map(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        // Tests whether this map contains a binding for a key.
        println(map.contains("a"))
        println(map.isEmpty)
    }

    @Test
    def Contains_Map_mutable(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map.contains("s"))
        println(map.isEmpty)
    }
}
