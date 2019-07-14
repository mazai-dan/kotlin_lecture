package com.mazai.kotlin5

fun myCalculate(a:Int,b:Int,calculate:(Int,Int) -> Int):Int{
    return calculate(a,b)
}

fun main() {
    println(myCalculate(1,1){a,b->a+b })
    println(myCalculate(1,1){a,b->a-b })
    println(myCalculate(1,1){a,b->a*b })
    println(myCalculate(1,1){a,b->a/b })
}