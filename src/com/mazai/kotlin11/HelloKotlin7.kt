package com.mazai.kotlin11
/*
        在Kotlin中，我们可以将具名对象或是伴生对象中定义的函数注解为@JvmStatic,这样编译器既会在相应
        对象的类中生成静态方法，也会在对象自身中生成实例方法。
 */
class MyClass2{

    companion object{
        fun test(){
            println("test1")
        }

        @JvmStatic
        fun test2(){
            println("test2")
        }
    }
}