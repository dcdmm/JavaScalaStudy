package sd_container.function_test.symbol_compute

import org.junit.Test

import scala.collection.mutable.ListBuffer

/**
 * ListBuffer(可变列表) - -= :+ +: += ++ ++: ++= -- --=测试
 */
class Test_ListBuffer {
    @Test
    def Test_-(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        val list0 = list - 5
        println(list0)
        println(list) // list不变
    }

    @Test
    def Test_-=(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        list -= 5 -= 4
        println(list) // list改变

        // moves two or more elements from this shrinkable collection.
        list.-=(2, 3)
        println(list)
    }

    @Test
    def Test_:+(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        val list0 = list :+ 6 // 右侧添加元素
        println(list0)
        println(list) // list不变
    }

    @Test
    def Test_+:(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        val list0 = 0 +: list // 左侧添加元素
        println(list0)
        println(list) // list不变
    }


    @Test
    def Test_+=(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        list += 6 += 7
        println(list)

        // adds two or more elements to this growable collection.
        list.+=(8, 9, 10)
        println(list)
    }

    @Test
    def Test_++(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        /*
        Creates a new collection containing both the elements of this collection and the provided traversable object.

        B: the element type of the returned collection.
        that: the traversable to append.
        returns: a new list buffer which contains all elements of this list buffer followed by all elements of that.
         */
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++ list
        println(result1)
        println(list) // list不变

        val result2 = list ++ Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }

    @Test
    def Test_++:(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one.
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++: list
        println(result1)
        println(list) // list不变

        val result2 = list ++: Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }

    @Test
    def Test_++=(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        /*
        Appends all elements produced by a TraversableOnce to this list buffer.

        Appends all elements produced by a TraversableOnce to this list buffer.
        xs: the TraversableOnce producing the elements to append.
        returns: the list buffer itself.
         */
        list ++= Set(1, 2, 3)
        println(list)
    }

    @Test
    def Test_--(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        /*
        Creates a new collection with all the elements of this collection except those provided by the specified traversable object.

        xs: the traversable object.
        returns: a new collection with all the elements of this collection except those in xs
         */
        val list0 = list -- Set(1, 2, 3)
        println(list0) // list不变
        println(list)
    }

    @Test
    def Test_--=(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        /*
        Removes all elements produced by an iterator from this shrinkable collection.

        xs: the iterator producing the elements to remove.
        returns: the shrinkable collection itself
         */
        list --= Set(1, 2, 3)
        println(list)
    }
}
