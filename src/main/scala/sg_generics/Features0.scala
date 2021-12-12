package sg_generics

/**
 * 协变与逆变
 */
object Features0 {
    def main(args: Array[String]): Unit = {
        val childList0: Features0Collection[Features0Parent] = new Features0Collection[Features0Parent]

        // 报错:Features0Collection[Features0Child]不是Features0Parent的子类
        // val childList1: Features0Collection[Features0Parent] = new Features0Collection[Features0Child]

        // Features0Collection_+[Features0Child]此时是Features0Collection_+[Features0Parent]的子类(通过协变)
        val childList1: Features0Collection_+[Features0Parent] = new Features0Collection_+[Features0Child]

        // Features0Collection_-[Features0Parent]此时是Features0Collection_-[Features0Child]的子类(通过逆变)
        val childList2: Features0Collection_-[Features0Child] = new Features0Collection_-[Features0Parent]
    }
}

class Features0Parent() {}

class Features0Child extends Features0Parent {}

class Features0SubChild extends Features0Child {}

class Features0Collection[E] {}

// 协变
class Features0Collection_+[+E] {}

// 逆变
class Features0Collection_-[-E] {}
