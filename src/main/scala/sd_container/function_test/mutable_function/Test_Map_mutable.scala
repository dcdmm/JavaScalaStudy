package sd_container.function_test.mutable_function

import org.junit.Test

import scala.collection.mutable

/**
 * 可变字典方法测试
 */
class Test_Map_mutable {
    @Test
    def Test(): Unit = {
        val map = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)

        // 添加
        map.put("d", 5)
        println(map)

        // 修改(存在就修改,不存在就添加)
        map.update("c", 222)
        println(map)

        // 删除
        map.remove("c")
        println(map)

        // 清空
        map.clear()
        println(map)
    }
}
