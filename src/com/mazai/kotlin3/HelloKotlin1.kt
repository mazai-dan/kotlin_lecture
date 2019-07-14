package com.mazai.kotlin3

//嵌套类 (Nested Class)
//嵌套类不能访问外部类的其他成员，只能访问另一个嵌套类
class OuterClass{

    private val str:String = "hello world"

    class NestedClass{
        fun nestedMethod() = "welcome"
    }

    class NestedClass2{
        val nestedClass = NestedClass()
    }
}

fun main() {
//    OuterClass.NestedClass
}