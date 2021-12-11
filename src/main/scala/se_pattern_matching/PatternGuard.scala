package se_pattern_matching

/**
 * 模式守卫(类似循环守卫)
 */
object PatternGuard {
    def main(args: Array[String]): Unit = {
        def abs(num: Int): Int = {
            num match {
                // 模式守卫
                case i if i > 0 => i // 使用i表示num
                case i if i < 0 => -i
                case i => i
            }
        }

        println(abs(0))
        println(abs(-1))
        println(abs(num = 1))
    }
}
