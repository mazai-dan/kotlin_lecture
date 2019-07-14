package com.mazai.kotlin4

//延迟属性(lazy properties)：指的是属性旨在第一次访问的时候次啊会计算，之后则会将之前的计算结果缓存起来以供后续使用。

/*
    1.SYNCHRONIZED :默认情况下，延迟属性的计算式同步的；值只会在一个线程中得到计算，所有线程都会使用相同的一个结果。
    2.PUBLICATION ：如果不需要初始化委托的同步，这样多个线程可以同时执行
    3.NONE ：如果初始化操作只会在一个线程中执行，这样会减少线程安全方面的开销
 */
val myLazyValue:Int by lazy {
    println("hello wrold")

    30
}

fun main() {
    println(myLazyValue)
}