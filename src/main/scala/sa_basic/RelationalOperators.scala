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
        val s: Short = 65
        val l = 65L
        val x = 65.0
        val y: Char = 65
        val m = 'A'
        // Scala数值类型:比较变量保存的数据是否相等(类型不一定要求相等)
        println(j == k)
        println(j == x)
        println(j == s)
        println(j == l)
        println(j == y)
        println(j == m)
        println("**********************************************")

        /*
        Scala中==,eq,equals中的解释
        final def ==(arg0: Any): Boolean
            The expression x == that is equivalent to if (x eq null) that eq null else x.equals(that).

        final def eq(arg0: AnyRef): Boolean
            Tests whether the argument (that) is a reference to the receiver object (this).

        def equals(arg0: Any): Boolean
            The equality method for reference types.
         */
        // 引用数据类型
        val arr1 = Array(1, 2, 3, 4)
        val arr2 = Array(1, 2, 3, 4)
        println(arr1 == arr2) // 如果比较的对象是null,==调用的是eq方法.如果比较的对象不是null,==调用的是equals方法
        println(arr1 eq arr2) // 比较的是地址是否相同
        println(arr1 equals arr2) // 比较的是值是否相等
    }
}
