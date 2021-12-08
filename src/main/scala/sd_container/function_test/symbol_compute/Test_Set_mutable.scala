package sd_container.function_test.symbol_compute

import org.junit.Test

import scala.collection.mutable

/**
 * mutable.Set(可变集合) - -= + += ++ ++: ++= -- --=测试
 */
class Test_Set_mutable {
    @Test
    def Test_-(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        val set0 = set - 5
        println(set0)
        println(set) // set不变
    }

    @Test
    def Test_-=(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        set -= 5
        println(set)
    }

    @Test
    def Test_+(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        val set0 = set + 6
        println(set0)
        println(set) // set不变
    }

    @Test
    def Test_+=(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        set += 6
        println(set)
    }

    @Test
    def Test_++(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        /*
        Creates a new set consisting of all the elements of this set and those provided by the specified traversable object.

        xs: the traversable object.
        returns: a new set consisting of elements of this set and those in xs.
         */
        val result1 = set ++ Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result1)
        println(set)

        val result2 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++ set
        println(result2)
    }

    @Test
    def Test_++:(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one.
        val result1 = set ++: Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result1)
        println(set)

        val result2 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++: set
        println(result2)
    }

    @Test
    def Test_++=(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        /*
        adds all elements produced by a TraversableOnce to this growable collection.

        xs: the TraversableOnce producing the elements to add.
        returns: the growable collection itself.
         */
        set ++= Set(2, 3, 4, 5, 6, 7, 8)
        println(set)
    }

    @Test
    def Test_--(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        /*
        Creates a new set consisting of all the elements of this set except those provided by the specified traversable object.

        xs: the traversable object.
        returns: a new set consisting of all the elements of this set except elements from xs.
         */
        val set0 = set -- List(3, 4, 5, 6)
        println(set0)
    }

    @Test
    def Test_--=(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        /*
        Removes all elements produced by an iterator from this shrinkable collection.

        xs: the iterator producing the elements to remove.
        returns: the shrinkable collection itself
         */
        set --= List(3, 4, 5, 6)
        println(set)
    }
}
