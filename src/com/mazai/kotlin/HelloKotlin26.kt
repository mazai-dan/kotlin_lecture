package com.mazai.kotlin

/*
    1.扩展函数所定义的类实例叫做分发接收者（dispatch receiver）
    2.扩展函数所扩展的那个类的实例叫做扩展接收者(extension receiver)
    3.当以上两个名字出现冲突时，扩展接收者优先级最高
 */

//扩展接收者
class EE{
    fun method(){
        println("DD method")
    }
}


//分发接收者
class FF{
    fun method2(){

    }

    fun EE.Hello(){
        method()
        method2()
    }

    fun world(ee:EE){
        ee.Hello()
    }

    fun EE.outPut(){
        println(this.toString())
        println(this@FF.toString())
    }

    fun test(){
        var ee = EE()
        ee.outPut()
    }
}



fun main() {
  FF().test()
}