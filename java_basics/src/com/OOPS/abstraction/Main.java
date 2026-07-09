package com.OOPS.abstraction;

public class Main {
// hiding unnecessary details and showing valuable info

    //abstract is a keyword in Java that helps you implement abstraction.
    //You can use it with:
    //
    //Abstract classes
    //Abstract methods


    //OOP Principle
    //      ↓
    // Abstraction
    //      ↓
    //Java provides tools to achieve it
    //      ↓
    //1. abstract classes
    //2. interfaces

    public static void main(String[] args) {
        Son_2 son = new Son_2(28);
        son.career();


        Daughter_2 daughter = new Daughter_2(30);
        daughter.career();

        //Parent mom = new Parent(); // cannot create object of abstract class

    }
}
