package sa_basic

/**
 * 数据类型精度大小(注意:[Byte, Short]和Char之间不能自动类型转换):
 * Byte-->Short-->Int-->Long-->Float-->Double
 * Char-->Int-->Long-->Float-->Double
 */
object NumericalDataTypeConversion {
    def main(args: Array[String]): Unit = {
        // 自动(隐式)类型转换
        val a = 'a'
        val b = 20
        // 精度低数据类型自动提升为精度高数据类型
        println(a + b) // Char + Int --> int

        val c = 223
        val d = 2.31
        println(c + d) // Int + Double --> Double

        val e: Short = 12
        // val e1:Char = e  // 报错:type mismatch;
        val e0: Char = 'a'
        // val e2: Short = e0  // 报错:type mismatch

        // 强制类型转换
        val f = 3.1415
        val f0 = f.toByte
        val f1 = f.toShort
        val f2 = f.toInt  // 必须进行强制类型转换(精度高数据类型转换为精度高数据类型)
        val f3 = f.toFloat
        val f4 = f.toDouble
        var f5 = f.toChar
        println(f2)

        val f6 = f.toString // 等价于val f6 = f + ""
        println("字符串:" + f6)

        val f7: Int = "3.14".toDouble.toInt  // 先解析为浮点型再强转为整型
        println(f7)
    }
}
