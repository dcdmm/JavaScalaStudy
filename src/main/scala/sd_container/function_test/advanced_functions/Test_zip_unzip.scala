package sd_container.function_test.advanced_functions

import org.junit.Test

/**
 * zip(类似python zip函数):Array/ArrayBuffer/String/Range/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 * unzip:Array/ArrayBuffer/Range/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 */
class Test_zip_unzip {
    @Test
    def Test(): Unit = {
        val list0 = List(1, 3, 5, 7, 2, 89)
        val list1 = List(3, 7, 2, 45, 4, 8, 19)

        val zip_01 = list1.zip(list0)
        println(zip_01)

        val zip_10 = list0.zip(list1)
        println(zip_10)

        // Converts this collection of pairs into two collections of the first and second half of each pair.
        println(zip_01.unzip)
        println(zip_10.unzip)
    }

    @Test
    def Test1(): Unit = {
        val list = List(1, 3, 5, 7, 2, 89)
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)

        val zip_01 = list.zip(map)
        println(zip_01)

        val zip_10 = map.zip(list)
        println(zip_10)

        println(zip_01.unzip)
        println(zip_10.unzip)
    }
}
