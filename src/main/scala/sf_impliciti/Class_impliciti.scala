package sf_impliciti

/**
 * 隐式类(隐式函数的扩展;作用范围内自动推导)
 *
 * 隐式类必须被定义在 "类" 或 "伴生对象" 或 "包对象" 里,即隐式类不能是顶级的(top-level objects)
 * 隐式类不能是 case class(样例类)
 */
object Class_impliciti {
    implicit class MyRichInt_2(val self: Int) {
        def myMax(n: Int): Int = if (n < self) self else n
    }

    // 报错(不能存在二义性,即多个隐式)
//    implicit class MyRichInt_3(val self: Int) {
//        def myMax(n: Int): Int = if (n < self) self else n
//    }

    def main(args: Array[String]): Unit = {
        println(12.myMax(15))
    }
}
