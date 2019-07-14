package com.mazai.kotlin2

import kotlin.test.assertTrue
//在Kotlin中Consumer = ? super T = in  super是往里面添加值 并把该值消费掉  逆变(controvariant)
//在Kotlin中Product = ? extends T = out extends是取值 拿到该值 协变(covariant)
class ParamenterizedClass<A>(private val value:A){
    fun getValue() = value;
}

class ParamenterizedProduct<out T>(private val value:T){
    fun get():T{
        return value
    }
}

class ParamenterizedConsumer<in T>{
    fun toString(value: T):String{
        return value.toString()
    }
}

fun main() {
    val paramenterizedClass = ParamenterizedClass("hello world")
    val result = paramenterizedClass.getValue()

    assertTrue { result is String }

    println("------------------------------")

    val paramenterizedProduct = ParamenterizedProduct("welcome")
    val myRef:ParamenterizedProduct<Any>  = paramenterizedProduct
    assertTrue {myRef is ParamenterizedProduct<Any>}

    println("--------------------------------")

    val paramenterizedConsumer = ParamenterizedConsumer<Number>()

    val consumer:ParamenterizedConsumer<Int> = paramenterizedConsumer

    assertTrue { consumer is ParamenterizedConsumer<Int> }
}