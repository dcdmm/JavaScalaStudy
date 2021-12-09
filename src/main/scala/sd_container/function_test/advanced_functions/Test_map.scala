package sd_container.function_test.advanced_functions

import org.junit.Test

/**
 * map:Array/ArrayBuffer/String/Range/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 */
class Test_map {
    @Test
    def Test0(): Unit = {
        val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

        // 过滤
        val list_map = list.map(elem => elem * 2)
        println(list_map)
    }

    @Test
    def Test1(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2, "d" -> 3, "e" -> 4)

        val map_map = map.map(elem => elem._2 / 2 == 0)
        println(map_map)
    }

    @Test
    def Test2(): Unit = {
        val str = "dcdmmcomeon"

        val str_map = str.map(elem => elem + "!")
        println(str_map)
    }
}
