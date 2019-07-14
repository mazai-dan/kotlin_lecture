package com.mazai.kotlin4

import java.util.*

/*
    map委托
    将属性存储到map中

    一种常见的应用场景是将属性值存储到map当中。
    这种通常出现在JSON解析或是一些动态行为。
    在这种情况中，你可以将map实例作为委托，作为类中属性的委托

    map中的key名字要与类中的属性名字保持一致
 */

class Student(map: Map<String,Any?>){

    val name:String by map

    val address:String by map

    val age:Int by map

    val birthday:Date by map
}

class Student2(map: MutableMap<String,Any?>){
    var name:String by map
}

fun main() {
    val student = Student(mapOf(
        "name" to  "zhangsan",
        "address" to "beijing",
        "age" to 20,
        "birthday" to Date()
    ))

    println(student.name)
    println(student.address)
    println(student.age)
    println(student.birthday)


    println("-------------------")

    val map:MutableMap<String,Any?> = mutableMapOf("name" to "beijing")

    val student2 = Student2(map)
    println(map["name"])
    println(student2.name)
    println("--------------")
    student2.name = "shanghai"
    println(map["name"])
    println(student2.name)
}