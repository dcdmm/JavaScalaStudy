package sb_fp

/**
 * 闭包(类似python)
 * 1. 闭包函数必须返回一个函数对象
 * 2. 闭包函数返回的那个函数必须引用外部变量
 *
 * 柯里化
 */
object ClosureCurrying {
    def main(args: Array[String]): Unit = {
        def line_conf(a: Double, b: Double): Double => Double = {
            def line(x: Double): Double = {
                return a * x + b
            }

            return line
        }

        val line_A = line_conf(2, 1) // y=2x+b
        val line_B = line_conf(3, 2) //  y=3x+2

        // 打印x对应y的值
        println(line_A(1)) // 3
        println(line_B(1)) // 5
        println("*******************************************")

        // 匿名函数的写法;与函数line_conf等价
        def line_conf_lambda(a: Double, b: Double): Double => Double = a * _ + b


        println(line_conf_lambda(2, 1)(1))
        println(line_conf_lambda(3, 2)(1))
        println("*******************************************")

        // 柯里化(必须为闭包函数);与函数line_conf等价
        def line_conf_currying(a: Double, b: Double)(x: Double): Double = {
            a * x + b
        }

        println(line_conf_currying(2, 1)(1))
        println(line_conf_currying(3, 2)(1))
        println("*******************************************")

        // 柯里化方法与普通方法的区别
        def multiply1(x: Int, y: Int, z: Int) = x * y * z

        val partialAppliedMultiply = multiply1 _ // 类型：(x: Int, y: Int, z: Int) => Int

        def multiply2(x: Int)(y: Int)(z: Int) = x * y * z

        val curryingMultiply = multiply2 _ // 类型：Int => (Int => (Int => Int))
    }
}
