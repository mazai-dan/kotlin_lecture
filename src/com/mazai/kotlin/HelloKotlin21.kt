package com.mazai.kotlin

/**
 * 延迟初始化属性
 *
 * Kotlin要求非空类型的属性必须在构造方法中进行初始化
 * 有时，这种要求不太方便，比如可以通过依赖注入或是单元测试情况下进行属性的赋值
 *
 * 通过lateinit 关键字表示属性进行延迟初始化，需要满足以下3个条件：
 *
 * 1. lateinit只能在类体中声明的var属性上，不能用在primary constructor声明的属性上
 * 2. 属性不能拥有自定义的setter和getter方法
 * 3. 属性需要为非空，并且不能为原生数据类型
 */
class TheClass{
    lateinit var name:String

    fun init(){
        this.name="zhangsan"
    }

    fun print(){
        println(this.name)
    }
}

fun main() {
    val theClass = TheClass()
    theClass.init()
    theClass.print()
}