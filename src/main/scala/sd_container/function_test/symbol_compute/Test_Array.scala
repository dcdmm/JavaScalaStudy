package sd_container.function_test.symbol_compute

import org.junit.Test

/**
 * Array(不可变数组) :+ +: ++ ++: 测试
 */
class Test_Array {
    @Test
    def Test_:+(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)

        val arr0 = arr :+ 6 // 右侧添加元素
        println(arr0.mkString("Array(", ", ", ")"))
        println(arr.mkString("Array(", ", ", ")")) // arr不变(arr为不可变数组)
    }

    @Test
    def Test_+:(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)

        val arr0 = 0 +: arr // 左侧添加元素
        println(arr0.mkString("Array(", ", ", ")"))
    }

    @Test
    def Test_++(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)
        /*
        Returns a new array containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the array is the most specific superclass encompassing the element types of the two operands.

        B: the element type of the returned collection.
        that: the traversable to append.
        returns: a new array which contains all elements of this array followed by all elements of that.
         */
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++ arr
        println(result1)

        val result2 = arr ++ Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2.mkString("Array(", ", ", ")"))
    }

    @Test
    def Test_++:(): Unit = {
        val arr = Array(1, 2, 3, 4, 5)

        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++: arr
        println(result1.mkString("Array(", ", ", ")"))

        val result2 = arr ++: Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }
}
