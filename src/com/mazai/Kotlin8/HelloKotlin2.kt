package com.mazai.Kotlin8

import java.lang.IllegalArgumentException


//throw在kotlin中是个表达式，这样我们可以将throw作为Elvis表达式的一部分
//throw 表达式的类型是一种特殊的类型：Nothing.
//在自己的代码中，可以使用Nothing来标记永远不会返回的函数
fun main() {
    val str:String? = null
    //Elvis表达式
    val str2 = str ?: throw IllegalArgumentException("参数不能为空")
    println(str2)

    println("===========")

    val str3 = str ?: myMethod("hello")
    println(str3)

    println("==================")

    var s = null
    println(s is Nothing?)

    var s2 = listOf(null)

    println(s2 is List<Nothing?>)
}

fun  myMethod(message:String):Nothing{
    throw IllegalArgumentException(message)
}