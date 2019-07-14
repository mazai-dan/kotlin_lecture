package com.mazai.kotlin

//扩展: extension

/**
 * 扩展函数的解析是静态的
 *
 * 1.扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或是方法
 * 2.扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
 * 3.调用是由对象声明类型所决定的，而不是由对象的实际类型所决定的
 */

class ExtensionTest {

    fun add(a: Int, b: Int)  = a + b
    fun subtract(a: Int, b: Int)  = a - b
}

fun ExtensionTest.multiply(a:Int,b:Int) = a * 2

fun main() {
    var extensionTest = ExtensionTest()

    println(extensionTest.add(1,2))
    println(extensionTest.subtract(1,2))
    println(extensionTest.multiply(1,2))

    println("---------------")

    myPrint(AA())
    println("---------------")
    myPrint(BB())


    println("---------------")

    val dd = DD();

    dd.aa()
}

open class AA

class BB:AA()

fun AA.a() = "a"

fun BB.a() = "b"

fun myPrint(aa:AA){
    println(aa.a())
}

class DD{
    fun aa(){
        println("aa")
    }
}

fun DD.aa() = println("DD.aa")

fun Any?.toString():String{
    if (null == this){
        return "null"
    }
    return toString()
}