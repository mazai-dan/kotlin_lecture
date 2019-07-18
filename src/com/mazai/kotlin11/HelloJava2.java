package com.mazai.kotlin11;

public class HelloJava2 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        HelloKotlin.setStr("welcome");

        System.out.println(HelloKotlin.getStr());

        HelloKotlin.test();
        //我们无法通过new关键字来创建Kotlin给我们生成的以Kt结尾的类的实例
        //因为在生成的字节码中没有不带参数的构造方法

    }
}
