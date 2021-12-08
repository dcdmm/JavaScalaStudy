package sd_container.function_test.symbol_compute

import org.junit.Test

/**
 * Map(不可变字典) + - ++ ++: --测试
 */
class Test_Map {
    @Test
    def Test_+(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        Adds a key/value pair to this map, returning a new map.

        kv: the key/value pair
        returns: a new map with the new binding added to this map
         */
        val map0 = map + (("d", 4))
        println(map0)
        println(map) // map不变

        // This method takes two or more key/value pairs.
        val map1 = map.+(("d", 4), ("e", 5))
        println(map1)
    }

    @Test
    def Test_-(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        Removes a key from this map, returning a new map.
        key: the key to be removed
        returns: a new map without a binding for key
         */
        val map0 = map - "a"
        println(map0)
        println(map)

        // This method takes two or more elements to be removed.
        val map1 = map.-("a", "b", "c")
        println(map1)
    }

    @Test
    def Test_++(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        Returns a new map containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the map is the most specific superclass encompassing the element types of the two operands.

        B: the element type of the returned collection.
        that: the traversable to append.
        returns: a new map which contains all elements of this map followed by all elements of that.
         */
        val result0 = map ++ Set(1, 2, 3, 4)
        println(result0)

        val result1 = Set(1, 2, 3, 4) ++ map
        println(result1)

        val result2 = map ++ Map("D" -> 3, "E" -> 4)
        println(result2)
    }

    @Test
    def Test_++:(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)

        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one.
        val result0 = map ++: Set(1, 2, 3, 4)
        println(result0)

        val result1 = Set(1, 2, 3, 4) ++: map
        println(result1)

        val result2 = map ++: Map("D" -> 3, "E" -> 4)
        println(result2)
    }

    @Test
    def Test_--(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        Creates a new collection from this collection by removing all elements of another collection.

        xs: the collection containing the removed elements.
        returns: a new collection that contains all elements of the current collection except one less occurrence of each of the elements of elems.
         */
        val result1 = map -- Set("a", "b")
        println(result1)
    }
}
