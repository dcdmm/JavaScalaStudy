package sc_oop.oop_extends

/**
 * 自身类型
 *
 * 主要用于提醒子类,子类继承父类,需要满足继承父类的某些条件
 */
object SelfType {
    def main(args: Array[String]): Unit = {
        val registerUser = new RegisterUser("dcdmm", "123456")
        registerUser.insert()
    }
}

class User(val name: String, val password: String) {

}

trait UserDao {
    // 自身类型
    this: User =>

    def insert(): Unit = {
        println(this.getClass)
        println(s"insert into db: ${this.name}")
    }
}

class RegisterUser(name: String, password: String)
        extends User(name, password)
                with UserDao // 要求必须继承User类
