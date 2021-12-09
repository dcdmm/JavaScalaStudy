package sd_container.function_test.advanced_functions

import org.junit.Test

/**
 * flatten:Array/ArrayBuffer/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 */
class Test_flatten {
    @Test
    def Test_Array(): Unit = {
        val nesedList = Array(List(1, 2, 3), List(5, 6, 7))
        val flatList = nesedList.flatten
        println(flatList.mkString("Array(", ", ", ")"))
    }

    @Test
    def Test_List(): Unit = {
        val nesedList = List(List(1, 2, 3), List(5, 6, 7))
        val flatList = nesedList.flatten
        println(flatList)
    }

    @Test
    def Test_Set(): Unit = {
        val nesedList = Set(List(1, 2, 3), List(5, 6, 7))
        val flatList = nesedList.flatten
        println(flatList)
    }
}
