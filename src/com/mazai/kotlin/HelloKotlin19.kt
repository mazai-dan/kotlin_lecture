package com.mazai.kotlin

//object declaration 对象声明

object MyObject {
    fun method() {
        println("method")
    }
}

fun main() {
    MyObject.method()
    println("--------------")
    //MyTest.MyObject.method()
    println("-------------")
    println(MyTest.a) //类似于静态方法，Kotlin中没有静态方法
    MyTest.method()
    println("---------------")
//    println(MyTest.javaClass)

    D.bar()
    D.foo()

    D.Companion.foo()
    D.Companion.bar()

}

//companion object 伴生对象
//在kotlin中，与java不同的是，类没有static方法
//在大多数情况下，Kotlin推荐的做法是使用包级别的函数来作为静态方法
//Kotlin 会将包级别的函数当作静态方法来看待

//如果不提供伴生对象的名字，那么编译器会提供一个默认的名字Companion

//注意：虽然伴生对象的成员看起来像Java中的静态成员，但在运行期，他们依旧是真是对象的实例成员
//在JVM上，可以讲伴生对象的成员真正成为类的静态方法与属性，这是通过@JVMSTatic注解来实现
//伴生对象在编译后会生成一个静态内部类
class MyTest {

    companion object MyObject {
        @JvmStatic
        var a: Int = 100

        @JvmStatic
        fun method() {
            println("method invoked!")
        }
    }
}

class D {
    companion object{
        @JvmStatic
        fun foo(){}
        fun bar(){}
    }
}
