﻿ JavaHomeWork5
类、对象基础知识（三）
===============
任务与整体解决方案：
------
* 运行下面的程序，将“public int x, y;”改为“private int x, y;”后重新编译程序会出现什么情况？如何解决？如果在main()中先显示num的值再输出调用getNum()的结果应怎样写代码？请给出完整程序。
* 设计一个有理数类，包含实施加减乘除等算术运算的静态方法。编写测试类，实现对键盘输入数据进行各种基本运算。
* 设计一个教师类和一个课程类。其中，教师类包括教师姓名和职称属性；课程类包括课程名和学分属性。再设计一个授课类，包含教师类型的授课教师属性和课程类型的所授课程属性，以及上课地点和学生人数属性。需为上述三个类定义相关行为描述。编写测试类，执行创建对象显示结果等操作。
### 运行下面的程序，将“public int x, y;”改为“private int x, y;”后重新编译程序会出现什么情况？如何解决？如果在main()中先显示num的值再输出调用getNum()的结果应怎样写代码？请给出完整程序。

改为私有后无法直接调用，可以另行创建方法来调用。静态方法无法调用非静态方法。

### 设计一个有理数类，包含实施加减乘除等算术运算的静态方法。编写测试类，实现对键盘输入数据进行各种基本运算。

加减乘除使用静态方法，较为简单。

### 设计一个教师类和一个课程类。其中，教师类包括教师姓名和职称属性；课程类包括课程名和学分属性。再设计一个授课类，包含教师类型的授课教师属性和课程类型的所授课程属性，以及上课地点和学生人数属性。需为上述三个类定义相关行为描述。编写测试类，执行创建对象显示结果等操作。

将教室类和课程类设置为静态，在新的类中创建两个此类即可.

领悟：
------
### 几点小错误先放前面
String变量中**S**要大写<br>
想使用过滤流，需要加入如下头文件：
```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
```
**Junit不支持从控制台输入**<br>

### 关于静态
使用static修饰的变量/方法/代码块称为**静态**变量/方法/代码块<br>
静态变量被所有的对象所共享，在内存中只有一个副本，它当且仅当在类初次加载时会被初始化<br>
静态方法可以直接用名称引用，不需要this引用，在静态方法中不能访问类的非静态成员变量和非静态成员方法，因为非静态成员方法/变量都是必须依赖具体的对象才能够被调用<br>
static可以用来形成静态代码块以优化程序性能，具体使用方式日后有待考究<br>
[具体可以参考这里](https://www.cnblogs.com/0mbiubiu/p/5331390.html)<br>
*Signed-off-by: 遥梦幽兰kzx <kjx336@163.com>*
