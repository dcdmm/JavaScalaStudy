package sd_container.function_test.mutable_function

import org.junit.Test

import scala.collection.mutable

/**
 * 可变集合方法测试
 */
class Test_Set_mutable {
    @Test
    def Test(): Unit = {
        val set = mutable.Set(1, 2, 3, 4, 5)

        set.add(6)
        println(set)

        set.remove(3) // Removes an element from this set.
        println(set)

        set.clear() // Removes all elements from the set.
        println(set)
    }
}
