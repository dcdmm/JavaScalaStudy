package sa_basic

/**
 * Scala数值类型:
 * Byte, Short, Int(默认整形), Long, Float, Double(默认浮点型), Char, Boolean
 */
object NumericalDataType {
    def main(args: Array[String]): Unit = {
        var b: Byte = 10; // 8bits
        println(b)
        println(Byte.MaxValue) // Byte数据类型最大值
        println(Byte.MinValue) // Byte数据类型最小值
        println("*******************************")

        var s: Short = 50 // 16bits
        println(s)
        println(Short.MaxValue)
        println(Short.MinValue)
        println("*******************************")

        var i: Int = 520; // 32bits;默认为Int类型
        println(i)
        println(Int.MaxValue)
        println(Int.MinValue)
        println("*******************************")

        var l: Long = 1999999999990L; // 64bits;注:后面需加上L
        println(l)
        println(1.03E-2); // 科学计数法
        println(Long.MaxValue)
        println(Long.MinValue)
        println("*******************************")

        var f: Float = 10.3f // 32bits;注:后面需要加上f;小数点后大致保留7位
        println(f)
        println(Float.MaxValue)
        println(Float.MinValue)
        println("*******************************")

        var d: Double = 10.3; // 64bits;默认为Double类型
        println(d)
        println(Double.MaxValue)
        println(Double.MinValue)
        println("*******************************")

        var c: Char = 'a'
        println(c)
        println(Char.MaxValue)
        println(Char.MinValue)
        println("*******************************")

        var bo: Boolean = false // 只能为ture或false
        println(bo)
    }
}
