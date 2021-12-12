package sg_generics

/**
 * 泛型上下限(对传入的泛型进行限定)
 */
object Features1 {
    def main(args: Array[String]): Unit = {
        // 泛型上限
        def test_<:[A <: Features1Child](a: A): Unit = {
            println(a.getClass.getName)
        }

        // test_<:(new Features1Parent) // 报错;泛型上限为Features1Child
        test_<:(new Features1Child)
        test_<:(new Features1SubChild)
        println("*****************************************************")

        // 泛型下限
        def test_>:[A >: Features1Child](a: A): Unit = {
            println(a.getClass.getName)
        }

        test_>:(new Features1Parent)
        test_>:(new Features1Child)
        // test_>:(new Features1SubChild) // 报错;泛型下限为Features1Child
    }
}

class Features1Parent

class Features1Child extends Features0Parent

class Features1SubChild extends Features1Child