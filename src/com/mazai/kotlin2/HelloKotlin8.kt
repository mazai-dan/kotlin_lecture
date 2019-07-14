package com.mazai.kotlin2

class MyStorage<out T>(private var t:T){
    fun getValue():T{
        return  this.t
    }

    fun SetValue(t:@UnsafeVariance T){
        this.t = t
    }
}

fun main() {
    val myStroage1 : MyStorage<Int> = MyStorage(5)
    val myStroage2 : MyStorage<Any> = myStroage1

    println(myStroage2.getValue())
    myStroage2.SetValue("hello")//泛型擦除
    println(myStroage2.getValue())
}