/**
 * 可以为每个包定义一个同名的包对象,定义在包对象中的成员,作为其对应包下所有class和object的共享变量,可以被直接访问
 * 包对象的代码通常放在名为package.scala的源文件中
 */
package object sc_oop {
    // 定义当前包共享的属性和方法
    val name = "duanchao"

    def commonMethon(): Unit = {
        println(name + "好好学习,天天向上")
    }
}
