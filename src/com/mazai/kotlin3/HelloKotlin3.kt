package com.mazai.kotlin3

/**
 * Kotlin访问外部类变量的方式 this@OuterClass.str
 * Java访问外部类变量的方式:OuterCLass.this.str
 */
class Person(val name:String,var age:Int){
    private val str:String = "Person 属性"
    private inner class PersonFeature(val height:Int,var weight: Int){
        private val str:String = "PersonFeature 属性"
        fun getPersonFeature(){

            val str:String = "局部变量"
            println("身高$height, 体重：$weight")
            this@Person.method()
            println("${this@Person.str}")
            println("${this.str}")
            println(str)
        }
    }

    private fun  method(){
        println("执行了Person的Method方法")
    }

    fun getPerson(){
        val personFeature = PersonFeature(120,180)
        personFeature.getPersonFeature()
    }
}

fun main() {
    val person = Person("andong",22)
    person.getPerson()
}