package com.mazai.kotlin

import com.mazai.kotlin.multiply as  my
fun main() {
    val a: Int = 1
    val b = 2
    var c: Int

    c = 3

    var d = 3
    println(d)

    var x = 10
    var y:Byte = 20

    x = y.toInt()

    println(x)

    println(my(1,2))
    val m = intArrayOf(1,2,3)
    m.set(0,4)

    for (item in m){
        println(item)
    }
}