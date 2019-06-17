package com.mazai.kotlin

fun main(){
    println(sum(1,2))
    println(sum(2,5))
    myPrint(9,0)
}

fun sum(a:Int,b:Int) = a +b

fun myPrint(a:Int,b:Int){
    print("$a + $b = ${a + b}")
}