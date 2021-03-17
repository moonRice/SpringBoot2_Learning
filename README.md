# SpringBoot2学习笔记

本次流程为系统学习Spring系列，参考教材为《Java编程思想》、《Spring入门》（江南一点雨）。

## 一、Java

### 1.1 Java基础知识

#### 1.1.1 面向对象（OOP）or面向过程（OOA）

##### 1、面向对象的三大特征

封装（Encapsulation）

继承（Inheritance）

多态（Polymorphism）

##### 2、Java类及类的成员

万事万物都可以class成一个类。属性、行为：

人的属性：身高、体重……

人的行为：吃饭、睡觉……

##### 3、类的属性

public、private、protected

static：不需要实例化，可以直接使用（字体会变成斜体）。

![img](file:///C:/Users/zheng/AppData/Local/Temp/msohtmlclip1/01/clip_image001.png)

school属性不用new

##### 4、变量的分类

包括成员变量和局部变量。

成员变量：实例变量（不以static修饰）、类变量（以static修饰）；

l **成员变量定义在类中，在整个类中都能被访问；**

l **成员变量分为类成员变量和实例成员变量，实例变量存在于对象所在的堆内存中；**

l **成员变量有默认初始化值；**

l **成员变量的权限修饰符可以根据需要任选一个。**

 

局部变量：形参（方法签名中定义的变量）、方法局部变量、代码块局部变量。

l **局部变量只定义在局部范围内（方法、代码块内）；**

l **局部变量存在于栈内存内；**

l **作用的范围结束，变量空间会自动释放；**

l **局部变量没有默认初始化值，每次必须显式初始化值；**

l **局部变量声明时不用指定权限修饰符。**

##### 5、方法的重载（overload）

```java
public int add(int a, int b, int c) {
    return a + b + c;
}
public int add(int a, int b) {
    return a + b;
}
public int add(int a, int b, double c) {
    return a + b + c;
}
```



![img](file:///C:/Users/zheng/AppData/Local/Temp/msohtmlclip1/01/clip_image003.jpg)

如果方法名一样，看形参就知道用哪一个方法

顺序不同也是重载，形参名称不同不是重载。

##### 6、方法的可变个数的参数

```java
  // 方法的可变个数的参数
   public static void kebian(String[] args) {
     for (String arg : args) {
       System.*out*.println(arg);
     }
   }
 
   public static void kebian2(String... args) {
     for (String arg : args) {
       System.*out*.println(arg);
     }
   }
 }
```

【注意】参数（String[] args）只能写在最后面。（String a, String[] args, int b）是错误的！

##### 7、方法的参数传递

如果方法的形参是基本数据类型，那么实参（实际的数据）向形参传递数据时，就是直接传递，把实参的值复制给形参。

如果方法的形参是对象，那么实参（实际的对象），向形参传递参数的时候，也是把值给形参，这个值是实参在栈内存中的值，也就是引用对象在堆内存中的地址。

基本数据类型都是保存在栈内存中的，引用对象在栈内存中保存的是引用对象的地址，那么方法的参数传递是传递值（是变量在栈内存当中的值）。

##### 8、封装和隐藏

使用者对类内部定义的属性（对象的成员变量）的直接操作会导致数据的错误、混乱或安全性问题。

l **隐藏一个类中不需要对外提供的实现细节；**

l **使用者只能通过事先定制的方法来访问数据，可以方便加入逻辑控制，限制对属性不合理的操作；**

l **便于修改，增强代码的可维护性。**

##### 9、访问权修饰符

public>protected>default>private

类内部、同一个包、子类、任何地方

##### 10、类的构造方法

不想使用类的默认构造方法，可以自己写一个替换。

构造器：

根据参数的不同，构造器可以分为如下两类：

l **隐式无参构造器（系统默认提供）；**

l **显式定义一个或多个构造器（无参、有参）；**

注意：

l **Java语言中，每个类都至少有一个构造器；**

l **默认构造器的修饰符与所属类的修饰符一致；**

l **一个类可以创建多个重载的构造器；**

l **父类的构造器不可被子类继承。**

##### 11、关键字this

this不能用在static修饰的方法上，因为静态方法不属于任何对象，而this表示当前对象，冲突矛盾。

l **使用this（）必须放在构造器的首行。**

l **不能出现构造器自己调用自己（禁止套娃）。**

##### 12、JavaBean

类似于实体类，一堆setget。

#### 1.1.2 高级类特性

##### 1、继承（extends）

 

##### 2、方法的重写（override）

要求：

l **重写的方法和被重写的方法具有相同的方法名称、参数列表和返回值类型；**

l **重写方法不能使用比被重写方法更严格的访问权限；**

l **重写和被重写方法必须同时为static或同时不为static；**

l **子类方法抛出的异常不能大于父类被重写方法的异常。**

注意方法的**重载**与方法的**重写**。

##### 3、关键字super

super可以跨级调用成员变量。若父类方法被重写，super可以调用爷类未被重写的方法。

##### 4、你是怎么new的对象？

 

##### 5、多态（polymorphism）

多态在Java中的体现是：方法的重载重写、对象的多态性（可直接应用在抽象类和抽象接口上）

子类可以看作特殊的父类，所以父类类型的引用可以指向子类的对象：向上转型（upcasting）。

Person p = new Person();

P = new Student();

或者Person e = new Student();

多态小结：

**前提条件：**

l 需要存在继承或者实现关系；

l 要有覆盖操作。

**成员方法：**

l 编译时：要查看引用变量所属的类中是否有所调用的方法。

l 运行时：调用实际对象所属的类中的重写方法。

**成员变量：**

l 不具备多态性，只看引用变量所属的类。

##### 6、object类

object类是所有Java类的根父类。倘如在类的申明中未使用extends关键字来指明父类，则默认父类为object类。【我是你的object？祖宗类】

##### 7、对象类型转换（casting）

基本数据类型的转换：

自动类型转换à小的数据类型可以自动转换成大的数据类型

例如：long g = 20; double d = 12.0f;

强制类型转换à可以把大的数据类型强制转换成小的数据类型

例如：float f = (float)12.0; int a = (int)1200;

##### 8、“==”与equals

在两个对象用==比较时，若：

```java
Person p1 = new Person();

Person p2 = new Person();

p1 == p2？  --> False
```

因为这是两个内存地址完全不同的对象，只有在

Person p2 = p1;时，才是True。

另外，两边的数据类型必须能兼容，否则错误。

但是，p1.equals(p2) à False同“==”。



注意区别**创建对象**和**自定义变量**。

```java
String a = new String(“abc”);

String b = new String(“abc”);

a == b ?  --> False
```

a.equals(b) ?   --> True equals函数被重写了，这里可以看作比较对象内容。

故总结：

对于对象来说，特殊的类诸如String、File、Date等等，用“==”比较的是对象内存地址，equals比较的是内容。

除了特殊类，其他普通类对象二者比较的均是对象内存地址。

如果你想改变某一个类的equals不想用equals来比较对象内存地址，那就要重写equals方法。

![img](file:///C:/Users/zheng/AppData/Local/Temp/msohtmlclip1/01/clip_image005.jpg)

字面量创建与new创建的区别

由于内存地址不同，“==”与equals产生的效果不同。

![img](file:///C:/Users/zheng/AppData/Local/Temp/msohtmlclip1/01/clip_image007.jpg)

例题

##### 9、包装类（wrapper）

##### 10、接口（interface）

```java
package JavaSE.Interface.USB;

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();

        // 非匿名实现类的非匿名对象
        KingstonUSB kusb = new KingstonUSB();
        PrintUSB pusb = new PrintUSB();
        com.transfoerDate(kusb);
        com.transfoerDate(pusb);

        // 非匿名实现类的匿名对象
        com.transfoerDate(new KingstonUSB());

        // 非匿名实现类的非匿名对象
        USB iPhoneX = new USB(){

            @Override
            public void start() {
                System.out.println("Get Your iPhoneX.");
            }

            @Override
            public void stop() {
                System.out.println("Done.");
            }
        };
        com.transfoerDate(iPhoneX);

        // 匿名实现类的非匿名对象
    }
}

class Computer{
    public void transfoerDate(USB usb){
        usb.start();
        usb.stop();
    }
}

interface USB{
    void start();
    void stop();
}
class KingstonUSB implements USB{
    @Override
    public void start() {
        System.out.println("欢迎使用金士顿U盘。");
    }

    @Override
    public void stop() {
        System.out.println("已弹出金士顿U盘。");
    }
}
class PrintUSB implements USB{
    @Override
    public void start() {
        System.out.println("欢迎使用打印机。");
    }

    @Override
    public void stop() {
        System.out.println("已弹出打印机。");
    }
}
```



## 二、初识Spring

### 2.1 IOC

### 2.2 AOP

| 概念         | 说明                       |
| :----------- | :------------------------- |
| 切点         | 要添加代码的地方称作切点   |
| 通知（增强） | 通知就是向切点动态添加代码 |
| 切面         | 切点+通知                  |
| 连接点       | 切点的定义                 |



















