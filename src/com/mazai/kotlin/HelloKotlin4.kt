package com.mazai.kotlin

import java.lang.NumberFormatException

fun main() {
    println(convert2Int("ab"))

    printMultiply("22", "a")
    println("------------------")
    printMultiply2("22","3")
}

fun convert2Int(str: String): Int? {
    return try {
        str.toInt()
    } catch (ex: NumberFormatException) {
        null
    }
}

fun printMultiply(a: String, b: String) {
    val num1 = convert2Int(a)
    val num2 = convert2Int(b)
    if (null != num1 && null != num2) {
        println(num1 * num2)
    } else {
        println("param not int")
    }
}

fun printMultiply2(a: String, b: String) {
    val num1 = convert2Int(a)
    val num2 = convert2Int(b)
//   if (null == num1){
//       println("param not int")
//   }else if (null == num2){
//       println("param not int")
//   }else{
//       println(num1 * num2)
//   }
    when{
        null == num1 -> print("param not int")
        null == num2 -> print("param not int")
        else -> println(num1 * num2)
    }
}