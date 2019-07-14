package com.mazai.kotlin

open class  Fruit{
    open fun name(){
        println("fruit")
    }

    fun expirationDate(){
        println("1 month")
    }
}

class Apple :Fruit(){
     override fun  name(){
         println("apple")
    }
}

open class Orange:Fruit(){
    final override fun name() {
        println("orange")
    }
}

fun main() {
    val apple = Apple()

    var orange = Orange()
    orange.name()
    println("-------------")

    apple.name()
    apple.expirationDate()
}