package com.mazai.kotlin6

/*
    在默认情况下，lambda表达式中最后一个表达式的值会隐式作为该lambda表达式的返回值
    我们可以通过全限定的return语法来显示从lambda表达式返回值
 */

fun main() {
    val strings = arrayOf("hello","world","bye")

    strings.filter {
        val mayFilter = it.length > 3
        mayFilter
    }

    strings.filter {
//        val mayFilter = it.length > 3
        return@filter it.length > 3
    }
}