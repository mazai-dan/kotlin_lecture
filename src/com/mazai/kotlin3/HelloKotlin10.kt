package com.mazai.kotlin3

enum class Season{
    SPRING,SUMMER,AUTUMN,WINTER
}

enum class Season2(val temperature:Int){
    SPRINT(10),SUMMER(20),AUTUMN(20),WINTER(-10)
}

//枚举中声明方法
enum class Season3{
    SPRINT{
        override fun getSeason() = SPRINT
    },
    SUMMER{
        override fun getSeason() = SUMMER
    },

    AUTUMN{
        override fun getSeason() = AUTUMN
    },
    WINTER{
        override fun getSeason() = WINTER
    };
    abstract fun getSeason():Season3
}

fun main() {
    val season = Season.values()

    season.forEach { println(it) }
    println("-------------------")
    println(Season.SPRING)
    println(Season.valueOf("SPRING"))
}