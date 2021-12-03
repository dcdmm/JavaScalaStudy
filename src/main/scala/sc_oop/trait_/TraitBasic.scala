package sc_oop.trait_

/**
 * 特质(类似Java中接口的概念)
 *
 * 父类和特质平等(Java:类优先原则)
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
        println("****************************************************")
        studentWithTalent.RepeatFunc()
    }
}

class TraitBasicPerson {
    val age: Int = 18
    val name: String = "person"

    def sayHello(): Unit = {
        println("hello from: " + name)
    }

    def RepeatFunc(): Unit = {
        println("class func")
    }
}

// 特质的定义(只有无参构造器)
trait Young {
    val age: Int // 抽象属性
    val classNumber: Int

    // 抽象方法
    def dating(): Unit

    val name: String = "young" // 具体的属性

    // 具体的方法
    def play(): Unit = {
        println(s"$name is playing")
    }

    def RepeatFunc(): Unit = {
        println("trait Young func")
    }
}

trait Knlowledge {
    var amount: Int = 0

    def increasing(): Unit

    def RepeatFunc(): Unit = {
        println("trait Knlowledge func")
    }
}

trait Talent {
    def danceing(): Unit
}

// 没有父类:class 类名 extends 特质1 with 特质2 with 特质3
// 有父类:class 类名 extends 父类 with 特质1 with 特质2 with 特质3
class TraitBasicStudent extends TraitBasicPerson with Young with Knlowledge {
    // 实现特征中的抽象属性
    override val classNumber: Int = 84

    // 子类继承了父类TraitBasicPerson(特质同理)的age属性(已经初始化),故不需要实现特质Young中的抽象属性age
    // 方法同理

    // 父类TraitBasicPerson(特质同理)和特质Young中都定义并初始化了name属性===>冲突(必须重写该属性)
    // 方法同理
    override val name: String = "student"

    // 重写冲突的方法
    // 父类和特质平等,调用顺序从右往左:Knlowledge===>Young===>TraitBasicPerson
    override def RepeatFunc(): Unit = super.RepeatFunc()

    override def dating(): Unit = println(s"$name is dating")

    override def increasing(): Unit = {
        amount += 1
        println(s"$name knowledge increased: $amount")
    }

}