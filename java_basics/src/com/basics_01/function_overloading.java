package com.basics_01;

public class function_overloading {
    public static void main(String[] args) {
         fun(67);
         fun("neha bansal");
        // fun();//errror because it can't decide
    }
    static void fun(int a){
         System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
//if parameter is of same type then number of parameter should be different
//aur parameter should be different