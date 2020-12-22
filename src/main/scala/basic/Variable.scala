package basic

/**
 * 变量(var/val)
 */
object Variable {
    def main(args: Array[String]): Unit = {
        var age = 25 // 定义(可变)变量并初始化
        age = 1000
        // age = 1000.0 // 报错:不能将该变量重新分配给其他类型

        var payment  = 52000 // 类型推导
        println(payment.isInstanceOf[Int])


        val constant = 23 // 不可变变量
        // constant = 24 // 报错:不能被修改
    }
}
