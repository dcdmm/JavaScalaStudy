package sd_container.map_

object ff {
    def main(args: Array[String]): Unit = {
        // 创建map
        val map1: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map1)
        println(map1.getClass)

        // 遍历
        map1.foreach((elem: (String, Int)) => println(elem))

        // 取map中的所有的key或value
        for (key <- map1.keys) { // 键
            println(key)
        }

        for (value <- map1.values) {
            println(value)
        }

        for (value <- map1) {
            println(value) // 键值对遍历
        }

        println(map1.get("d"))
        println(map1.getOrElse("d", -1))
        println(map1("d")) // 异常

        // tolist方法===================>
    }
}
