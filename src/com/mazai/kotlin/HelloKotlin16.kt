package com.mazai.kotlin

open class MyParent{
    open val name:String  = "parent"
}

class MyChild:MyParent(){
    override val name:String = "child"
}

class MyChild2(override val name:String):MyParent(){

}


/**
 * 1.val可以override val
 * 2.var可以override val
 * 3.val无法override var 因为不能让访问范围变小
 *
 * var 表示get和set
 * val 只表示get
 */

open class MyParent3(){
    open fun method(){
        println("parent3 method")
    }

    open val name:String get() = "parent"
}

class MyChild3 :MyParent3(){
    override fun method() {
        super.method()
        println("child method")
    }

    override val name:String get() = super.name + " and child"
}


fun main() {
    val  myChild = MyChild()

    println(myChild.name)

    println("----------")

    val mychild2 = MyChild2("dd")

    println(mychild2.name)

    println("-------------")

    val myChild3 = MyChild3()

    println(myChild3.name)

    myChild3.method()
}