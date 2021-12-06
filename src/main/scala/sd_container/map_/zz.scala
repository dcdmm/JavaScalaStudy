package sd_container.map_
import scala.collection.mutable

object zz {
    def main(args: Array[String]): Unit = {
        val map1 = mutable.Map("a" -> 0, "b" -> 1, "c" -> 2)
        println(map1)
        println(map1.getClass)

        // 添加元素
        map1.put("d", 5)

        map1 += (("e", 7))
        println(map1)
        println("******************************************")

        // 删除元素
        map1.remove("d")

        map1 -= "e"
        println(map1)

        // 修改元素(存在就修改,不存在就添加)
        map1.update("c", 222)
        println(map1)

        map1 += (("c", 2221))
        println(map1)

        // 合并map
        val map2 = mutable.Map("a" -> 999, "b" -> 1, "c" -> 2, "s" -> 23)
        map1 ++= map2
        println(map1)
        println(map2)

        val map3 = map2 ++ map1
        println(map3)
        println(map1)
        println(map2)
    }
}
