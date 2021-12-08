package sd_container.function_test

import org.junit.Test

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * 元素遍历:foreach/mkString/for测试
 */
class Test_foreach_mkString_for {
    @Test
    def Contains_Array(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        arr.foreach(elem => println(elem))
        println(arr.mkString("-")) // mkSting方法来自:TraversableOnce接口
        for (i <- arr) println(i)
    }

    @Test
    def Contains_ArrayBuffer(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        arr.foreach(elem => println(elem))
        println(arr.mkString("-"))
        for (i <- arr) println(i)
    }

    @Test
    def Contains_String(): Unit = {
        val str = "duanchao"
        str.foreach(elem => println(elem))
        println(str.mkString("-"))
        for (i <- str) println(i)
    }

    @Test
    def Contains_Range(): Unit = {
        val ran = Range(1, 14, 3)
        ran.foreach(elem => println(elem))
        println(ran.mkString("-"))
        for (i <- ran) println(i)
    }

    @Test
    def Contains_List(): Unit = {
        val list = List(1, 2, 3, 4, 5)
        list.foreach(elem => println(elem))
        println(list.mkString("-"))
        for (i <- list) println(i)
    }

    @Test
    def Contains_ListBuffer(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)
        list.foreach(elem => println(elem))
        println(list.mkString("-"))
        for (i <- list) println(i)
    }

    @Test
    def Contains_Set(): Unit = {
        val set = Set(1, 2, 3, 4, 5)
        set.foreach(elem => println(elem))
        println(set.mkString("-"))
        for (i <- set) println(i)
    }

    @Test
    def Contains_Set_mutable(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)
        set.foreach(elem => println(elem))
        println(set.mkString("-"))
        for (i <- set) println(i)
    }

    @Test
    def Contains_Map(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        map.foreach(elem => println(elem))
        println(map.mkString(","))
        for (i <- map) println(i)
    }

    @Test
    def Contains_Map_mutable(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)
        map.foreach(elem => println(elem))
        println(map.mkString(","))
        for (i <- map) println(i)
    }
}
