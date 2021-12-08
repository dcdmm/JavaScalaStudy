package sd_container.function_test.transform

import org.junit.Test

/**
 * toMap
 */
class Test_toMap {
    @Test
    def Test_Array(): Unit = {
        val arr = Array(("duan", 23), ("chao", 12))
        // Converts this list to a map. This method is unavailable unless the elements are members of Tuple2,
        println(arr.toMap) // 要求集合元素类型必须为Tupele2
    }
}
