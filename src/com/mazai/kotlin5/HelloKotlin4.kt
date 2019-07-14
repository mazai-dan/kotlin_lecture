package com.mazai.kotlin5

/*
       内联函数( function)
       内联函数的解释https://www.jianshu.com/p/be78824ce1c2
 */

inline fun myCalculate(a:Int,b:Int) = a+b

fun main() {
    println(myCalculate(1,2))
}