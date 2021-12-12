package sg_generics

/**
 * 泛型类
 */
object Basic {
    def main(args: Array[String]): Unit = {
        val people = new Basic_example[String, Int]("dc", 34)
        println(people.getName)
        println(people.getAge)

        people.setName("dmm")
        println(people.getName)
    }
}

class Basic_example[N, A](var name: N, var age: A) {
    def getName: N = {
        return name
    }

    def setName(newName: N): Unit = {
        name = newName
    }

    def getAge: A = {
        return age
    }

    def setAge(newAge: A): Unit = {
        age = newAge
    }
}
