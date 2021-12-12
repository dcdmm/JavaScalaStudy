package sc_oop.basic_rights

import scala.beans.BeanProperty

/**
 * scala属性添加@BeanProperty注解时,会自动生成getter/setter方法
 */
object GetSet {
    def main(args: Array[String]): Unit = {
        val getSetTest = new GetSetTest[String]
        println(getSetTest.name)
        getSetTest.setName("duanchao")
        print(getSetTest.getName)
    }
}

class GetSetTest[A] {
    @BeanProperty
    var name: A = _
}
