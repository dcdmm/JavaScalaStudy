package sa_basic

import org.junit.Test

/**
 * Scala字符串
 */
class StringTest {
    @Test
    def test0(): Unit = {
        val name0: String = "duan"
        val name1: String = "chao"
        println(name0 + name1) // 字符串的拼接
        println(name0 * 3) // 字符串的重复
    }

    @Test
    def test_printf(): Unit = {
        val age: Double = 25.6723551
        val school: String = "guangcai"
        val payment: Int = 10000

        printf("%s\n", school) // 字符串本身

        printf("%f\n", age)
        printf("%.4f\n", age) // 保留小数点后四位(四舍五入)

        printf("%e\n", age)
        printf("%.5e", age) // 科学计数法(保留5位有效数字)

        printf("%b\n", 11) // 二进制
        printf("%d\n", 11) // 十进制
        printf("%o\n", 11) // 八进制
        printf("%x\n", 11) // 十六进制

        printf("年龄为%f;学校为%s;工资为%d", age, school, payment) // 按默认顺序
    }

    @Test
    def test2(): Unit = {
        val age: Double = 25.6723551
        val school: String = "guangcai"
        val payment: Int = 11

        println("年龄为:" + age + ";学校为:" + school + ";工资为:" + payment)
        println(s"年龄为:$age;学校为:$school;工资为:$payment") // 直接输出,与上等价

        println(f"年龄为:$age%.2f;学校为:$school;工资为:$payment%x") // 同时进行printf格式化操作
    }

    @Test
    def test3(): Unit = {
        val sql =
            """
              |SELECT * FROM
              |    database
              |WHERE
              |    name="dcdmm"
              |AND
              |    age>50
              |""" // 三引号表示多行字符串(类似python)
        println(sql)
    }

    @Test
    def test4(): Unit = {
        val name0: String = "China"
        val name1: String = "china"

        // Java中String类方法(参见java.lang.String)
        println(name0.length)
        println(name0.equals(name1))
        println(name0.equalsIgnoreCase(name1))
        println(name0.indexOf("ch"))
        println(name0.replace("a", "A"))
        println("*****************************************************")

        val name2 =
            """
              |a
              |b
              |c
              |d
              |e
              |f
              |"""
        println(name2)
        println(name2.stripMargin) // 去掉每行连接符(默认为'|')及连接符之前的空格
    }
}
