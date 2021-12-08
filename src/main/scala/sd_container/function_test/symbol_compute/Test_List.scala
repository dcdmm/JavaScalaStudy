package sd_container.function_test.symbol_compute

import org.junit.Test

/**
 * List(不可变列表) :+ +: ++ ++: :: :::测试
 */
class Test_List {
    @Test
    def Test_:+(): Unit = {
        val list = List(1, 2, 3, 4, 5)

        val list0 = list :+ 6 // 右侧添加元素
        println(list0)
        println(list) // list不变
    }

    @Test
    def Test_+:(): Unit = {
        val list = List(1, 2, 3, 4, 5)

        val list0 = 0 +: list // 左侧添加元素
        println(list0)
        println(list) // list不变
    }

    @Test
    def Test_++(): Unit = {
        val list = List(1, 2, 3, 4, 5)

        /*
        Returns a new list containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the list is the most specific superclass encompassing the element types of the two operands.

        B: the element type of the returned collection.
        that: the traversable to append.
        returns: a new list which contains all elements of this list followed by all elements of that.
         */
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++ list
        println(result1)

        val result2 = list ++ Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }

    @Test
    def Test_++:(): Unit = {
        val list = List(1, 2, 3, 4, 5)

        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one.
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++: list
        println(result1)

        val result2 = list ++: Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }

    @Test
    def Test_::(): Unit = {
        println(0 :: 1 :: List(2, 3)) // 列表前添加元素
        println(List(2, 3).::(1).::(0))

        // Nil:The empty list.
        println(0 :: 1 :: 2 :: 3 :: Nil)
    }

    @Test
    def Test_:::(): Unit = {
        println(List(1, 2) ++ List(3, 4))

        // Adds the elements of a given list in front of this list.
        println(List(1, 2) ::: List(3, 4))
        println(List(3, 4).:::(List(1, 2)))
    }
}
