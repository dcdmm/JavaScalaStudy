package sc_oop.rights

object SonClass {
    def main(args: Array[String]): Unit = {
        val person: Person = new Person()
        // println(person.idCard)
        println(person.age)
        println(person.sex)
        // println(person.name)

        println("*****************************************")
        val student: Student = new Student()
        // println(student.idCard)
        println(student.age)
        println(student.sex)
        // println(student.name)
    }
}


class Student extends Person {
    override def printInfor(): Unit = {
        println("student:")
        // idCard = "20310101"
        name = "dmm"
        sex = "woman"
        age = 0
        println(s"Peson:$name $sex $age")
    }
}