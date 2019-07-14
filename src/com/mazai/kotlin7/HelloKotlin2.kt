package com.mazai.kotlin7

//Kotlin严格区分可变集合与不可变集合
//要清楚的一点是：区分开可变集合的只读视图与实际上真正的不可变集合
fun main() {
    val stringList:MutableList<String> = mutableListOf("hello","world","hello world")
    val readOnlyView:List<String> = stringList

    println("可变集合$stringList")

    stringList.add("welcome")

    println("只读视图:$readOnlyView")

    println("------------------------")

    val strings:HashSet<String> = hashSetOf("a","b","c","c")

    println(strings.size)

    //只读类型是协变的，因为他只用于从集合中获取数据，而不会修改集合中的数据

    val s = listOf("a","b")
    val s2:List<Any> = s

    //快照

    //toList方法只是原集合中的元素，所以返回的集合就可以确保不会发生变化
    val items = mutableListOf("a","b","c")

    val items2 = items.toList()

    items.add("d")

    println(items)
    println(items2)

}