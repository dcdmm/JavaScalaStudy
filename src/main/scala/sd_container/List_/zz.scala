package sd_container.List_

import scala.collection.mutable.ListBuffer

object zz {
    def main(args: Array[String]): Unit = {
        // 创建可变列表
        val list0: ListBuffer[Int] = new ListBuffer[Int]()

        val list1 = ListBuffer(1, 2, 3, 4, 5)
        println(list0)

        println(list1)

        println("***************************")

        list0.append(6, 7)
        println(list0)

        list0.prepend(0)
        println(list0)

        list0.insert(0, -1, -2)
        println(list0)

        // 合并
        val list2 = list0 ++ list1
        println(list2)
        println("*******************************************")

        list1 ++= list2
        println(list2)
        println(list1)

        list1 ++=: list2
        println(list2)
        println(list1)


        list2(2) = 34222
        println(list2)

        // 删除元素
        list2.remove(2)
        println(list2)

        list2 -= -2
        println(list2)
    }
}
