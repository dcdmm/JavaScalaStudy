package sc_oop

/**
 * 伴生类/伴生对象
 * 伴生对象必须与伴生类定义在同一个源文件中
 * 伴生类和伴生对象之间可以互相访问对方的私有方法和属性
 */
object Associated {
    // Scala程序入口:有main方法的单例对象
    def main(args: Array[String]): Unit = {
        val a = AssociatedStudent
        val b = AssociatedStudent
        // 引用地址相同(伴生对象是单例对象)
        println(a)
        println(b)
        println("******************************************************************")

        val strudent1 = AssociatedStudent.newStudent("duanchao", 34)

        val strudent2 = AssociatedStudent.apply("duanchao", 34)
        val strudent3 = AssociatedStudent("duanchao", 34) // 与上等价;单例对象调用apply方法可以省略.apply
        println("******************************************************************")

        val s1 = AssociatedStudent.getInstance()
        val s2 = AssociatedStudent.getInstance()
        // 引用地址相同
        println(s1) // 饿汉式单例模式
        println(s2)
    }
}


// 伴生类
class AssociatedStudent private(val name: String, val age: Int) { // 构造器私有化,只能通过伴生对象实例化
    def printInfo(): Unit = {
        // 伴生类访问伴生对象中的属性、方法
        println(s"student: $name $age $AssociatedStudent.schook") // 通过类名.xxx进行访问
        AssociatedStudent.sleep()
    }
}

// 伴生对象
// Scala中没有static关键字
// object对象类似于Java的静态类,它的属性、方法都默认是静态的
object AssociatedStudent { // 伴生对象不能声明构造器
    val schook: String = "baishui"

    def sleep(): Unit = {
        println("sleep!")
    }

    def newStudent(name: String, age: Int): AssociatedStudent = {
        println("newStudent方法被调用")
        new AssociatedStudent(name, age) // 通过new一个对象进行访问
    }

    def apply(name: String, age: Int): AssociatedStudent = {
        println("appaly方法被调用")
        new AssociatedStudent(name, age)
    }

    private val student: AssociatedStudent = new AssociatedStudent(name = "dmm", 1)

    def getInstance(): AssociatedStudent = student
}