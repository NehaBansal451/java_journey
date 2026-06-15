package com.OOPS.packages_static_03;

//this is demo to show initialisation of static variables
public class staticBlock {
    static int a = 4;
    static int b;

    //this will be run only once when the first object is create i.e when the class is loaded for first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);
    }
}


