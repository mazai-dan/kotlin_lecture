package com.mazai.kotlin2

fun <T> getValue(item: T): T {
    return item
}

fun main() {
    val item = getValue(3)

    println(item)

    val item2 = getValue("hello")
    println(item2)

    val upperBounds = UpperBoundClass2<String>()
//    val upperBounds = UpperBoundClass2<String>()
}

class UpperBoundsClass<T:List<T>>

class UpperBoundClass2 <T> where T:Comparable<T>,T:Any{}