package se_pattern_matching

object b {
    def main(args: Array[String]): Unit = {
        def abs(num: Int): Int = {
            num match {
                // 模式守卫
                case i if i >= 0 => i
                case i if i < 0 => -i
            }
        }

        println(abs(0))
        println(abs(-1))
        println(abs(num = 1))
    }
}
