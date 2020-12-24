package basic

/**
 * 数据类型精度大小(注意:[byte, short]不能和char进行直接转换):
 * byte-->short-->int-->long-->float-->double
 * char-->int-->long-->float-->double
 */
object NumericalDataTypeConversion {
    def main(args: Array[String]): Unit = {
        // 自动(隐式)类型转换
        val a = 'a'
        val b = 20
        // 精度低数据类型自动提升为精度高数据类型
        println(a + b) // char + int --> int

        val c = 223
        val d = 2.31
        println(c + d) // int + double --> double

        val s:Short = 12
        // val c1:Char = s // 报错:type mismatch;

        // 强制类型转换
        val e = 3.1415
        val f0 = e.toByte
        val f1 = e.toShort
        val f2 = e.toInt // 必须进行强制类型转换(精度高数据类型转换为精度高数据类型)
        val f3 = e.toFloat
        val f4 = e.toDouble
        var f5 = e.toChar
        val f6 = e.toString
        println(f2)
        println("字符串:" + f6)
    }
}
