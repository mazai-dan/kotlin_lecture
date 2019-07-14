package com.mazai.kotlin2

//star projection(星投影)

//Start<out T>:如果T的上界是TUpper,那么start<*>就相当于Star<out T>，这表示当T的类型未知时，你可以安全的从star<*>当中安全的读取TUpper类型的值

//Start<in T>：star<*>就相当于Star<in Nothing>,这表示你无法向其中写入任何值

//Star<T>，如果T的上界为TUpper，那么Star<*>就相当于读取时的Star<out TUpper>以及写入时的Star<in Nothing>

class Star<out T> {}

class Star2<in T> {
    fun setValue(t: T) {

    }
}

class Star3<T>(private val t: T) {
    fun setValue(t: T) {}

    fun getValue(): T {
        return t
    }
}

fun main() {
    val star: Star<Number> = Star<Int>()

    val star2: Star<*> = star

    val star3: Star2<Int> = Star2<Number>()

    val star4: Star2<*> = star3

    //star4.setValue(3)

    val star5: Star3<String> = Star3<String>("hello")

    val star6: Star3<*> = star5

    star6.getValue()
//    star6.setValue(1) compile error

    val list:MutableList<*> = mutableListOf("hello","world","hello world")

    println(list[0])
}