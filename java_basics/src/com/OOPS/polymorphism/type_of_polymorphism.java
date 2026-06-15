package com.OOPS.polymorphism;

public class type_of_polymorphism {

    //compile time?static polymorphism --> achieved via method overloading --> same name but diff return type , ordering etc can be diff --> eg: multiple constructor


    //runtime/dynamic polymorphism --> acheived by method overridding -->
    //    parent obj = new child()
    //                        ^
    //                        |
    // hence which method will be called depends on child .this is called upcasting  ---> thats how overriding works

    // we can prevent overridding using word called final
    //final will always run at time of conflicting
    //early binding
    //final void area(){
    // System.out.println("i am in shapes");
    //}

}
