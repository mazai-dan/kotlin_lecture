package com.mazai.kotlin

interface A{
    fun method(){
        println("A")
    }
}

open class B constructor(){
    open fun method(){
        println("B")
    }
}

class C:A,B(){
    override fun method() {
        super<B>.method()
        super<A>.method()
    }
}



fun main() {
    var c = C()
    c.method()
}
