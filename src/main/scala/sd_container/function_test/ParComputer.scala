package sd_container.function_test

/**
 * 多线程方法:.par
 */
object ParComputer {
    def main(args: Array[String]): Unit = {
        val strings_ran = (1 to 10).map(
            _ => Thread.currentThread.getId
        )
        println(strings_ran)

        /*
        def par: ParSeq[A]
            Returns a parallel implementation of this collection.
         */
        val strings_ran_par = (1 to 10).par.map(
            _ => Thread.currentThread.getId
        )
        println(strings_ran_par) // 多线程计算
        println("*************************************")

        val list = List(0, 1, 2, 3, 4, 5, 6)
        val strings_list = list.map(
            _ => Thread.currentThread.getId
        )
        println(strings_list)

        val strings_list_par = list.par.map(
            _ => Thread.currentThread.getId
        )
        println(strings_list_par)
        println("*************************************")

        val map = Map("a" -> 0, "b" -> 1, "c" -> 2)
        val strings_map = map.map(
            _ => Thread.currentThread.getId
        )
        println(strings_map)

        val strings_map_par = map.par.map(
            _ => Thread.currentThread.getId
        )
        println(strings_map_par)
    }
}
