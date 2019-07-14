package com.mazai.kotlin

class CompanionObjectExtension {
    companion object{

    }
}

fun CompanionObjectExtension.Companion.method(){
    println("hello world")
}

fun main() {
    CompanionObjectExtension.method()
}