package se_pattern_matching

/**
 * 匹配集合
 */
object MatchCollection {
    def main(args: Array[String]): Unit = {
        for (arr <- List(
            Array(0),
            Array(0, 1),
            Array(1, 2),
            Array(0, 1, 2, 3),
            Array(0, 1, 2, 3, 4),
            Array(-1, 0, 1, 2),
            Array(3, 4, 5),
            Array("hello", 20, 30),
        )) {
            val result = arr match {
                case Array(0) => "匹配Array(0): " + arr.mkString("Array(", ", ", ")")
                case Array(0, 1) => "匹配Array(0, 1): " + arr.mkString("Array(", ", ", ")")
                case Array(_, _) => "匹配两元素数组: " + arr.mkString("Array(", ", ", ")")
                case Array(0, _*) => "匹配以0开始的数组: " + arr.mkString("Array(", ", ", ")")
                case Array(_, 0, _, _) => "匹配第二个位置元素为0的四元素数组" + arr.mkString("Array(", ", ", ")")
                case Array(a, b, 5) => s"匹配以5结尾的三元素数组并输出第一个位置和第二个位置元素的值;$a,$b"
                case _ => "something else: " + arr.mkString("Array(", ", ", ")")
            }
            println(result)
        }
        println("***********************************************")

        for (list <- List(
            List(0),
            List(0, 1),
            List(1, 2),
            List(0, 1, 2, 3),
            List(0, 1, 2, 3, 4),
            List(-1, 0, 1, 2),
            List(3, 4, 5),
            List(99, 12, 3, 1, 5, 9),
            List("hello", 20, 30),
        )) {
            val result = list match {
                case List(0) => "匹配List(0): " + list
                case List(0, 1) => "匹配List(0, 1): " + list
                case List(_, _) => "匹配两元素列表: " + list
                case List(0, _*) => "匹配以0开始的列表: " + list
                case List(_, 0, _, _) => "匹配第二个位置元素为0的四元素列表" + list
                case List(a, b, 5) => s"匹配以5结尾的三元素列表并输出第一个位置和第二个位置元素的值;$a,$b"
                case 99 :: first :: second :: res => s"匹配以99开头的列表并输出第二个位置和第三个位置元素的值和其余其他位置处元素的值;$first,$second,$res"
                case _ => "something else: " + list
            }
            println(result)
        }
    }
}
