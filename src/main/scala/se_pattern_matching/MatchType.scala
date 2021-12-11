package se_pattern_matching

/**
 * 匹配类型
 */
object MatchType {
    def main(args: Array[String]): Unit = {
        def describeType(x: Any): String = x match {
            // 匹配类型
            case i: Int => "Int: " + i
            case s: String => "String: " + s
            case list: List[String] => "List: " + list
            case array: Array[String] => "Array: " + array.mkString("Array(", ", ", ")")
            case a => "Somethins else: " + a
        }

        println(describeType(23))

        // 泛型擦除
        println(describeType(List("duan", "chao")))
        println(describeType(List(12, 23))) // 也满足case list: List[String]

        // Array不存在泛型擦除
        println(describeType(Array("duan", "chao")))
        println(describeType(Array(12, 23))) // 不满足case array: Array[String]
    }
}
