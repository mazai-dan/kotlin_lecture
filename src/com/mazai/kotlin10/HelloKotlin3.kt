package com.mazai.kotlin10


fun main() {
   val myVarargs = MyVarargs()
    val stringArrays = arrayOf("hello","world","hello world")

    myVarargs.myMethod(*stringArrays) //spread operation *
}