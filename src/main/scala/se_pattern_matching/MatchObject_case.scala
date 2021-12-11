package se_pattern_matching

/**
 * 匹配对象实例(通过样例类)
 *
 * 样例类(case关键字修饰;它是为模式匹配而优化的类)
 */
object MatchObject_case {
    def main(args: Array[String]): Unit = {
        val student = MatchObject_case_Student(name = "duanchao", age = 23)
        println(student.hashCode())

        // 匹配对象实例
        val result = student match {
            case MatchObject_case_Student("duanchao", 23) => "duanchao 23"
            case _ => "else"
        }
        println(result)
    }
}

// 样例类主构造器的形参默认为val
// 样例类伴生对象中自动生成apply, unapply方法
case class MatchObject_case_Student(name: String, age: Int) {

}