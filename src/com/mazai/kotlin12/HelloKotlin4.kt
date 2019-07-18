package com.mazai.kotlin12

import java.io.FileNotFoundException


/*
    在Kotlin中，不存在checked exception
 */
class MyClass3 {
    @Throws(FileNotFoundException::class)
    fun method(){
        println("method invoked")
        throw FileNotFoundException()
    }
}