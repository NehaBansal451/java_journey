package com.OOPS.inheritance;

public class Main {
    static void main(String[] args) {

        Box box = new Box(3.2 ,7.8,9.0);
        System.out.println(box.l + " "+ box.h + " " + box.w);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,8);
        System.out.println(box3.h + " " + box3.weight);


        //there are many variables in both parent and child classes
        //you are given access to variables that are in the ref type i.e BOxWeight
        //hence you should have access to weight variables
        //this also means , that one you are trying to access should be initialised
        //but here , when the obj itself is of type parent class , how will you call the constructor of child class
        // this is why error
        //boxWeight box6 = new Box(2,3,4);
        //System.out.println(box6);

        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.w);




    }
}
