package com.mazai.kotlin12

fun main() {
    val list = listOf<String>()

    println(list.myFilter())

    val list2 = listOf<Int>()

    println(list2.myFilter())

}

fun List<String>.myFilter():List<String>{
    return listOf("hello","world")
}

@JvmName("myFilter2")
fun List<Int>.myFilter():List<Int>{
    return listOf(1,2)
}