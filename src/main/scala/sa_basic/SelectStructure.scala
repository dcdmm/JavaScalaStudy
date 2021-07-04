package sa_basic

/**
 * 条件选择结构:if/else语句
 */
object SelectStructure {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        if (a == b)
            println("相等")
        else {
            println("不相等")
        }

        val max = if (a > b) a else {
            a
            b
            // 将执行代码的最后一条语句的值作为返回值返回
            println("最后一行内容")  // println()方法没有返回值,故返回Unit的唯一实例()
        }
        println("max:" + max)

        // Scala没有三元操作符
        val min = if (a > b) b else a  // 使用if/else实现Java三元运算符的功能
        println("min:" + min)
        println("****************************")

        val grade = 67
        if (grade >= 90)
            println("成绩很优秀")
        else if (grade >= 80)
            println("成绩还可以")
        else if (grade >= 70)
            println("一般")
        else if (grade >= 60)
            println("刚刚及格")
        else {
            println("不及格")
            println("垃圾!!!")
        }
    }
}
