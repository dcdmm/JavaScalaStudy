package sd_container.function_test.symbol_compute

import org.junit.Test

import scala.collection.mutable.ArrayBuffer

/**
 * ArrayBuffer(可变数组) - -= :+ +: += ++ ++: ++= -- --=测试
 */
class Test_ArrayBuffer {
    @Test
    def Test_-(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)

        // Creates a new collection with all the elements of this collection except elem.
        val arr1 = arr - 2 - 3
        println(arr1)
        println(arr) // arr不变

        // Creates a new collection with all the elements of this collection except the two or more specified elements.
        val arr2 = arr.-(2, 3)
        println(arr2)
        println(arr) // arr不变
    }

    @Test
    def Test_-=(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)

        arr -= 2 -= 3
        println(arr) // arr改变

        // Removes two or more elements from this shrinkable collection.
        arr.-=(2, 3)
        println(arr) // arr改变
    }

    @Test
    def Test_:+(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)

        val arr0 = arr :+ 6 // 右测添加元素
        println(arr0)
        println(arr) // arr不变
    }

    @Test
    def Test_+:(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)

        val arr0 = 0 +: arr // 左侧添加元素
        println(arr0)
        println(arr) // arr不变
    }

    @Test
    def Test_+=(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)

        arr += 6
        println(arr)

        // adds two or more elements to this growable collection.
        arr.+=(7, 8, 9)
        println(arr)
    }

    @Test
    def Test_++(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        /*
        Returns a new array buffer containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the array buffer is the most specific superclass encompassing the element types of the two operands.

        B: the element type of the returned collection.
        that: the traversable to append.
        returns: a new array buffer which contains all elements of this array buffer followed by all elements of that.
         */
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++ arr
        println(result1)
        println(arr) // arr不变

        val result2 = arr ++ Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }

    @Test
    def Test_++:(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        // It differs from ++ in that the right operand determines the type of the resulting collection rather than the left one.
        val result1 = Map("a" -> 0, "b" -> 1, "c" -> 2) ++: arr
        println(result1)
        println(arr) // arr不变

        val result2 = arr ++: Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(result2)
    }

    @Test
    def Test_++=(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        /*
        Appends a number of elements provided by a traversable object. The identity of the buffer is returned.

         Appends a number of elements provided by a traversable object. The identity of the buffer is returned.
         xs: the traversable object.
         returns: the updated buffer.
         */
        arr ++= Set(1, 2, 3)
        println(arr)
    }

    @Test
    def Test_--(): Unit = {
        /*
        Creates a new collection with all the elements of this collection except those provided by the specified traversable object.

        Creates a new collection with all the elements of this collection except those provided by the specified traversable object.
        xs: the traversable object.
        returns: a new collection with all the elements of this collection except those in xs
         */
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        val arr1 = arr -- Set(1, 2, 3)
        println(arr1)
        println(arr) // arr不变
    }

    @Test
    def Test_--=(): Unit = {
        /*
        Removes all elements produced by an iterator from this shrinkable collection.

        Removes all elements produced by an iterator from this shrinkable collection.
        xs: the iterator producing the elements to remove.
        returns: the shrinkable collection itself
         */
        val arr = ArrayBuffer(1, 2, 3, 4, 5)
        arr --= Set(1, 2, 3)
        println(arr)
    }
}
