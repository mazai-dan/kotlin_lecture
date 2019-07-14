package com.mazai.kotlin2

/*
    密封类(sealed class)

    1.密封类表示一种受限的类层次结构,父类与子类的概念、
    2.密封类所属的值只能是受限的几种类型之一,不能成为其他类型,可以认为密封类是JAVA枚举类的一种扩展
    3.密封类可以有子类,密封类的子类可以创建N个实例
    4.要声明一个密封类只需要在class 前面加上sealed关键字
    5.Koltin1.1之前要求密封类必须定义在密封类的内部,Kotlin1.1之后要求在同一个Kotlin文件中就可以了
    6.密封类是一个抽象的类,因此不能被实例化,密封类本身可以包含一些抽象的成员
    7.密封类不允许提供非私有的构造方法,密封类的构造方法默认是私有的
 */

sealed class Calculator

class Add : Calculator()

class Subtract : Calculator()


class Multiply: Calculator()
fun calculator(a: Int, b: Int, cal: Calculator) =
    when (cal) {
        is Add -> a + b

        is Subtract -> a - b

        is Multiply -> a*b
    }

fun main() {
    println(calculator(1,2,Add()))
    println(calculator(1,2,Subtract()))
}