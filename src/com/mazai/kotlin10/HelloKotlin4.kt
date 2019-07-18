package com.mazai.kotlin10

fun main() {
    val myException = MyException()
//    myException.myMethod()

    println("--------------")

    val clazz = MyException()::class.java

    println(clazz)

    println("---------------")

    println(MyException().javaClass)
}