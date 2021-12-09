package sd_container.function_test

import org.junit.Test

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

class Test_other {
    @Test
    def Test_head(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        val arrBuffer = ArrayBuffer(1, 2, 3, 4, 5)
        val str = "duanchao"
        val ran = Range(1, 14, 3)
        val list = List(1, 2, 3, 4, 5)
        val listBuffer = ListBuffer(1, 2, 3, 4, 5)
        val set = Set(1, 2, 3, 4, 5)
        val set_mutable = mutable.Set(1, 2, 3, 4, 5)
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        val map_mutable = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        println("arr.head:" + arr.head)
        println("arrBuffer.head:" + arrBuffer.head)
        println("str.head:" + str.head)
        println("ran.head:" + ran.head)
        println("list.head:" + list.head)
        println("listBuffer.head:" + listBuffer.head)
        println("set.head:" + set.head)
        println("set_mutable.head:" + set_mutable.head)
        println("map.head:" + map.head)
        println("map_mutable.head:" + map_mutable.head)
    }

    @Test
    def Test_last(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        val arrBuffer = ArrayBuffer(1, 2, 3, 4, 5)
        val str = "duanchao"
        val ran = Range(1, 14, 3)
        val list = List(1, 2, 3, 4, 5)
        val listBuffer = ListBuffer(1, 2, 3, 4, 5)
        val set = Set(1, 2, 3, 4, 5)
        val set_mutable = mutable.Set(1, 2, 3, 4, 5)
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        val map_mutable = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        // Selects the last element.
        println("arr.last:" + arr.last)
        println("arrBuffer.last:" + arrBuffer.last)
        println("str.last:" + str.last)
        println("ran.last:" + ran.last)
        println("list.last:" + list.last)
        println("listBuffer.last:" + listBuffer.last)
        println("set.last:" + set.last)
        println("set_mutable.last:" + set_mutable.last)
        println("map.last:" + map.last)
        println("map_mutable.last:" + map_mutable.last)
    }

    @Test
    def Test_tail(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        val arrBuffer = ArrayBuffer(1, 2, 3, 4, 5)
        val str = "duanchao"
        val ran = Range(1, 14, 3)
        val list = List(1, 2, 3, 4, 5)
        val listBuffer = ListBuffer(1, 2, 3, 4, 5)
        val set = Set(1, 2, 3, 4, 5)
        val set_mutable = mutable.Set(1, 2, 3, 4, 5)
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        val map_mutable = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        // Selects all elements except the first.
        println("arr.tail:" + arr.tail.mkString("Array(", ", ", ")"))
        println("arrBuffer.tail:" + arrBuffer.tail)
        println("str.tail:" + str.tail)
        println("ran.tail:" + ran.tail)
        println("list.tail:" + list.tail)
        println("listBuffer.tail:" + listBuffer.tail)
        println("set.tail:" + set.tail)
        println("set_mutable.tail:" + set_mutable.tail)
        println("map.tail:" + map.tail)
        println("map_mutable.tail:" + map_mutable.tail)
    }

    @Test
    def Test_init(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        val arrBuffer = ArrayBuffer(1, 2, 3, 4, 5)
        val str = "duanchao"
        val ran = Range(1, 14, 3)
        val list = List(1, 2, 3, 4, 5)
        val listBuffer = ListBuffer(1, 2, 3, 4, 5)
        val set = Set(1, 2, 3, 4, 5)
        val set_mutable = mutable.Set(1, 2, 3, 4, 5)
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        val map_mutable = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        // Selects all elements except the last.
        println("arr.init:" + arr.init.mkString("Array(", ", ", ")"))
        println("arrBuffer.init:" + arrBuffer.init)
        println("str.init:" + str.init)
        println("ran.init:" + ran.init)
        println("list.init:" + list.init)
        println("listBuffer.init:" + listBuffer.init)
        println("set.init:" + set.init)
        println("set_mutable.init:" + set_mutable.init)
        println("map.init:" + map.init)
        println("map_mutable.init:" + map_mutable.init)
    }

    @Test
    def Test_take(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        val arrBuffer = ArrayBuffer(1, 2, 3, 4, 5)
        val str = "duanchao"
        val ran = Range(1, 14, 3)
        val list = List(1, 2, 3, 4, 5)
        val listBuffer = ListBuffer(1, 2, 3, 4, 5)
        val set = Set(1, 2, 3, 4, 5)
        val set_mutable = mutable.Set(1, 2, 3, 4, 5)
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        val map_mutable = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        def take(n: Int): List[A]
            Selects first n elements.

        def takeRight(n: Int): List[A]
            Selects last n elements.
         */
        println("arr.take:" + arr.take(3).mkString("Array(", ", ", ")"))
        println("arr.takeRight:" + arr.takeRight(3).mkString("Array(", ", ", ")"))

        println("arrBuffer.take:" + arrBuffer.take(3))
        println("str.take:" + str.take(3))
        println("ran.take:" + ran.take(3))
        println("list.take:" + list.take(3))
        println("listBuffer.take:" + listBuffer.take(3))
        println("set.take:" + set.take(3))
        println("set_mutable.take:" + set_mutable.take(3))
        println("map.take:" + map.take(3))
        println("map_mutable.take:" + map_mutable.take(3))
    }
}
