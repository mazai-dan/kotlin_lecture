package com.mazai.kotlin

fun main() {
    println(myPrint("hello"))
    println(myPrint("world"))
    println(myPrint(""))

    var a = 2

    var result = when (a) {
        1 -> {
            println("a = 1");10
        }
        2, 3, 4, 5 -> {
            println("a = 2 or 3 or 4 or 5")
            20
        }
        in 6..10 -> {
            println("a is between 6 and 10")
            30
        }
        else -> {
            println("a is other value")
            40
        }
    }
    println(result)
}

fun myPrint(string: String) = when (string) {
    "hello" -> "HELLO"
    "hello world" -> "HELLO WORLD"
    "world" -> "WORLD"
    else -> ""
}
