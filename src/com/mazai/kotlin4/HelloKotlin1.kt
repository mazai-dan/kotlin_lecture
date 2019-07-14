package com.mazai.kotlin4

//委托(delegation)
//类委托

interface MyInterface{
    fun myPrint();
}

class MyInterfaceImpl(val str: String):MyInterface{
    override fun myPrint() {
        println("welcome $str")
    }
}

/**
 * 委托原理：
 *
 * by关键字后面的对象实际上会被存储在类的内部，编译器则会将父接口中的所有方法实现出来
 * 并转交给委托对象来去进行
 */
class MyClass(myInterface: MyInterface):MyInterface by myInterface

fun main() {

    val myInterface = MyInterfaceImpl("张三")
    MyClass(myInterface).myPrint()

}