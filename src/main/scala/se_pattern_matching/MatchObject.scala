package se_pattern_matching

/**
 * 匹配对象实例(通过伴生对象)
 */
object MatchObject {
    def main(args: Array[String]): Unit = {
        val student = new MatchObjectStudent(name = "duanchao", age = 23)

        val result = student match {
            // 伴生对象必须实现apply,unapply方法
            case MatchObjectStudent("duanchao", 23) => 34 //MatchObjectStudent("duanchao", 23) => "duanchao 23"
            case _ => "else"
        }
        println(result)
    }
}

class MatchObjectStudent(val name: String, val age: Int) {

}

object MatchObjectStudent {
    def apply(name: String, age: Int): MatchObjectStudent = {
        new MatchObjectStudent(name, age)
    }

    // unapply方法:接受一个对象,并从对象中提取出相应的值
    def unapply(student: MatchObjectStudent): Option[(String, Int)] = {
        if (student == null) {
            None
        } else {
            Some((student.name, student.age))
        }
    }
}