package se_pattern_matching

object c {
    def main(args: Array[String]): Unit = {
        def describeConst(x: Any): String = x match {
            case 1 => "Int one"
            case "hello" => "String hello"
            case true => "Boolean true"
            case '+' => "Char +"
            case _ => "Other"
        }

        println(describeConst("hello"))
        println(describeConst(true))
        println(describeConst("python"))
        println("************************************************************")
    }
}
