package com.mazai.kotlin10

fun main() {
    val list = ArrayList<String>();

    list.add("hello")
    list.add("world")
    list.add("hello world")

    for (item in list) {
        println(item)
    }

    println("------------------------")

    for (i in 0 until list.size){
        println(list[i])
    }
    println("-------------------")
    val person = Person()

    person.age = 20

    person.isMarried = false

    person.name = "zhangsan"

    println(person.name)
    println(person.age)
    println(person.isMarried)

    println("========================")

    /*
        platform type
        在Java中，所有引用都可能为null，然而在Kotlin中，对null是有着严格的检查与限制的，这就使得某个来自于Java的引用在Kotlin中变得不再适合
        基于这个原因，在Kotlin，将来自于Java的声明的类型沉稳给平台类型(Platform Type)

        对于平台类型来说，Kotlin的null检查就会得到一定的缓和，变得不再那么严格了。这样就使得空安全的语义要求变得与Java一致

        当我们调用平台类型的引用方法的时候，Kotlin就不会在编译期间施加空安全的检查，使得编译可以
        正常通过；但是在运行期间有可能抛出异常，因为平台类对引用值可能为null
     */

    val list2 = ArrayList<String>()

    list2.add("hello")

    val size = list.size
    val item = list2[0]


    println("-------------------")

    val s:String? = item//允许，总是可以的
    /*
       把一个可能为空的的平台类型的值赋给Kotlin中声明的不可空变量的时候，
     Kotlin编译器会默认生成一个assert，这会防止Kotlin的不可空变量持有null值；同样，这一点也适用于Kotlin方法参数传递
     总体来说，Kotlin会竭尽所能房主null的赋值蔓延到其他地方，而是在发生问题指出就立即通过assert来解决
     */

    val s2:String = item//允许，在运行期间可能会抛出异常


}