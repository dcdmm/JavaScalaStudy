package sc_oop.extends_

/**
 * type关键字
 *
 * 源码中的应用
 * 1. 可以用于把一些java的类型转为scala的类型
 * 2. 也可以把一些scala类型名比较长的进行缩短
 */
object KeyWord_type {
    def main(args: Array[String]): Unit = {
        type S = String // type相当于声明一个类型别名
        val name: S = "dcdmm"
        println(name)
    }
}
