package sd_container.immutable_

/**
 * The Range class represents integer values in range [start;end) with non-zero step value step.
 */
object Range_ {
    def main(args: Array[String]): Unit = {
        val ran0 = 1 to 3
        println(ran0)
        for (i <- ran0) println(i)
        println("*********************************")

        val ran1 = 1 to 14 by 3
        println(ran1)
        for (i <- ran1) println(i)
        println("*********************************")

        val ran2 = 1 until 3
        println(ran2)
        for (i <- ran2) println(i)
        println("*********************************")

        val ran3 = 1 until 14 by  3
        println(ran3)
        for (i <- ran3) println(i)
        println("*********************************")

        val ran4 = Range(1, 14, 3) // 通过伴生对象创建
        println(ran4)
        for (i <- ran4) println(i)
        println("*********************************")
    }
}
