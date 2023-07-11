### 快捷键IDEA

| 描述                    | 快捷键                                      |
|-----------------------|------------------------------------------|
| main方法                | psvm                                     |
| System.out.println(); | sout                                     |
| Alt + insert          | 快速生成构造器和Getter,Setter,equals,toString等方法 |
| Alt + Enter           | 快速生成单元测试类/子类/对象变量名等                      |

### 默认值

| 数据类型   | 默认值      |
|--------|----------|
| byte   | byte(0)  |
| short  | short(0) |
| int    | 0        |
| long   | 0L       |
| float  | 0.0f     |
| double | 0.0f     |
| char   | '\u0000' |
| 引用数据类型 | null     |

### 类成员的访问修饰符

| 修饰符       | 同一个类 | 同一个包 | 不同包的子类 | 不同包的非子类 |
|-----------|------|------|--------|---------|
| private   | ok   | NO   | NO     | NO      |
| Default   | ok   | ok   | NO     | NO      |
| Protected | ok   | ok   | ok     | NO      |
| public    | ok   | ok   | ok     | ok      |