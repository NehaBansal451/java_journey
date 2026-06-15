package com.OOPS.packages_static_03;


//outside  can not be static , but inner one can be or can not be static
public class inner_class {
    // static class is defined in inner_class, hence it will not be dependent on inner_class object.
     //but it will be dependent on psvm object . thats why irrespective of static , it is giving different result
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
