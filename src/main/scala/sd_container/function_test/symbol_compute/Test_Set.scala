package sd_container.function_test.symbol_compute

import org.junit.Test

/**
 * Set(不可变集合) + - ++ ++: --测试
 */
class Test_Set {
    @Test
    def Test_+(): Unit = {
        val set = Set(1, 2, 3, 4, 5)

        val set0 = set + 6
        println(set0)
        println(set) // set不变(Set为不可变集合)
    }

    @Test
    def Test_-(): Unit = {
        val set = Set(1, 2, 3, 4, 5)

        val set0 = set - 5
        println(set0)
        println(set) // set不变(Set为不可变集合)
    }

    @Test
    def Test_++(): Unit = {
        val set = Set(1, 2, 3, 4, 5)

        /*
        Returns a new set containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the set is the most specific superclass encompassing the element types of the two operands.

        B: the element type of the returned collection.
        that: the traversable to append.
        returns: a new set which contains all elements of this set followed by all elements of that.
         */
        val result1 = set ++ Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result1)

        val result2 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++ set
        println(result2)
    }

    @Test
    def Test_++:(): Unit = {
        val set = Set(1, 2, 3, 4, 5)

        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one.
        val result1 = set ++: Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result1)

        val result2 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++: set
        println(result2)
    }

    @Test
    def Test_--(): Unit = {
        val set = Set(1, 2, 3, 4, 5)

        /*
        Creates a new collection from this collection by removing all elements of another collection.

        xs: the collection containing the removed elements.
        returns: a new collection that contains all elements of the current collection except one less occurrence of each of the elements of elems.
         */
        val set1 = set -- List(1, 2)
        println(set1) // 无序
    }
}
