import java.util._  // 导入util下(不包含util子目录中的类)所有类
import java.util.{ArrayList => AL}  // 类取别名;类似python中的as(import numpy as np)
import java.util.{ArrayList, LinkedList}  // 导入包中的多个类
import java.util.{LinkedHashMap => _, _}  // 导入util下除LinkedHashMap之外的类

// scala默认导入的包
// 1. java.lang._
// 2. scala._
// 3. scala.Predef._


/**
 * 包对象
 */
package object sa_basic  {
    // 定义当前包共享的属性和方法
    val name = "duanchao"

    def commonMethon(): Unit = {
        println(name + "好好学习,天天向上")
    }
}
