package com.mazai.kotlin12;
/*
    MyClass2(int x, String y)
    MyClass2(int x)
 */
public class HelloJava3 {

    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2(1);
        MyClass2 myClass2_1 = new MyClass2(1,"welcome");


        myClass2.myMethod(1,"hello",1);
        myClass2_1.myMethod(2,"hello",1);
    }
}
