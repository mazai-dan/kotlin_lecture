package com.mazai.Kotlin8

import java.lang.Integer.parseInt


//异常，Kotlin中的try是个表达式
//Kotlin中是没有checked execption的 全部都是runtime execption
fun main() {
    val s = "a"

    val result: Int? = try {
        parseInt(s)
    } catch (ex: NumberFormatException){
        null
    } finally {
        println("finally invoked")
    }

    println(result)
}