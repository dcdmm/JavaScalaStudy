package se_pattern_matching

import org.junit.Test

/**
 * 通过集合进行赋值(支持Tuple,Array,ArrayBuffer,List,ListBuffer)
 */
class Test_assignment {
    @Test
    def Test0(): Unit = {
        val (x_tuple, y_tuple) = (10, 23)
        println(x_tuple)
        println(y_tuple)
        println("***************************************************")

        val Array(x_arr, y_arr) = Array(10, 23)
        println(x_arr)
        println(y_arr)
        println("***************************************************")

        val List(x_list, y_list) = List(10, 23)
        println(x_list)
        println(y_list)
        println("***************************************************")

        // 不匹配某个位置元素的值(通过 _)
        val List(x_list0, y_list1, _) = List(10, 23, 11)
        println(x_list0)
        println(y_list1)
    }


    @Test
    def Test1(): Unit = {
        // 只匹配第一个和第二个位置处元素的值(通过 _*)
        val List(first, second, _*) = List(34, 1324)
        println(s"first: $first; second: $second")

        // List特殊用法
        // fir表示第一个位置元素的值,sec表示第二个位置元素的值,res表示由其余元素组成的List
        val fir :: sec :: res = List(34, 1324, 23)
        println(s"fir: $fir; sec: $sec; res: $res")
    }

    @Test
    def Test2(): Unit = {
        val list_tuple: List[(String, Int)] = List(("a", 12), ("b", 23), ("a", 2342))

        for ((word, count) <- list_tuple) {
            println(word + " " + count)
        }
        println("****************************************************")

        for ((word, _) <- list_tuple) {
            println(word)
        }
        println("****************************************************")

        // 限定某个位置的值
        for (("a", count) <- list_tuple) {
            println(count)
        }
        println("****************************************************")
        println("****************************************************")

        val list_arr = List(Array("a", 12), Array("b", 23), Array("a", 2342))

        for (Array(word, count) <- list_arr) {
            println(word + " " + count)
        }
        println("****************************************************")

        for (Array(word, _) <- list_arr) {
            println(word)
        }
        println("****************************************************")

        for (Array("a", count) <- list_arr) {
            println(count)
        }
    }
}
