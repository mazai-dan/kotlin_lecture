package com.mazai.kotlin5

fun String.filter(predicate:(Char)-> Boolean):String{
    val sb = StringBuffer()

    for (index in 0 until length){
        val element = get(index)

        if (predicate(element)){
            sb.append(element)
        }
    }

    return sb.toString()
}

fun main() {
    val str = "a0b1c2d3"

    println(str.filter { it.isLetter() })
}