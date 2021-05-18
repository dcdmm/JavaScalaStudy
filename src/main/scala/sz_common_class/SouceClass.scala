package sz_common_class

import java.io.{File, FileWriter}
import scala.io.Source

/**
 * Source类:文件读取
 * java.io:文件写入
 */
object SouceClass {
    def main(args: Array[String]): Unit = {
        // 从文件中读取数据
        Source.fromFile("src/main/resources/test2.txt").foreach(print)

        // 将数据写入文件(参见java.io)
        val write = new FileWriter(new File("src/main/resources/test5.txt"))
        write.write("hello scala from java writer")
        write.close()
    }
}
