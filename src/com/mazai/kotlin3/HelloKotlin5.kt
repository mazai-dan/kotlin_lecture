package com.mazai.kotlin3

class OuterClass5 {

    inner class InnerClass5(str: String) {
        init {
            println(str)
        }
    }
}

fun main() {
    val outerClass5:OuterClass5.InnerClass5 = OuterClass5().InnerClass5("你好")
}