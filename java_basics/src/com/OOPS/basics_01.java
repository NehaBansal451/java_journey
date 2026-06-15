package com.OOPS;

public class basics_01 {
    public static void main(String[] args) {

        Student[] students = new Student[5];//No Student objects are created yet!
        //[ null, null, null, null, null ]


        //Student Neha; // stack memory
        //Neha = new Student(); // dynamically allocate memory and return reference to it
        //Neha.rno = 20;
        //Neha.name="neha bansal";


        Student Neha = new Student();//Two things happen:
        //=>Memory allocated in heap
        //=>Constructor runs automatically
        System.out.println(Neha.rno);
        Neha.greeting();
        Neha.changeName("chai lover");
        Neha.greeting();

        //parameterised contructor . now default constructor will not run
        Student Harshita = new Student(2,"harshita bansal" , 90);

        //
        Student random = new Student(Neha);
        System.out.println(random.name);

//      calling constructor from another constructor
////        Student random1 = new Student();
////        System.out.println(random1.name);
    }

}
// create class
class Student{
    int rno;
    String name;
    float marks;

    //constructor :)  is a special function that runs when we create an object and it allocate some variables
    Student(){
        //“this current object”
        this.rno =45;
        this.name = "neha bansal";
        this.marks = 56.78f;
    }

    Student(int rno , String name , float marks){
        //“this current object”
        this.rno =rno;
        this.name = name;
        this.marks = marks;
    }

    void greeting(){
        System.out.println("hello! , my name is "+ this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }

    Student(Student other){
        // here other will replaced by kunal and this will replaced by random
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

//    Student(){
//      // this is how we call a constructor from another constructor
//        //internally: new Student(13,"default person",100.0f);
//        this(13,"default person",100.0f);
//    }
}
