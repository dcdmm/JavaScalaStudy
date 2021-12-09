package sd_container.function_test.advanced_functions

import org.junit.Test

/**
 * filter(过滤):Array/ArrayBuffer/String/Range/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 */
class Test_filter {
    @Test
    def Test0(): Unit = {
        val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

        // 过滤
        val list_filter = list.filter(elem => elem % 2 == 0)
        println(list_filter)
    }

    @Test
    def Test1(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2, "d" -> 3, "e" -> 4)

        val map_filter = map.filter(elem => elem._2 / 2 ==0)
        println(map_filter)
    }

    @Test
    def Test2(): Unit = {
        val str = "dcdmmcomeon"

        val str_filter = str.filter(elem => elem == 'd')
        println(str_filter)
    }
}
