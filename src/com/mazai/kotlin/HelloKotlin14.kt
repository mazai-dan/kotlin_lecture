package com.mazai.kotlin

//在kotlin中，所有类默认情况下都是无法被继承的
//换句话说，在Kotlin中，所有类默认情况下都是final的

class Parent(name:String, age:Int){


}

class Child(name:String, age:Int) : Parent(name,age){

}