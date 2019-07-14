@file:JvmName("HelloKotlin2")

package com.mazai.kotlin9

import kotlin.reflect.KClass

//注解也可以拥有自己的构造方法，兵器企鹅构造方法也可以接受参数

/*
    注解构造方法所允许的参数类型：
    与java原生类型所对应的类型(Int,Long...)
    字符串：string
    classes(MyClass: class)
    枚举：enums
    其他的注解
    上述类型的数组类型

    Kotlin的注解参数是不允许可空类型，因为JVM不支持以null的形式存储注解属性值的

    如果某个注解被用作其他注解的参数，那么其名字就不需要以@字符开头
 */

annotation class MyAnnotation2(val str:String)

@MyAnnotation2("hell0")
class MyClass4

annotation class MyAnnotation3(val str:String,val myAnnotation:MyAnnotation2)


@MyAnnotation3("hello", MyAnnotation2("world"))
class MyClass5

/*
    如果需要将某个class作为注解的参数，那么请使用Kotlin class(KClass)

    Kotlin编译器会自动将其转换为Java Class
    这样，Java代码就可以正常看到注解与参数了
 */

annotation class MyAnnotation4(val arg1:KClass<*>,val arg2:KClass<out Any>)


@MyAnnotation4(String::class,Int::class)
class MyClass6


//注解使用处目标(use-site target)
/*
    在对类的属性或是主构造方法的参数声明注解时，会存在多个Java元素都可以通过对应的Kotlin元素生成出来
    因此，在所生成的Java字节码中，就会存在多个可能的位置来生成相应的注解。若想精确指定如何来生成注解，
    那么可以使用注解的使用处目标来实现
 */

class MyClass7 (@field: MyAnnotation val agr1:String,//注解 Java field
                @get: MyAnnotation val arg2:String,//注解 Java Getter
                @param: MyAnnotation val agr3:String)//注解 Java Constructor param