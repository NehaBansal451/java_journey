package com.OOPS.abstraction;

public class Son_2 extends Parent_1{
    @Override
    void career(){
       System.out.println("I am going to be a doctor");
    }
    @Override
    void partner(){
        System.out.println("I love Ironman" );
    }

    public Son_2(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

}
