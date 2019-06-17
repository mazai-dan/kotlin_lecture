package com.mazai.kotlin

class Person constructor(userName: String) {
    private var userName: String

    private var age: Int

    private var address: String

    init {
        println(userName)

        this.userName = userName
        this.age = 20
        this.address = "shenzhen"
    }

    constructor(userName: String, age: Int) : this(userName) {
        println("$userName,$age")

        this.userName = userName
        this.age = age
        this.address = "shenzhen"
    }

    constructor(userName: String, age: Int, address: String) : this(userName, age) {
        this.address = address
    }


    fun printInfo() {
        println("Person(userName='$userName', age=$age, address='$address')")
    }
}

fun main() {
    val person = Person("张三")
    val person2 = Person("李四",30)
    val person3 = Person("王五",40,"广州")

    person.printInfo()
    person2.printInfo()
    person3.printInfo()
}