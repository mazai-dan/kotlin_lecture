package com.mazai.kotlin12

fun main() {
    val myClass = MyClass()
    println(myClass.getA())
    println(myClass.a)

}

class MyClass{
    val a:Int
        @JvmName("getAValue")
        get() = 20

    fun getA()=30
}

