package com.mazai.kotlin

fun main() {
    val a = 5
    var b = 10

    if (a in 2..b){
        println("in the range")
    }

    if (a !in 2..b){
        println("out of range")
    }

    println("--------------")

    for (i in 2..10){
        println(i)
    }

    println("--------------")

    for (i in 2.rangeTo(10)){
        println(i)
    }

    println("--------------")

    for (i in 2..10 step 2){
        println(i)
    }

    println("---------------")

    for (i in 10 downTo 2 step 2){
        println(i)
    }
}

