package com.mazai.kotlin5

fun main() {
    var strings = arrayOf("hello","world","helloworldD","welcome")
    strings.filter{it.contains("h")}.forEach{ println(it)}

    println("-----------------------------------")

    strings.filter { it.length > 4 }.forEach { println(it) }

    println("-----------------------------------")

    strings.filter { it.endsWith("d",true) }.map { it.toUpperCase() }.forEach { println(it) }


}