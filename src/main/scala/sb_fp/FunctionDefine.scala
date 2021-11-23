package sb_fp

/**
 * 函数定义
 * 函数形参位置:1,一般参数 2.默认参数(建议放在一般参数之后) 3.可变参数(必须为最后一个参数)
 */
object FunctionDefine {
    def main(args: Array[String]): Unit = {
        val n1 = 10
        val n2 = 20
        println(fun_1(n1, n2, '+'))

        println(fun_2(c = 43)) // 等价于println(fun_c(43)),因为c为第一个参数

        fun_3("Runoob", "Scala", "Python")
    }

    // 形参及形参类型:n1: Int, n2: Int, oper: Char
    def fun_1(n1: Int, n2: Int, oper: Char): Any = { // 返回值类型为Any(Scala中一切数据都是对象,都是Any的子类)
        if (oper == '+') {
            // n1 = 10 // 报错:reassignment to val;Scala函数形参为val,不能在函数中被修改
            return n1 + n2 // Int类型
        } else if (oper == '-') {
            return n1 - n2 // Int类型
        } else {
            return null // Null类型
        }
    }

    def fun_2(c: Int, a: Int = 3, b: Int = 7): Int = { // 默认参数值(Java不支持)
        return a + b + c
    }

    def fun_3(args: String*): Unit = { // 可变参数必须为最后一个参数
        val count = args.length // 可变参数元素的个数
        println("len:" + count)
        var i: Int = 0
        for (arg <- args) {
            println("Arg value[" + i + "] = " + arg)
            i = i + 1
        }
    }
}
