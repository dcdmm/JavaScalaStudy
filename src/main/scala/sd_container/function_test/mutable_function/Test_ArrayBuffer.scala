package sd_container.function_test.mutable_function

import org.junit.Test

import scala.collection.mutable.ArrayBuffer

/**
 * 可变数组方法测试
 */
class Test_ArrayBuffer {
    @Test
    def Test_+(): Unit = {
        val arr = ArrayBuffer(1, 2, 3, 4, 5)

        /*
        def append(elems: A*): Unit
            Appends the given elements to this buffer.
         */
        arr.append(6, 7) // Appends the given elements to this buffer.
        println(arr)
        println("*******************************************")

        /*
        def prepend(elems: A*): Unit
            Prepends given elements to this buffer.
         */
        arr.prepend(-1, 0)
        println(arr)
        println("*******************************************")

        /*
        def prependAll(xs: TraversableOnce[A]) { xs ++=: this }
        def appendAll(xs: TraversableOnce[A]) { this ++= xs }
         */
    }

    @Test
    def Test_-(): Unit = {
        val arr = ArrayBuffer(0, 1, 2, 3, 4, 5)
        arr.remove(0) // 删除索引位置为2的元素
        println(arr)

        arr.remove(0, 2) // 从索引位置0开始删除2个元素
        println(arr)

        arr.clear() // Clears the contents of this builder.
        println(arr)
    }

    @Test
    def Test_i(): Unit = {
        val arr = ArrayBuffer(0, 1, 2, 3, 4, 5)

        arr.insert(0, -1) // 0位置处插入元素-1
        println(arr)

        arr.insert(0, -3, -2)
        println(arr)

        /*
        Inserts new elements at the index n. Opposed to method update, this method will not replace an element with a new one. Instead, it will insert a new element at index n.

        n: the index where a new element will be inserted.
        seq: the traversable object providing all elements to insert.
         */
        arr.insertAll(0, Set(111, 222, 333, 444))
        println(arr)
    }
}
