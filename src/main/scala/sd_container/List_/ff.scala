package sd_container.List_

object ff {
    def main(args: Array[String]): Unit = {
        // 创建一个list
        val list0 = List(1, 2, 3, 4, 5)
        println(list0.toString())
        println(list0)
        println("******************************")

        println(list0.head)
        println(list0(2))
        // list0(2) = 23 // 不能更改

        list0.foreach((elem:Int) => println(elem))

        println("**********************************")
        val list1 = list0 :+ 10
        println(list1)

        val list2 = 11 +: list0
        println(list2)

        val list3 = list0.::(222)
        println(list3)

        val list4 = Nil.::(13)
        println(list4)

        val list5 = 1 :: 2 :: 3 :: 4 :: 5 ::Nil // 列表....
        println(list5)

        println("********************************")

        val list6 = list5 :: list5
        println(list6)

        val list7 = list5 ::: list5
        println(list7)

        val list8 = list5 ++ list5  // 与上等价,拆分在加
        println(list8)
    }
}
