package sd_container.function_test

import org.junit.Test

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * 转换为迭代器测试
 */
class Test_iterator {
    @Test
    def Contains_Array(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        val iter = arr.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }

    @Test
    def Contains_ArrayBuffer(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        val iter = arr.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }

    @Test
    def Contains_String(): Unit = {
        val str = "duanchao"
        val iter = str.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }

    @Test
    def Contains_Range(): Unit = {
        val ran = Range(1, 14, 3)
        val iter = ran.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }

    @Test
    def Contains_List(): Unit = {
        val list = List(1, 2, 3, 4, 5)
        val iter = list.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }

    @Test
    def Contains_ListBuffer(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)
        val iter = list.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }

    @Test
    def Contains_Set(): Unit = {
        val set = Set(1, 2, 3, 4, 5)
        val iter = set.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }

    @Test
    def Contains_Set_mutable(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)
        val iter = set.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }

    @Test
    def Contains_Map(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        val iter = map.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }

    @Test
    def Contains_Map_mutable(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)
        val iter = map.iterator
        while (iter.hasNext) {
            println(iter.next())
        }
    }
}
