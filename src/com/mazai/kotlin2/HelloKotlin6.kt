package com.mazai.kotlin2

//use-site variance(type projection)，类型投影
fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)

    for (index in from.indices) {
        to[index] = from[index]
    }
}

fun main() {
    val from: Array<Int> = arrayOf(1, 2, 3, 4)
    val to: Array<Any> = Array(4) { "hello$it" }

    for (item in to) {
        println(item)
    }

    copy(from, to)
    println("---------------------------")

    var array: Array<String> = Array(4) { "hello" }

    for (item in array) {
        println(item)
    }

    setValue(array, 1, "world")
    println("--------------------------")
    for (item in array) {
        println(item)
    }
    println("---------------------------")

    val array2:Array<Any> = Array(4){"hello$it"}
    for (item in array2) {
        println(item)
    }
    println("----------------------------------")
    setValue(array2,1,"world")
    for (item in array2) {
        println(item)
    }
}

fun setValue(to: Array<in String>, index: Int, value: String) {
    to[index] = value
}