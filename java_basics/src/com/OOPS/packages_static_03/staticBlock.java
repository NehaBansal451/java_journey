package com.OOPS.packages_static_03;

//this is demo to show initialisation of static variables
public class staticBlock {
    static int a = 4;
    static int b;

    // This static block runs only once when the class is loaded into memory,
// before main() executes or before the first object is created.
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);
    }
}


//Static variables → Created when the class loads.
//Static block → Runs once when the class loads.
//main() → Starts after the static block finishes.
//Creating an object is not required for a static block to execute.