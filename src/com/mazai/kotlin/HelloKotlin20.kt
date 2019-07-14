package com.mazai.kotlin

//backing field,支撑字段（域）
//backing property,支撑属性
class ThePerson(name:String,address:String) {

    val age:Int get() = 20
    var address:String = address
        get() {
            println("get invoked")
            return field
        }
    set(value) {
        println("set invoked")
        field = value
    }

    var name = name
}

fun main() {
    val person = ThePerson("andong","zhenshen")
    println(person.age)
    println("-----------")
    println(person.address)

    println("------------")
    person.address = "beijing"

    println(person.address)


    println("-----------")
    println(person.name)
    person.name = "sanmao"

    println("----------")
    println(person.name)
}

