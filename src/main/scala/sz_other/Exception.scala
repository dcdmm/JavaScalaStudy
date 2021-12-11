package sz_other

/**
 * 异常处理(没有编译时异常)
 */
object Exception {
    def main(args: Array[String]): Unit = {
        try {
            val n = 10 / 0
            println(n)
        } catch {
            case e: ArithmeticException =>
                println("算术异常: " + e)
            case e: Exception =>
                println(e)
        } finally {
            println("处理结束!")
        }
    }
}
