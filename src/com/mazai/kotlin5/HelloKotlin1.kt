package com.mazai.kotlin5

//Function 是不位于任何一个类独立存在的执行体
//method 位于一个类中的执行体

//默认参数（default argument）
fun test(a: Int = 0, b: Int = 1) = println(a - b)

fun main() {
    test()
    test(2)
    test(b = 2) //显示指定参数名
    test(3, 2) //显示指定参数名
    println("--------------------")
    test2(b = 2)
    println("--------------------")
    test3(1, 2, ::test)

    println("--------------------")


    test3(2, 2, { a, b -> println(a - b) })
    test3(1, 2) { a, b -> println(a - b) }

    test3(2) { a, b ->
        println(a - b)
    }

    test3 { a, b ->
        println(a - b)
    }

    println("----------------------")
    test4(1,2,3,4) //position argument
    test4(a=1,b=2,c=3,d=4)
    println("----------------------")
    test4("a","b","c")

    println("----------------------")

    //可变参数可以借助于spread operator以剧名参数的形式传递
    test4( strings = *arrayOf("a","b","c"))

    /*
        在Kotlin中调用java方法时不能使用剧名参数的预防，因为Java的字节码并不会保留方法参数名信息
     */
}

/*
    对于重写的方法来说，子类拥有的重写方法会使用与父类相同的默认参数值
    在重写一个拥有默认参数值的方法时，方法签名中必须要将默认参数值省略掉
 */
/*
 如果一个默认参数位于其他五默认参数的前面，那么默认值只能通过在调用函数时使用具名参数的方式来使用。
 */
fun test2(a: Int = 1, b: Int) = println(a - b)


/*
    如果函数的最后一个参数是lambda表达式，而且在调用时是位于圆括号之外
    那么就可以不指定lambda表达式的具名参数名
 */
fun test3(a: Int = 1, b: Int = 2, compute: (x: Int, y: Int) -> Unit) {
    compute(a, b)
}

open class A {
    open fun method(a: Int, b: Int = 4) = a + b
}

class B : A() {
    override fun method(a: Int, b: Int): Int {
        return super.method(a, b)
    }
}

/*
   在调用函数时，如果同时使用了位置参数与剧名参数，那么所有的位置参数都必须要位于第一个具名参数之前

   比如：foo(1,x=2)是允许的； foo(x=1,2)是不允许的
 */

/*
    具名参数

    在调用函数时，函数参数可以是具名的
    当一个函数有大量参数或是一些参数拥有默认值时，这种调用方式是比较方便的
 */
fun test4(a:Int,b:Int = 2,c:Int = 3,d:Int) = println(a+b+c+d)

fun test4(vararg strings:String){
    println(strings.javaClass)
    strings.forEach { println(it) }
}