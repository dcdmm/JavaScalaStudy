package sd_container.function_test.transform

import org.junit.Test

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * toSet
 */
class Test_toSet {
    @Test
    def Test_Array(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        println(arr.toSet)
    }

    @Test
    def Test_ArrayBuffer(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        println(arr.toSet)
    }

    @Test
    def Test_String(): Unit = {
        val str = "duanchao"
        println(str.toSet)
    }

    @Test
    def Test_Range(): Unit = {
        val ran = Range(1, 14, 3)
        println(ran.toSet)
    }

    @Test
    def Test_List(): Unit = {
        val list = List(1, 2, 3, 4, 5)
        println(list.toSet)
    }

    @Test
    def Test_List_immutable(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)
        println(list.toSet)
    }

    @Test
    def Test_Set_mutable(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)
        println(set.toSet)
    }

    @Test
    def Test_Map(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map.toSet)
    }

    @Test
    def Test_Map_mutable(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map.toSet)
    }
}
