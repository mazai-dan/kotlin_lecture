package com.mazai.kotlin

fun main() {
    var array = listOf("hello","world","hello world","welcome","goodbye")

    for (item in array) {
        println(item)
    }

    println("--------------")

    when{
        "world" in array-> println("world in collection")
    }

    println("-------------------")

    array.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach{ println(it) }
}