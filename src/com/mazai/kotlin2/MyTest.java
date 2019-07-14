package com.mazai.kotlin2;

import java.util.ArrayList;
import java.util.List;

//PECS：Product Extends,Consumer Super
public class MyTest
{
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<Object> list2 = list;
//        list2.add(1);
//        String str = list2.get(0);
//
//        List<Cat> cats = new ArrayList<>();
//        List<? extends Animal> animals = new ArrayList<>();
//        animals = cats;


        List<Animal> animals = new ArrayList<>();
        List<? super Animal> contravariantAnimals = animals;

        contravariantAnimals.add(new Cat());

        System.out.println(contravariantAnimals.get(0));
//        List<Object> objects = contravariantAnimals;
////        System.out.println(contravariantAnimals.get(0));
//
//        contravariantAnimals.add(new Cat());
//        contravariantAnimals.add(new Dog());
//        contravariantAnimals.add(new Object());

//        Object[] objects = new String[]{"hello","world"};
//        System.out.println(objects[0].getClass());
//        objects[0] = new Object();
//
//        System.out.println(objects[0]);
    }
}

class Animal{}

class Cat extends Animal{}

class Dog extends Animal{}

