package com.OOPS.abstraction;

public class Daughter_2 extends Parent_1{
    @Override
    void career(){
        System.out.println("I am going to be a coder" );
    }
    @Override
    void partner(){
        System.out.println("I love spiderman");
    }
    public Daughter_2(int age) {
        super(age);
    }
}
