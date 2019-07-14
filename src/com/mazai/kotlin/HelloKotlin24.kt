package com.mazai.kotlin

class MyExtensionProperty

val MyExtensionProperty.name get() = "hello"

fun main() {
    val myExtensionProperty = MyExtensionProperty()
    println(myExtensionProperty.name)
}