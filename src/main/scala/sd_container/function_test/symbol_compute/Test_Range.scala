package sd_container.function_test.symbol_compute

import org.junit.Test

/**
 * Range :+ +: ++ ++: 测试
 */
class Test_Range {
    @Test
    def Test_:+(): Unit = {
        val ran = 1 to 3

        val ran1 = ran :+ 4 // 右侧添加元素
        println(ran1)
        println(ran) // arr不变
    }

    @Test
    def Test_+:(): Unit = {
        val ran = 1 to 3

        val ran1 = 0 +: ran // 左侧添加元素
        println(ran1)
        println(ran) // arr不变
    }

    @Test
    def Test_++(): Unit = {
        val ran = 1 to 3
        /*
        Returns a new range containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the range is the most specific superclass encompassing the element types of the two operands.

        B: the element type of the returned collection.
        that: the traversable to append.
        returns: a new range which contains all elements of this range followed by all elements of that.
         */
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++ ran
        println(result1)

        val result2 = ran ++ Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }

    @Test
    def Test_++:(): Unit = {
        val ran = 1 to 3

        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one.
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++: ran
        println(result1)

        val result2 = ran ++: Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }
}
