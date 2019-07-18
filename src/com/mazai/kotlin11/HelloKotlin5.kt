package com.mazai.kotlin11

/*
    JvmField注解对Kotlin中的属性进行标注时，表示他是一个实例字段(instance field),Kotlin编译器在处理的时候，将不会给这个字段生成getter和setter
 */
class Person{
    var name:String = "zhangsan"

    @JvmField
    var age:Int = 10
}