package sd_container.function_test.compute

import org.junit.Test

/**
 * 求和/求积:集合元素为数值类型(Byte, Short, Int(默认整形), Long, Float, Double(默认浮点型), Char, Boolean)
 * 最大最小值:Array/ArrayBuffer/String/Range/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 * 排序:Array/ArrayBuffer/String/Range/List/ListBuffer
 * 反转:Array/ArrayBuffer/String/Range/List/ListBuffer
 */
class Test_Math0 {
    @Test
    def Test_sum(): Unit = {
        val arr = Array(1, 2, 3)
        println(arr.sum)

        val str = "12"
        // '1'的ASCII码:31
        // '2'的ASCII码:32
        // ASCII码之和为:63
        // ASCII码为63的字符为'c'
        println(str.sum)

        val ran = Range.inclusive(1, 3)
        println(ran.sum)

        val list = List(1, 2, 3)
        println(list.sum)

        val set = Set(1, 2, 3)
        println(set.sum)
    }

    @Test
    def Test_product(): Unit = {
        /**
         * 与sum同理
         */
        val list = List(1, 3, 4, -2, 9, 10, 7)
        println(list.product)
    }

    @Test
    def Test_max_min(): Unit = {
        val list = List(1, 3, 4, -2, 9, 10, 7)
        println(list.max)

        val list1 = List(("a", 1), ("b", 3), ("c", 4), ("d", -2), ("e", 9), ("g", 10), ("h", 7))
        // 指定比较键(非Scala数值类型时)
        println(list1.maxBy(tuple => tuple._2))

        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map.maxBy(tuple => tuple._2))
    }

    @Test
    def Test_sort(): Unit = {
        val list = List(1, 3, 4, -2, 9, 10, 7)
        println(list.sorted)
        println(list.sorted(Ordering[Int].reverse)) // 从大到小
        println(list.sortWith((a, b) => a < b)) // 自定义排序规则,类似Java中的compare
        val list1 = List(("a", 1), ("b", 3), ("c", 4), ("d", -2), ("e", 9), ("g", 10), ("h", 7))
        // 指定比较键(非Scala数值类型时)
        println(list1.sortBy(tuple => tuple._2)(Ordering[Int].reverse))
    }

    @Test
    def Test_reverse(): Unit = {
        val list = List(1, 3, 4, -2, 9, 10, 7)
        // 元素顺序反转
        println(list.reverse)
    }
}
