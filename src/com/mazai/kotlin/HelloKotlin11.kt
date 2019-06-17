package com.mazai.kotlin

class EmptyClass
//在Kotlin中，一个类可以有一个primary构造方法以及一个或多个secondary构造方法
//primary构造方法是类头（class header）的一部分，它位于类名后面，可以有若干参数

//如果primary构造方法没有任何注解或是可见性关键字修饰，那么constructor关键字可以省略
class MyClass constructor(userName:String){
    private val userName = userName.toUpperCase()
    init {
        println(userName)
    }
}

fun main() {
    var myClass = MyClass("安栋")
}