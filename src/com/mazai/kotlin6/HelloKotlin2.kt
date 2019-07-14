package com.mazai.kotlin6

/*
    匿名函数


 */



fun main() {
    val strings = arrayOf("hello","world","bye")
    strings.filter(fun(item):Boolean = item.length > 3).forEach(fun(item){item})
}