### Java命名规则(Scala类似)

1. 包名全部小写
2. 类名首字母大写,其余组成词首字母依次大写
3. 变量名/方法名首字母小写,如果名称由多个单词组成,除首字母外的每个单词的首字母都要大写
4. 常量名全部大写,如有多个单词,用下划线隔开
5. 所有命名规则必须遵循以下规则:
    * 名称只能由字母、数字、下划线、$符号组成
    * 严格区分大小写
    * 不能以数字开头
    * 名称不能使用Java中的关键字

### Java常见运算符优先级排序(Scala类似)

| 运算符                                      | 结合性  |
|------------------------------------------|------|
| []、()、.                                  | 从左向右 |
| !、~、++、--                                | 从右向左 |
| *、/、%                                    | 从左向右 |
| +、-                                      | 从左向右 |
| <<、>>、>>>                                | 从左向右 |
| <、<=、>、>=、instanceof                     | 从左向右 |
| ==、!=                                    | 从左向右 |
| &                                        | 从左向右 |
| ^                                        | 从左向右 |
| \|                                       | 从左向右 |
| &&                                       | 从左向右 |
| \|\|                                     | 从左向右 |
| ?:                                       | 从右向左 |
| =、+=、-=、*=、/=、%=、&=、!=、^=、<、<=、>、>=、>>>= | 从左向右 |

### 目录

#### Java

* a_basi--->基础
* b_basic--->基础
* c_oop--->面向对象编程
* d_exception--->异常
* e_JDK5
    * annotation--->注解
    * enumeration--->枚举类
    * generics--->泛型
* f_container--->容器
* g_IO--->I/O流
* h_concurrency--->多线程
* z_other_class_interface--->其他常见接口/类
* z_design_pattern--->设计模型

#### Scala

* sa_basic--->基础
* sb_fp--->函数式编程
* sc_oop--->面向对象编程
* sd_container--->容器
* se_pattern_matching--->模式匹配
* sf_impliciti--->隐式转换
* sg_generics--->泛型
* z_other--->其他