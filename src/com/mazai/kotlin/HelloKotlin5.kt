package com.mazai.kotlin

fun main() {
    println(convert2Uppercase(111))
    println(convert2Uppercase("aaa"))
}


fun convert2Uppercase(str:Any):String ?{
   return when (str) {
       is String -> str.toUpperCase()
       else -> null
   }
}

