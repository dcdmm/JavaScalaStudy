package sd_container.function_test.symbol_compute

import org.junit.Test

/**
 * String :+ +: ++ ++: 测试
 */
class Test_String {
    @Test
    def Test_:+(): Unit = {
        val str = "duanchao"

        val vec = str :+ "!" // 右侧添加元素
        println(vec)
        println(str) // str不变
    }

    @Test
    def Test_+:(): Unit = {
        val str = "duanchao"

        val vec = "!" +: str // 左侧添加元素
        println(vec)
        println(str) // str不变
    }

    @Test
    def Test_++(): Unit = {
        val str = "duanchao"

        /*
        Returns a new string containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the string is the most specific superclass encompassing the element types of the two operands.

        B: the element type of the returned collection.
        that: the traversable to append.
        returns: a new string which contains all elements of this string followed by all elements of that.
         */
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++ str
        println(result1)

        val result2 = str ++ Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }

    @Test
    def Test_++:(): Unit = {
        val str = "duanchao"

        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one. Mnemonic
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++: str
        println(result1)

        val result2 = str ++: Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }
}
