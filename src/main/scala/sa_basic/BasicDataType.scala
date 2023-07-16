package sa_basic

/**
 * Scala基本数据类型:
 * Byte, Short, Int(默认整形), Long, Float, Double(默认浮点型), Char, Boolean
 */
object BasicDataType {
    def main(args: Array[String]): Unit = {
        val b: Byte = 10; // 8bits
        println(b)
        println(Byte.MaxValue) // Byte数据类型最大值
        println(Byte.MinValue) // Byte数据类型最小值
        println("*******************************")

        val s: Short = 50 // 16bits
        println(s)
        println(Short.MaxValue)
        println(Short.MinValue)
        println("*******************************")

        val i: Int = 520; // 32bits;默认为Int类型
        println(i)
        println(Int.MaxValue)
        println(Int.MinValue)
        println("*******************************")

        val l: Long = 1999999999990L; // 64bits;注:后面需加上L
        println(l)
        println(1.03E-2); // 科学计数法
        println(Long.MaxValue)
        println(Long.MinValue)
        println("*******************************")

        val f: Float = 10.3f // 32bits;注:后面需要加上f;小数点后大致保留7位
        println(f)
        println(Float.MaxValue)
        println(Float.MinValue)
        println("*******************************")

        val d: Double = 10.3; // 64bits;默认为Double类型
        println(d)
        println(Double.MaxValue)
        println(Double.MinValue)
        println("*******************************")

        val c: Char = 'a'
        println(c)
        println(Char.MaxValue)
        println(Char.MinValue)
        println("*******************************")

        val bo: Boolean = false // 只能为ture或false
        println(bo)
    }
}
