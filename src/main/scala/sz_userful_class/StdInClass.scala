package sz_userful_class
import scala.io.StdIn

/**
 * StdIn类:从键盘获取输入
 */
object StdInClass {
    def main(args: Array[String]): Unit = {
        val name = StdIn.readLine() // Read a full line from the default input. Returns null if the end of the input stream has been reached.
        println(name)

        println("*******************************************")

        val age = StdIn.readInt() // Reads an int value from an entire line of the default input.
        println(age)

        println("*******************************************")

        val payment = StdIn.readDouble() // Reads a double value from an entire line of the default input.
        println(payment)

        /*
        def readLong(): Long
            Reads an long value from an entire line of the default input.

        def readBoolean(): Boolean
            Reads a boolean value from an entire line of the default input.

        def readByte(): Byte
            Reads a byte value from an entire line of the default input.

        def readChar(): Char
            Reads a char value from an entire line of the default input.

       def readFloat(): Float
            Reads a float value from an entire line of the default input.
         */
    }
}
