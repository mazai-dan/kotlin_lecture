package com.mazai.kotlin3
//内部类(Inner Class)

/**
 * 关于嵌套类与内部类之间的区别与联系：
 *
 * 1.嵌套类：对应于Java的静态内部类（即有static关键字修饰的内部类），只要在一个类的内部定义了另外一个类，那么这个类就叫做嵌套类，
 *   相当于Java当中有static关键字修饰的内部类
 * 2.内部类：对应于Java中的非静态内部类（即没有static关键字修饰的内部类），使用inner关键字在一个类的内部所定义的另外一个类就叫做
 *   内部类，相当于java当中没有static关键字修饰的内部类
 */
class OuterClass2{

    private var str:String = "hello world"

   inner class InnerClass{
        fun  innerMethod() = this@OuterClass2.str

    }

    //局部嵌套类
    fun getName():String{
        class LocalNestedClass{
            val name:String = "mytest"
        }

        val localNestedClass = LocalNestedClass()

        return localNestedClass.name
    }
}

fun main() {
    println(OuterClass2().InnerClass().innerMethod())

    println(OuterClass2().getName())
}