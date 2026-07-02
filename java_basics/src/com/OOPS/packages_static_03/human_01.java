package com.OOPS.packages_static_03;

public class human_01 {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;    //we use static when we know it will be same for all the object like population of world ,will be same same for neha as well as harshita
                               //A static variable belongs to the class, not to individual objects.
                               //There is only one copy of it in memory.
                               //Every object shares the same variable.

    public human_01(int age,String name, int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human_01.population += 1; // we use class name when using static
    }
}
 //when a member is declared static , it can be accesed before any of the object of the class  is created ,without reference to that object

//this keyword , cannot be used in static .as this keyword we used for object, which is nonstatic .then how will we defined nonstatic in static