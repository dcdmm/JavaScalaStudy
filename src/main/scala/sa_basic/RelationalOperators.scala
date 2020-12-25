package sa_basic

/**
 * 关系运算符
 */
object RelationalOperators {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        println(a != b) // 不等于
        println(a > b) // 大于
        println(a < b) // 小于
        println(a >= b) // 大于等于
        println(a <= b) // 小于等于
        println("**********************************************")
        val j = 65
        val k = 65
        val s:Short = 65
        val l = 65L
        val x = 65.0
        val y:Char = 65
        val m = 'A'
        // Scala数值类型:比较变量保存的数据是否相等(类型不一定要求相等)
        println(j == k)
        println(j == x)
        println(j == s)
        println(j == l)
        println(j == y)
        println(j == m)
        println("**********************************************")
        // 引用数据类型:比较两个对象的地址值是否相同
        val arr1 = Array(1, 2, 3, 4)
        val arr2 = Array(1, 2, 3, 4)
        println(arr1 eq arr2) // false
    }
}
