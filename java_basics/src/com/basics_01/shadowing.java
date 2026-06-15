package com.basics_01;

public class shadowing {
    static int x;//  as we want to use x in static function . thats  why we make it static.
                 //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x;
       // System.out.println(x);//scope will begin when value is initialised
        x = 40; // the class variable at line 4 is shadowed by this
        System.out.println(x);//40 ==> lower will overshadow the upper one
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
