package com.mazai.kotlin10

/*
    数组(Array)
    Kolin中的数组是不变的（相对于协变与逆变来说的），这一点与Java存在明显的不同。

    这意味着，我们无法将一个Array<String> 赋给Array<Any>,这样就防止可能出现的运行期异常

    Kotlin提供了原生类型数组来避免自动装箱与拆箱带来的成本：IntArray、DoubleArray、CharArray....
 */

fun main() {
    val myArray = MyArray()

    val intArray = intArrayOf(1,2,3,5)

    myArray.myArrayMethod(intArray)

    println("-------")

    //当编译为JVM字节码的时候，编译器会优化对于数组的访问，使之不会产生额外的成本

    val array = arrayOf(1,2,3,4)

    array[0] = array[0] * 2 //并不会调用set或者是get方法

    for (i in array) {
        println(i)
    }

}

