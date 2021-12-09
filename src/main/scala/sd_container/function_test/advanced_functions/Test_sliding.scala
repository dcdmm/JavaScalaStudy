package sd_container.function_test.advanced_functions

import org.junit.Test

/**
 * sliding(滑窗):Array/ArrayBuffer/String/Range/List/ListBuffer/Set/mutable.Set/Map/mutable.Map
 *
 * silding源码:
 * def sliding(size: Int): Iterator[Repr] = sliding(size, 1)
 *
 * def sliding(size: Int, step: Int): Iterator[Repr] =
 *      for (xs <- iterator.sliding(size, step)) yield {
 *          val b = newBuilder
 *          b ++= xs
 *          b.result()
 *          }
 *
 */
class Test_sliding {
    @Test
    def Test0(): Unit = {
        val list = List(1, 3, 5, 7, 2, 89)

        // 滑窗
        println(list.sliding(3))

        for (elem <- list.sliding(3)) { // 默认步长为1
            println(elem)
        }
        println("****************************")

        for (elem <- list.sliding(3, 2)) { // 第二个参数为步长
            println(elem)
        }
    }

    @Test
    def Test1(): Unit = {
        val set = Set(1, 2, 3, 4, 5, 6, 7, 8)

        for (i <- set.iterator) {
            println(i)
        }
        // 根据上面的顺序进行滑窗
        for (elem <- set.sliding(3, 2)) {
            println(elem)
        }
    }

    @Test
    def Test2(): Unit = {
        val map: Map[String, Int] = Map("a" -> 0, "b" -> 1, "c" -> 2, "d" -> 3, "e" -> 4)

        for (i <- map.iterator) {
            println(i)
        }
        // 根据上面的顺序进行滑窗
        for (elem <- map.sliding(3, 1)) {
            println(elem)
        }
    }
}
