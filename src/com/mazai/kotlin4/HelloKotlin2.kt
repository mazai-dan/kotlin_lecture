package com.mazai.kotlin4

import kotlin.reflect.KProperty

//委托属性 (delegated property)
/*
    有4种情况在实际开发中比较有用:
        延迟属性(lazy propertied)：其值只有在首次访问时计算；
        可观测属性(observable properties):监听器会受到有关此属性变更的通知；
        非空属性
        map属性 把多个属性存在一个映射(map)中，而不是每个单独的字段中。
 */
class MyDelegated {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String =
        "$thisRef,your delegated property name is ${property.name}"

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) =
        println("$thisRef,new value is $value")
}

class MyPropertyClass {
    var str: String by MyDelegated()
}

fun main() {
    val myPropertyClass = MyPropertyClass()

    myPropertyClass.str = "hello world"
    println(myPropertyClass.str)
}