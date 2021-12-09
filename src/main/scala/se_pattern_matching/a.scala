package se_pattern_matching

object a {
    def main(args: Array[String]): Unit = {
        import scala.util.Random

        val x: Int = Random.nextInt(10)

        val result = x match {
            case 0 => "zero"
            case 1 => "one"
            case 2 => "two"

            // 类似Java switch语句中的default子句
            // 如果所有case都不匹配,且没有 case _ 分支,则抛出MatchError异常
            case _ => "other"
        }
        println(result)
        println("*********************************************")

        val a = 24
        val b = 12

        def mathDualOp(parm0: Int, parm1: Int, op: Char): Any = op match {
            case '+' => parm0 + parm1
            case '-' => parm0 - parm1
            case '*' => parm0 * parm1
            case '/' => parm0 / parm1
            case _ => "非法运算符"
        }

        val ouput = mathDualOp(a, b, '+')
        println(ouput)
    }
}
