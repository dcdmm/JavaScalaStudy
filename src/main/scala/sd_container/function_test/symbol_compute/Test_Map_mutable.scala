package sd_container.function_test.symbol_compute

import org.junit.Test

import scala.collection.mutable

/**
 * mutable.Set(可变字典) - + -+ += ++ ++: ++= -- --=测试
 */
class Test_Map_mutable {
    @Test
    def Test_-(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)
        val map0 = map - "a"
        println(map0)
        println(map) // map不变

        // Creates a new map with all the key/value mappings of this map except mappings with keys equal to any of the two or more specified keys.
        val map1 = map.-("a", "b", "c")
        println(map1)
    }

    @Test
    def Test_+(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        Creates a new map containing a new key/value mapping and all the key/value mappings of this map.
        Mapping kv will override existing mappings from this map with the same key.

        B1: the type of the value in the key/value pair.
        kv: the key/value mapping to be added
        returns: a new map containing mappings of this map and the mapping kv.
         */
        val map0 = map + (("d", 4))
        println(map0)
        println(map) // map不变

        // Creates a new map containing two or more key/value mappings and all the key/value mappings of this map.
        val map1 = map.+(("d", 4), ("e", 5))
        println(map1)
    }

    @Test
    def Test_-=(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        map -= "a"
        println(map)
    }

    @Test
    def Test_+=(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        map += (("D", 3))
        println(map)
    }

    @Test
    def Test_++(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        Returns a new mutable map containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the mutable map is the most specific superclass encompassing the element types of the two operands.

        B: the element type of the returned collection.
        that: the traversable to append.
        returns: a new mutable map which contains all elements of this mutable map followed by all elements of that.
         */
        val result0 = map ++ Set(1, 2, 3, 4)
        println(result0)
        println(map) // map不变

        val result1 = Set(1, 2, 3, 4) ++ map
        println(result1)

        val result2 = map ++ Map("D" -> 3, "E" -> 4)
        println(result2)
    }

    @Test
    def Test_++:(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one
        val result0 = map ++: Set(1, 2, 3, 4)
        println(result0)
        println(map) // map不变

        val result1 = Set(1, 2, 3, 4) ++: map
        println(result1)

        val result2 = map ++: Map("D" -> 3, "E" -> 4)
        println(result2)
    }

    @Test
    def Test_++=(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        adds all elements produced by a TraversableOnce to this growable collection.

        xs: the TraversableOnce producing the elements to add.
        returns: the growable collection itself.
         */
        map ++= Map("D" -> 3, "e" -> 4)
        println(map)
    }

    @Test
    def Test_--(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        Creates a new map with all the key/value mappings of this map except mappings with keys equal to any of those provided by the specified traversable object.

        xs: the traversable object.
        returns: a new map with all the key/value mappings of this map except mappings with a key equal to a key from xs.
         */
        val result = map -- Set("b", "c")
        println(result)
        println(map) // map不变
    }

    @Test
    def Test_--=(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        /*
        Removes all elements produced by an iterator from this shrinkable collection.

        xs: the iterator producing the elements to remove.
        returns: the shrinkable collection itself
         */
        map -- Set("b", "c")
        println(map)
    }
}
