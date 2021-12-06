package sb_fp

/**
 * lazy关键字:定义惰性变量,实现延迟加载
 * *. lazy关键字不能修饰var类型变量
 * *. lazy关键字的的修饰变量,只有在第一次使用该变量时,才会进行初始化
 */
object KeyWord_lazy {
    def main(args: Array[String]): Unit = {
        lazy val res = sum(10, 20) // 没有进行初始化
        println("**********************************")

        println("res" + res) // 使用该变量时,才会进行初始化
        println("res" + res) // res已经进行了初始化
    }

    def sum(n1: Int, n2: Int): Int = {
        println("sum()执行!!!")
        n1 + n2
    }
}
