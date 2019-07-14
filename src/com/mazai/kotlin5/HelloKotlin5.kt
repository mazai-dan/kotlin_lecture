package com.mazai.kotlin5

/*
     高阶函数(high-order function)与lambda

     Lambda表达式格式要求:

     1.一个lambda表达式总是被一对花括号所包围。
     2.其参数（如果有的话）位于->之前（参数类型时可以省略掉的）
     3.执行体位于->之后

     在Kotlin中，如果一个函数的最后一个参数时函数，那么可以将lambda作为实参传递进去，
     并且可以在调用时方法圆括号外去使用
 */
val multiply: (Int, Int) -> Int = { a, b -> a * b }
val add: (Int, Int) -> Int = { a, b -> a + b }
val subtract = { a: Int, b: Int -> a + b }
val myAction = { _: Unit -> println("hello wrold") }
val mayReturnNull: (Int, Int) -> Int? = { _, _ -> null }
val functionMayNull: ((Int,Int) -> Int)? = null