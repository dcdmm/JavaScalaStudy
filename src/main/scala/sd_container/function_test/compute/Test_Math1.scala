package sd_container.function_test.compute

import org.junit.Test

/**
 * 交集/并集/差集(不支持Map)
 */
class Test_Math1 {
    @Test
    def Test0(): Unit = {
        val one = List(1, 3, 5, 7, 2, 89)
        val two = List(3, 7, 2, 45, 4, 8, 19)

        // 并集
        val union = one.union(two)
        println(union)

        // 交集
        val intersection = one.intersect(two)
        println(intersection)

        // 差集
        val diff = one.diff(two)
        println(diff)
    }

    @Test
    def Test1(): Unit = {
        val one = Set(1, 3, 5, 7, 2, 89)
        val two = Set(3, 7, 2, 45, 4, 8, 19)

        // 并集
        // 结果为Set(无序不重复)
        val union = one.union(two)
        println(union)

        // 交集
        // 结果为Set(无序不重复)
        val intersection = one.intersect(two)
        println(intersection)

        // 差集
        // 结果为Set(无序不重复)
        val diff = one.diff(two)
        println(diff)
    }
}
