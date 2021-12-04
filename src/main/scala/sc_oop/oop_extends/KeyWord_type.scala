package sc_oop.oop_extends

/**
 * type关键字
 */
object KeyWord_type {
    def main(args: Array[String]): Unit = {
        type S = String // type相当于声明一个类型别名
        val name: S = "dcdmm"
        println(name)
    }
}
