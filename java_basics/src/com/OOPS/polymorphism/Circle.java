package com.OOPS.polymorphism;

public class Circle extends Shape{

    //this will run when obj of circle is created
    //hence it is overriding the parent method

    @Override //this is called annotation
    void area(){
        System.out.println("area is  pie * r * r" );
    }
}
