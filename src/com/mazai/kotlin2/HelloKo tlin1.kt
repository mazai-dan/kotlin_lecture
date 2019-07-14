package com.mazai.kotlin2

/*
    数据类需要满足如下要求：
    1.主构造方法至少要有一个参数
    2.所有的主构造方法参数都需要被标记为var 或 val
    3.数据类不能是抽象的、open的、sealed、以及inner的


    对于数据类，编译器会自动生成如下内容：

    1.equals/hashCode对
    2.toSting()方法，形式为Person(name = ...,age = ...,address = ...)
    3.针对属性的componentN方法，并且是按照属性的声明顺序来生成的

    关于数据类成员的继承要点：

    1.如果数据类中显式定义了equals,hashCode或者是toString方法，或者是在数据类的父类中将这些方法声明了为final
      那么这些方法就不会再生成，转而使用已有的。
    2.如果这些父类拥有componentN方法,并且是open的，以及返回兼容的类型，那么编译器就会在数据类中生成相应的componentN方法，
      并且重写父类的这些方法；如果父类中的这些方法由于不兼容的签名或是被定义为final的,那么编译器就会报错。
    3.在数据类中显示提供componentN方法以及copy方法实现是不允许的

    解构声明

    在主构造方法中有多少个参数，就会一次生成对应的component1,component2,component3...
    这些方法返回的就是对应字段的值，componentN方法是用来实现解构声明的
 */
data class Person(val name:String,val age:Int,var adderss:String)

/*
    在JVM平台上，如果生成的类需要拥有无参的构造方法，那么就需要为所有属性指定默认值
 */
data class Person2(val name:String = "",val age:Int = 0,var adderss:String = "")


fun main() {
    var person = Person("zhangsan",22,"beijing")

    println(person)

    var person2 = person.copy(adderss = "shenzhen")

    println(person2)

    var(name,age,address) = person
    println("$name:$age:$address")
}