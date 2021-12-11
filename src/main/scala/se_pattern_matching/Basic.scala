package se_pattern_matching

import scala.util.Random

/**
 * 模式匹配(基础)
 */
object Basic {
    def main(args: Array[String]): Unit = {
        val x: Int = Random.nextInt(4)

        val result = x match {
            // 匹配常量
            case 0 => "zero: " + x
            case 1 => "one: " + x
            case 2 => "two:" + x

            // 类似Java switch语句中的default子句(但更为强大)
            case _ => "other: " + x // The last case _ is a “catch all” case for any other possible Int values.
        }
        println(result)
    }
}
