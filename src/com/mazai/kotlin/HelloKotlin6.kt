package com.mazai.kotlin

fun main() {
    var array: IntArray = intArrayOf(1, 2, 3, 4, 5)
    for (i in array) {
        println(i)
    }

    println("-------------------")

    for (item in array.indices) {
        println("array[$item] = ${array[item]}")
    }

    println("-------------------")

    for ((index,value) in array.withIndex()) {
        println("array[$index] = $value")
    }
}