package sa_basic

/**
 * 赋值运算符
 */
object ArithmeticAssignmentOperator {
  def main(args: Array[String]): Unit = {
    var a: Int = 5
    val b: Int = 3
    // 算数运算符:=,-,*,/,%// 算数运算符:=,-,*,/,%
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b) // 整数与整数相除仍为整数
    println(a % b) // 取余
    println("**********************************")

    println(5 / 4)
    println(5 / 4.0) // 输出为小数(浮点数参与运算)
    println("**********************************")

    val c = 'a' // 字符A的ASCII码是65,a的ASCII码是97
    val d = 10
    println(c + d)
    println("**********************************")

    println("hello" + "java") // 字符串的拼接

    println("hello" * 3); // 字符串的重复;print->hellohellohello
    println("hello" + 100)
    // 运算顺序从左至右;// 运算顺序从左至右;
    println("hello" + 100 + 200) // print->"hello100200"

    println(100 + 200 + "hello") // pirnt->300hello"

    // 赋值运算符:+=,-=,/=,*=,%=
    a += 20
    println(a)
    println("***************************")

    var s: Short = 2
    // s = s + 1;  // 报错:1是Int类型数据,故s+1也是Int类型数据
    // 解决方法如下:
    // s = (s + 1).toShort
  }
}
