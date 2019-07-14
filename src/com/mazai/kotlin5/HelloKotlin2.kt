package com.mazai.kotlin5

fun myPrint(name:String):Unit{
    println(name)
    return Unit
}

//单表达式函数，函数的返回类型如果可以通过类型推断判断出来，那么返回类型可以省略掉
fun add(a:Int,b:Int) = a+b



/*
      显示返回类型

      拥有方法体的函数必须要显示指定返回类型,除非函数返回Unit，这时返回类型就可以省略掉。
      Kotlin并不会推断拥有方法体的函数的返回类型，因为这种函数可能拥有非常复杂的控制流程，
      返回类型对于阅读代码的人来说就不是那么明显了（有时，对于编译器来说亦如此）
 */

/*
    在一个方法中，只允许一个参数为vararg,通常作为最后一个参数，如果可变参数不是最后一个参数。那么其后
    的参数就需要具名参数的形式进行传递；如果其后的参数时函数类型，那么还可以通过在圆括号外传递lambda表达式
    来实现。
 */

fun <T> convert2List(vararg elements : T):List<T>{
    var res = ArrayList<T>();

    elements.forEach { res.add(it) }

    return  res
}

fun main() {
    println(convert2List("hello","world","hello wrold"))

    var elements = arrayOf("welcome","bye","test")

    println(convert2List("hello","world",*elements))
}

