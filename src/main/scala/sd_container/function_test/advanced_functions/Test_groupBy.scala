package sd_container.function_test.advanced_functions

import org.junit.Test

/**
 * groupBy(分组):Array/ArrayBuffer/String/Range/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 */
class Test_groupBy {
    @Test
    def Test0(): Unit = {
        val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val groupMap = list.groupBy(data => {
            if (data % 2 == 0) {
                "偶数"
            } else {
                "奇数"
            }
        })
        println(groupMap)
    }

    @Test
    def Test1(): Unit = {
        val list = "duanchaoduanmengmengcomeon!"
        val groupMap = list.groupBy(data => {
            if (data == 'd') {
                "first name"
            } else {
                "second name"
            }
        })
        println(groupMap)
    }

    @Test
    def Test2(): Unit = {
        val map = Map("a" -> 0, "b" -> 1, "c" -> 2, "d" -> 3, "e" -> 4, "f" -> 5, "g" -> 6, "h" -> 7)
        val groupMap = map.groupBy(data => {
            if (data._2 % 2 == 0) {
                "偶数"
            } else {
                "奇数"
            }
        })
        println(groupMap)
    }
}
