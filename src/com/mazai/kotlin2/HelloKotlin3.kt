package com.mazai.kotlin2

class MyGeneric<T>(t: T) {
    var variable: T = t
}


fun main() {
    var myGeneric = MyGeneric("helloworld")//借助于Kotlin的类型推导

    println(myGeneric.variable)

    var myClass = MyClass<String, Number>("abcd", 2)

    myTest(myClass)
}

//协变(covariant) 与 逆变(controvariant)

/**
 * 我们只从中读取数据,而不往里面写入内容，这样的对象叫做生产者;如果只向里面写入数据，而不从中读取数据，这样的数据叫做消费者。
 *
 * 生产者使用<? extends E>  is 协变；消费者使用<? super E> is 逆变 contravariance；
 */


class MyClass<out T, in M>(t: T, m: M) {
    private var t: T = t

    private var m: M = m


    fun get(): T = this.t

    fun set(m: M) {
        this.m = m
    }
}


fun myTest(myClass: MyClass<String, Number>) {

    var myObject: MyClass<Any, Int> = myClass

    println(myObject.get())

}







