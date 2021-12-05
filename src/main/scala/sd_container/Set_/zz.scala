package sd_container.Set_

import scala.collection.mutable


object zz {
    def main(args: Array[String]): Unit = {
        // 创建
        val set1 = mutable.Set(1, 2, 3, 4, 5)
        println(set1)

        // 添加元素
        set1 + 6
        println(set1) // 不改变..

        set1 += 6
        println(set1) // 改变

        set1.add(10)
        println(set1)

        set1.remove(10) // 或者使用-=
        println(set1)

        // 合共
        val set2 = mutable.Set(88, 99)

        val set3 = set1 ++ set2
        println(set1) // 不变

        set1 ++= set2 // 可变集合的合并
        println(set1)

    }
}
