package sz_other

/**
 * 异常处理(参考Java thorws关键字)
 */
object Exception_throws {
    def main(args: Array[String]): Unit = {
        func_throws()
    }

    @throws(classOf[NumberFormatException]) // 用于提示调用该方法时产生的异常
    def func_throws(): Unit = {
        println("abc".toInt)
    }
}

