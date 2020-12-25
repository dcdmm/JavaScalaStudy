package sa_basic

/**
 * 类注释:import语句之后,类定义之前
 *
 * @author 创建人
 * @version 版本
 */
object Comment {
    def main(args: Array[String]): Unit = {
        /*
        多行注释
        多行注释
        多行注释
         */
        println("hello scala")
    }

    /**
     * 函数注释:所描述的方法之前
     *
     * @param n1 变量描述
     * @param n2 变量描述
     * @return return描述
     */
    def sum(n1: Int, n2: Int): Int = {
        return n1 + n2 // 单行注释
    }
}

