package sd_container.function_test.advanced_functions

import org.junit.Test

/**
 * reduce:Array/ArrayBuffer/String/Range/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 * Reduces the elements of this traversable or iterator using the specified associative binary operator.
 */
class Test_reduce {
    @Test
    def Test0(): Unit = {
        val list = List(1, 2, 3, 4)

        val my_sum = list.reduce((a, b) => a + b) // 底层实现为reduceLeft
        println(my_sum)

        println(list.reduceLeft((a, b) => a + b))
        println(list.reduceRight((a, b) => a + b))
    }

    @Test
    def Test1(): Unit = {
        val list1 = List(3, 4, 5, 8, 10)
        println(list1.reduce((a, b) => a - b))

        // 3 - 4 - 5 - 8 -10
        println(list1.reduceLeft((a, b) => a - b))

        // 3 - (4 - (5 - (8-10)))
        println(list1.reduceRight((a, b) => a - b))
    }

    @Test
    def Test2(): Unit = {
        val map = Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map.reduce((a, b) => (a._1 + b._1, a._2 + b._2))) // element为Tuple2类型
    }

    @Test
    def Test3(): Unit = {
        val str = "duanchaoduanmengmengchongya"
        println(str.reduce((a, b) => {
            val sum = a.toInt + b.toInt
            sum.toChar
        })) // element为Char类型
    }
}
