package com.mazai.kotlin11

/*
    属性(properties)

    一个Kotlin属性会被编译为3部分Java元素

    1.一个getter方法
    2.一个setter方法
    3.一个私有的字段(field),其名字与Kotin的属性名一样

    如果Kotlin属性名以is开头，那么命名约定会发生一些变化
    1.getter方法名与属性名一样
    2.setter方法则是将is替换为set

    这种规则适用于任何类型，而不单单是Boolean类型。

 */

class Test{
    var isStudent:String = "yes"
}