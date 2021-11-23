package sa_basic

/**
 * 赋值运算符
 */
object AssignmentOperators {
    def main(args: Array[String]): Unit = {
        var a = 10 // 基本的赋值运运算符
        // println("***************************")
        // a += 20 // +=,-=,/=,*=,%=;注意:Scala中没有自加(++),自减(--)操作符
        // println(a)
        // println("***************************")
        var s: Short = 2
        // s = s + 1;  // 报错:1是Int类型数据,故s+1也是Int类型数据
        /*
        解决方法如下:
        s = (s + 1).toShort
        */
    }
}
