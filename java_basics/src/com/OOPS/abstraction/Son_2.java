package com.OOPS.abstraction;

public class Son_2 extends Parent_1{
    @Override
    void career(String name){
       System.out.println("I am going to be a " + name);
    }
    @Override
    void partner(String name , int age){
        System.out.println("I love " + name + "she is "+ age);
    }

}
