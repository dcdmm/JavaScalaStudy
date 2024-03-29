package sb_fp

/**
 * 函数(方法)的调用
 */
object FunctionCall {
    def main(args: Array[String]): Unit = {
        // 可以在方法内定义函数(Java不支持)
        def sayHi(): Unit = {
            println("方法中sayHi函数被调用") // 返回值为:();Unit只有一个实例:()
        }

        sayHi() // 输出:方法中sayHi函数调用(就近原则)
        FunctionCall.sayHi() // 输出:sayHi方法调用(通过对象调用)
        sayBay() // 输出:类中sayBay方法调用
    }

    def sayHi(): Unit = {
        println("类中sayHi方法被调用")
    }

    def sayBay(): Unit = {
        println("sayBay方法被调用")
    }
}