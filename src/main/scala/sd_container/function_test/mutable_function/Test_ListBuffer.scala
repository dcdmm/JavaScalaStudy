package sd_container.function_test.mutable_function

import org.junit.Test

import scala.collection.mutable.ListBuffer

/**
 * 可变列表方法测试
 */
class Test_ListBuffer {
    @Test
    def Test_+(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        /*
        def append(elems: A*): Unit
            Appends the given elements to this buffer.

        def appendAll(xs: TraversableOnce[A]): Unit
            Appends the elements contained in a traversable object to this buffer.
         */
        list.append(6)
        println(list)

        list.append(7, 8, 9)
        println(list)

        /*
        def appendAll(xs: TraversableOnce[A]) { this ++= xs }
        def prependAll(xs: TraversableOnce[A]) { xs ++=: this }
         */
    }

    @Test
    def Test_-(): Unit = {
        val list = ListBuffer(1, 2, 3, 4, 5)

        /*
        def remove(n: Int): A
            Removes the element on a given index position.

        def remove(n: Int, count: Int): Unit
            Removes a given number of elements on a given index position.
         */
        list.remove(0) // 删除索引位置为2的元素
        println(list)

        list.remove(0, 2) // 从索引位置0开始删除2个元素
        println(list)

        list.clear() // Clears the buffer contents.
        println(list)
    }

    @Test
    def Test_i(): Unit = {
        val list = ListBuffer(0, 1, 2, 3, 4, 5)

        list.insert(0, -1) // 0位置处插入元素-1
        println(list)

        /*
        Inserts new elements at the index n. Opposed to method update, this method will not replace an element with a new one. Instead, it will insert a new element at index n.

        n: the index where a new element will be inserted.
        seq: the iterable object providing all elements to insert.
         */
        list.insertAll(0, Set(111, 222, 333, 444))
        println(list)
    }
}
