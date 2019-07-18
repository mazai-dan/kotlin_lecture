package com.mazai.kotlin12

class MyClass2  @JvmOverloads constructor(x: Int,y:String = "hello"){
    fun myMethod(a:Int,b:String,c:Int = 2){
        println("a:$a,b:$b,c:$c")
    }
}

