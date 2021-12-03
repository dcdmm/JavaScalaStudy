package sc_oop

import scala.beans.BeanProperty

/**
 * scala属性添加@BeanProperty注解时,会自动生成get/set方法
 */
object GetSet {
    def main(args: Array[String]): Unit = {
        val getSetTest = new GetSetTest
        println(getSetTest.name)
        getSetTest.setName("duanchao")
        print(getSetTest.getName)
    }
}

class GetSetTest {
    @BeanProperty
    var name: String = "hello"
}
