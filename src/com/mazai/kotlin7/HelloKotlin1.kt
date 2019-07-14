package com.mazai.kotlin7

//解构声明

data class MyResult(val result: String,val status: Int)


fun myMethod():MyResult{
    return MyResult("success",1)
}

fun myMethod2():Pair<String,Int>{
    return Pair("success",1)
}
fun main() {
    val (result,status) = myMethod()

    println(result)
    println(status)

    val (a,b) = myMethod2()
    println(a)
    println(b)

    println("------------------")

    var map = mapOf("a" to "aa","b" to "bb","c" to  "cc")

    for ((key,value) in map){
        println("key:$key,value:$value")
    }

    println("----------------")

    map.mapValues { entry->"${entry.value}hello" }.forEach {println(it)}

    println("-----------------")

    map.mapValues { (key,value) -> "$value world" }.forEach{ println(it)}

    println("-----------------")

    map.mapValues { (_,value)->"$value welcome" }.forEach{ println(it) }

    //Kotlin 允许我们为解构声明整体指定类型，也可以为每一个具体的component指定类型。
    map.mapValues { (_,value):Map.Entry<String,String>->"$value person" }.forEach{ println(it)}

    println("-----------------")
    map.mapValues { (_,value:String) -> "$value people" }.forEach{ println(it)}
}