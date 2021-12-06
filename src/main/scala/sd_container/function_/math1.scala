package sd_container.function_


object math1 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        // 1,过滤
        val evenList = list.filter(elem => elem % 2 == 0)
        println(evenList)

        // map操作
        println(list.map(elem => elem * 2)) // 每个元素乘2

        // 扁平化
        val nesedList = List(List(1, 2, 3), List(5, 6, 7))
        val flatList = nesedList.flatten
        println(flatList)

        // map + 扁平化
        val strings: List[String] = List("hello world", "hello java", "hello python")
        val splitList: List[Array[String]] = strings.map(str1 => str1.split(" "))
        println(splitList)
        val flat_splitList = splitList.flatten
        println(flat_splitList)

        val flat_split = strings.flatMap(str1 => str1.split(" "))
        println(flat_split)


        // 分组操作
        // 分成奇数和偶数组
        val groupMap = list.groupBy(data => {
            if (data % 2 == 0) {
                "偶数"
            } else {
                "奇数"
            }
        })
        println(groupMap)

        // 给定一组词汇,按照单词的首字母分组
        val wordList = List("china", "canada", "english", "fresh")
        println(wordList.groupBy(data => data.charAt(0)))
    }
}
