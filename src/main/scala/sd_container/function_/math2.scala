package sd_container.function_

object math2 {
    def main(args: Array[String]): Unit = {
        // reduce操作
        val list = List(1, 2, 3, 4)

        // 1. reduce
        val sum_ = list.reduce((a, b) => a + b) // 底层实现reduceLeft
        println(sum_)

        println(list.reduceLeft((a, b) => a + b))
        println(list.reduceRight((a, b) => a + b))


        val list1 = List(3, 4, 5, 8, 10)
        println(list1.reduce((a, b) => a - b))

        // 3 - 4 - 5 - 8 -10
        println(list1.reduceLeft((a, b) => a - b))

        // 3 - (4 - (5 - (8-10)))
        println(list1.reduceRight((a, b) => a - b))

        // 10 + 1 + 2 + 3 + 4
        println(list.fold(10)((a, b) => a + b))
        println(list.foldLeft(10)((a, b) => a + b))

        // 10 -1 - 2 -3 -4
        println(list.foldLeft(10)((a, b) => a - b))

        // 3 - (4 - (5 - (8 - (10 -11))))
        println(list1.foldRight(11)((a, b) => a - b))
    }
}
