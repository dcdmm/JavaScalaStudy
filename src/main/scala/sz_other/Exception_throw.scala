package sz_other

/**
 * 异常处理(参考Java throw关键字)
 */
object Exception_throw {
    def main(args: Array[String]): Unit = {
        def test(): Nothing = {
            throw new ArrayIndexOutOfBoundsException("错误") // 类型为Nothing
        }

        test()
    }

}
