package sf_impliciti

import scala.language.implicitConversions

/**
 * 隐式函数(作用范围内自动推导)
 *
 * 隐式函数的函数名是可以任意的,隐式转换与函数名无关,只与函数签名(函数参数类型和返回值)有关
 */
object Function_impliciti {
    def main(args: Array[String]): Unit = {
        implicit def f1(num: Int): MyRichInt_1 = new MyRichInt_1(num)
        // implicit def f2(num: Int): MyRichInt = new MyRichInt(num) // 报错(不能存在二义性,即多个隐式)

        println(12.myMax(15))
    }
}

class MyRichInt_1(val self: Int) {
    def myMax(n: Int): Int = if (n < self) self else n
}