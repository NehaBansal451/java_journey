package com.OOPS.abstraction;

public abstract class Parent_1 {
    //any class that contain one or more abstract methods that also be declared abstract

        abstract void career();
        abstract void partner();

        int age;
        final int VALUE;

        public Parent_1(int age) {
                this.age = age;
                VALUE = 32456789;
        }

        static void hello(){//we can write static function in abstract classes
                System.out.println("hey");
        }

        void normal() {//abstract classes can have normal function also
                System.out.println("this is a normal method");
        }
}
// cannot create object of abstract class and constructor