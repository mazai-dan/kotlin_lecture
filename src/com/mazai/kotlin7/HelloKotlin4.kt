package com.mazai.kotlin7

//Range
fun main() {
    var i = 4

    if (i in 1..5) {
        println(i)
    }

    println("-------")

    for (a in 1..4) {
        println(a)
    }

    for (a in 4..1) {
        println(a)
    }


    println("--------------------")
    for (a in 4 downTo 1) {
        println(a)
    }

    println("--------------------")

    for (a in 6 downTo 1 step 2) {
        println(a)
    }
    println("--------------------")
    for (a in 1 until 6) {
        println(a)
    }
}