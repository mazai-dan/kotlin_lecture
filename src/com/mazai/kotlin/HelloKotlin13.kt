package com.mazai.kotlin

class Student(private val userName:String,private val age:Int,private var address:String){
     fun printInfo(){
         println("Student(userName='$userName', age=$age, address='$address')")
    }
}

/**
 * 如果构造方法拥有注解或是可见性修饰符
 * 那么constructor关键字就不能省略掉，并且他位于修饰符后面
 */
class Studeng2 private constructor(userName: String){

}

/**
 * 在jvm上面如果构造方法的参数都拥有默认值
 * 这种情况下 Kotlin编译器就会为这个类生成一个不带参数的构造方法
 * 这个不带参数的构造方法会使用这些参数的默认这 这样做的目的在于可以跟Spring框架更好的整合
 */
class Student3 (val userName: String = "andong"){

}


fun main() {
    val student = Student("安栋",18,"shenzhen")
    student.printInfo()

    var student3 = Student3()

    println(student3.userName)

    student3 = Student3("lisi")

    println(student3.userName)

}
