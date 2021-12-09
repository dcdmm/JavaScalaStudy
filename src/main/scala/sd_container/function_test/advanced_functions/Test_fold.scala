package sd_container.function_test.advanced_functions

import org.junit.Test

/**
 * reduce:Array/ArrayBuffer/String/Range/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 * Folds the elements of this traversable or iterator using the specified associative binary operator.
 */
class Test_fold {
    @Test
    def Test0(): Unit = {
        val list = List(1, 2, 3, 4)
        val list1 = List(3, 4, 5, 8, 10)
        // 10   + 1 + 2 + 3 + 4
        println(list.fold(10)((a, b) => a + b)) // 底层实现为reduceLeft
        println(list.foldLeft(10)((a, b) => a + b))

        // 10  - 1 - 2 -3 -4
        println(list.foldLeft(10)((a, b) => a - b))

        // 3 - (4 - (5 - (8 - (10 - 11 ))))
        println(list1.foldRight(11)((a, b) => a - b))
    }

    @Test
    def Test1(): Unit = {
        val map = Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map.fold(("A-", 0))((a, b) => (a._1 + b._1, a._2 + b._2))) // element为Tuple2类型
    }

    @Test
    def Test2(): Unit = {
        val str = "duanchaoduanmengmengchongya"
        println(str.fold(' ')((a, b) => {
            val sum = a.toInt + b.toInt
            sum.toChar
        })) // element为Char类型
    }
}
