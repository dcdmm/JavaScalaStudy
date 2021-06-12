package sc_oop.rights

object Test01 {

}


class Person {
    private var idCard: String = "199507237311"
    protected var name: String = "duanchao"
    var sex: String = "man"
    private[rights] var age: Int = 18

    def printInfor(): Unit = {
        println(s"Peson:$idCard $name $sex $age")
    }
}