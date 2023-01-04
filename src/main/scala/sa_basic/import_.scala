package sa_basic

import java.util._ // 导入util下(不包含util子目录中的类)所有类
import java.util.{ArrayList => AL} // 类取别名;类似python中的as(import numpy as np)
import java.util.{ArrayList, LinkedList} // 导入包中的多个类
import java.util.{LinkedHashMap => _, _} // 导入util(不包含util子目录中的类)下除LinkedHashMap之外的类

import sc_oop.{Const0, Const1, Const2}

// scala默认导入的包
// 1. java.lang._
// 2. scala._
// 3. scala.Predef._

object import_ {
    def main(args: Array[String]): Unit = {
        var const0 = new Const0()
        println("***************************************")
        var const1 = new Const1("hunan")
        // const1.location = "guangdong"  // 报错(val修饰形参,不能被修改)
        println("***************************************")
        var const1_0 = new Const2("duanchao", 18)
        println(const1_0.name)
        const1_0.name = "duanmengmeng" // 可以被修改(// var修饰形参,可以被修改)
        println(const1_0.name)
        println("***************************************")
        var const1_1 = new Const2("duanchao", 18, school = "baishui")
        println("***************************************")
        var const1_2 = new Const2("duanchao", 18, school = "baishui", sex = false)
    }
}
