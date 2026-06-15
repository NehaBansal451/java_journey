package com.OOPS.packages_static_03;

public class usingHuman01 {
    public static void main(String[] args) {
        human_01 neha = new human_01(21,"neha",100000,false);
        human_01 harshita = new human_01(34,"harshita",150000,true);
        System.out.println(neha.name);
        System.out.println(human_01.population);

        //greeting(); only this will error as it is nonstatic which is used in static

        //to use non-static , we are explicitly creating it's object so that we can use it
        usingHuman01 obj = new usingHuman01();
        obj.greeting();

        // usingHuman01 funn = new usingHuman01();
        // funn.fun2();

    }

    void greeting(){
        System.out.println("Hello world");
    }

    //here  greeting is  safe ,as we know it is always called inside static in the end , because greeting is defined in non-static function called fun2 . so use fun2 in static  we have to refernce func2 object in that static
    void fun2(){
        greeting();
    }
}

//when a member is declared static , it can be accesed before any of the object of the class  is created ,without reference to that object

//static member can access only static data
//--> as static member is not dependent on object then how it can take function is dependent on object

// we can use static function in nonstatic member

//to use non-static  function in inside static , we have to regference their objects
//usingHuman01 obj = new usingHuman01();
//obj.greeting();

//