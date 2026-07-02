package com.OOPS.packages_static_03;



public class inner_class {

     static class Test{
         String name;
         public Test(String name){
             this.name = name;
         }
    }
    public static void main(String[] args){
         Test a = new Test("neha");
         Test b = new Test("bansal");

         System.out.println(a.name);
        System.out.println(b.name);
    }

}


//Why is Test declared static?-->Test belongs to the class inner_class, not to an object of inner_class.
//Static inner class(Test) → Doesn't need an outer class object.
//Non-static inner class → Needs an outer class object.
//main() is just a method, not an object.
//name is non-static, so every object (a and b) has its own copy.