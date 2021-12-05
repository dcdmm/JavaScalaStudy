package sd_container.Set_


object  ff {
    def main(args: Array[String]): Unit = {
        // 创建Set
        // 默认为不可变集合
        val set0 = Set(1, 2, 3, 4, 4, 5) // 无序不重复
        println(set0)

        println("****************************")
        // 添加元素
        val set1 = set0 + 23 //
        println(set1)

        // 合并set
        val set2 = Set(6, 7, 8, 9)
        val set3 = set1 ++ set2 // Set的拼接
        println(set3)

        // 删除元素

        val set4 = set0 - 1
        println(set4)



    }
}
