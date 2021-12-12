package sf_impliciti

/**
 * 隐式参数(作用范围内自动推导)
 *
 * 当函数没有柯里化时,implicit关键字会作用于函数列表中的的所有参数
 * 如果想要实现参数的部分隐式参数,只能使用函数的柯里化
 */
object Parameter_impliciti {
    def main(args: Array[String]): Unit = {
        implicit val age: Int = 12 // 隐式值(优先级高于隐式参数默认值低于传入值)
        implicit val str0: String = "dcgo"
        // implicit val str1: String = "dcgo" // 报错(不能存在二义性,即多个隐式)

        def sayHello(implicit name: String, age: Int): Unit = {
            println("hello: " + name + ";" + age)
        }

        // sayHello的简洁写法(隐式参数只关注参数类型)
        def sayHello_easy(): Unit = {
            println("ehllo: " + implicitly[String] + ";" + implicitly[Int])
        }

        // 隐式参数有默认值
        def sayHi(implicit name: String = "dmmgo", sex: Boolean = false): Unit = {
            println("hi: " + name + ";" + sex)
        }

        sayHello
        sayHello_easy()
        sayHi()
        sayHi("dcdmmgo")
        println("*********************************************")

        implicit val dou: Double = 3.0

        // 柯里化的函数,implicit 关键字只能作用于最后一个参数
        def line_conf_currying(a: Double, b: Double)(implicit x: Double): Unit = {
            println(a * b * x)
        }

        line_conf_currying(1.0, 2.0)
    }
}
