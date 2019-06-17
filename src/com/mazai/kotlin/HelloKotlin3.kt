package com.mazai.kotlin

fun main() {
    var x = 20
    var y = 10

//    var max: Int
//    var min: Int
//
//    if (x > y){
//        max = x
//        min = y
//    }else{
//        max = y
//        min = x
//    }

//    print("max = $max , min = $min")
//
//    var max = if (x > y)x else y
//    var min = if (x > y)y else x
//    print("max = $max , min = $min")

    var max = if (x > y) {
        println("x > y")
        x
    } else {
        println("x <= y")
        y
    }

    var min = if (x > y) {
        println(" x >y")
        y
    } else {
        println("x<y")
        x
    }
}