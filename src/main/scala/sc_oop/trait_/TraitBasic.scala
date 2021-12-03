package sc_oop.trait_

/**
 * 特质(类似Java中接口的概念)
 */
object TraitBasic {
    def main(args: Array[String]): Unit = {
        val student = new TraitBasicStudent()
        student.sayHello() // 多态机制
        student.increasing()
        student.play() // 多态机制
        student.increasing()
        student.dating()
        student.increasing()
        println("****************************************************")

        // 动态混入
        val studentWithTalent = new TraitBasicStudent() with Talent { // 灵活
            override def danceing(): Unit = {
                println("student is good as danceing")
            }
        }
        studentWithTalent.sayHello() // 多态机制
        studentWithTalent.increasing()
        studentWithTalent.play() // 多态机制
        studentWithTalent.increasing()
        studentWithTalent.dating()
        studentWithTalent.increasing()
        studentWithTalent.danceing()
    }
}

class TraitBasicPerson {
    val age: Int = 18
    val name: String = "person"

    def sayHello(): Unit = {
        println("hello from: " + name)
    }
}

// 特质的定义
trait Young {
    val age: Int // 抽象属性
    val name: String = "young"
    val classNumber: Int

    def play(): Unit = {
        println(s"$name is playing")
    }

    // 抽象方法
    def dating(): Unit
}

trait Knlowledge {
    var amount: Int = 0

    def increasing(): Unit
}

trait Talent {
    def danceing(): Unit
}

class TraitBasicStudent extends TraitBasicPerson with Young with Knlowledge {
    // 实现特征中的抽象属性
    override val classNumber: Int = 84

    // 子类继承了父类的age属性(已经初始化),故不需要实现特质中的抽象属性age
    // 方法同理

    // 父类(TraitBasicPerson)和特质(Young)中都定义并初始化了name属性===>冲突(必须重写该属性)
    // 方法同理
    override val name: String = "student"

    // 实现特征中的抽象方法
    override def dating(): Unit = println(s"$name is dating")

    override def increasing(): Unit = {
        amount += 1
        println(s"$name knowledge increased: $amount")
    }
}