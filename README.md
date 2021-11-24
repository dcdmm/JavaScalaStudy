# JavaScalaStudy
**Java/Scala学习笔记(基于maven)**


### 命名规则(<font color='red'>Java</font>/Scala)
1. 包名全部小写
2. 类名首字母大写,其余组成词首字母依次大写
3. 变量名/方法名首字母小写,如果名称由多个单词组成,除首字母外的每个单词的首字母都要大写
4. 常量名全部大写,如有多个单词,用下划线隔开
5. 所有命名规则必须遵循以下规则:
    * 名称只能由字母、数字、下划线、$符号组成
    * 严格区分大小写
    * 不能以数字开头
    * 名称不能使用Java中的关键字


### 常见运算符优先级排序(<font color='red'>Java</font>/Scala)
| 运算符                                                       | 结合性   |
| ------------------------------------------------------------ | -------- |
| []、()、.                                                     | 从左向右 |
| !、~、++、--                                                  | 从右向左 |
| *、/、%                                                       | 从左向右 |
| +、-                                                          | 从左向右 |
| <<、>>、>>>                                                   | 从左向右 |
| <、<=、>、>=、instanceof                                      | 从左向右 |
| ==、!=                                                       | 从左向右 |
| &                                                            | 从左向右 |
| ^                                                            | 从左向右 |
| \|                                                           | 从左向右 |
| &&                                                           | 从左向右 |
| \|\|                                                         | 从左向右 |
| ?:                                                           | 从右向左 |
| =、+=、-=、*=、/=、%=、&=、!=、^=、<、<=、>、>=、>>>=           | 从左向右 |


### 字符集
* ADCII:
    * 美国信息交换标准代码
    * 标准ASCII码也叫基础ASCII码,使用7位二进制数(剩下的1位二进制为0)来表示所有的大写和小写字母丶数字0到9丶标点符号丶以及在美式英语中使用的特殊控制字符
* GB2312:
    * 信息交换用汉字编码字符集
    * 每个汉字及符号以两个字节来表示
    * 基本满足了汉字的计算机处理需要,对于人名丶古汉语等方面出现的罕用字,GB2312不能处理
* GBK:是在GB2312-80标准基础上的内码扩展规范,使用了双字节编码方案
* Unicode:
    * 是国际组织制定的可以容纳世界上所有文字和符号的字符编码方案
    * Unicode通常用两个字节表示一个字符,原有的英文编码从单字节变成双字节,只需要把高字节全部填为0就可以
* UTF-8:
    * 是针对Unicode的一种可变长度字符编码
    * 对不同范围的字符使用不同长度的编码,编码的最大长度是4个字节


### 小技巧(Java/Scala)
* 代码块中只有一句代码可以省略花括号
  ```Scala
    for (i <- 1 to 3) {
        println(i)
    }

    // 与上等价
    for (i <- 1 to 3) 
        println(i)
  ```


### 目录
#### Java
* a_basi--->基础
* b_basic--->基础
* c_oop--->面向对象编程
* d_exception--->异常
* e_JDK5
  * annotation--->注解
  * enumeration--->枚举
  * generics--->泛型
* f_IO--->I/O流
* h_concurrency--->容器
* z_common_class_interface--->其他常见接口或类
* z_design_pattern--->设计模型

#### Scala
* sa_basic--->基础


视频进度:78