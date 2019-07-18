package com.mazai.kotlin12;

import java.io.FileNotFoundException;

public class HelloJava4 {
    public static void main(String[] args) {
        MyClass3 myClass3 = new MyClass3();
        try {
            myClass3.method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
