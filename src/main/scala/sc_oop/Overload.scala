package sc_oop

/**
 * 重载(方法)
 */
object Overload {
    def main(args: Array[String]): Unit = {
        val x = compare(3, 4) // 方法的调用
        System.out.println(x)
        val y = compare(9, 4, 5)
        System.out.println(y)
        val z = compare(3.0, 4.0)
        System.out.println(z)
    }

    def compare(a: Int, b: Int): Boolean = { // 返回值为boolean
        a == b
    }

    // 方法的重载:方法名相同,形式参数不同(与返回值类型无关)
    def compare(a: Int, b: Int, c: Int): Boolean = { // 参数个数不同
        a == (b + c)
    }

    def compare(a: Double, b: Double): Boolean = { // 参数类型不同
        a == b
    }
}
