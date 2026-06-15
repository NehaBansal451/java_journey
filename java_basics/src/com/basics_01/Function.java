package com.basics_01;
import java.util.Arrays;
import java.util.Scanner;
public class Function {
//    public static void main (String[] args){
//          sum();
//          int ans = sum1(); // AS this function is of int type , need to be store in int
//          System.out.print(ans);
//    }
//                 // WITHOUT RETURNING THE VALUE
//    //static because , a function of static class should be static
//    static  void sum(){
//        Scanner in = new Scanner(System.in);
//        int num1 , num2 , sum;
//        System.out.print("enter the first element :");
//        num1 = in.nextInt();
//        System.out.print("enter the second element :");
//        num2 = in.nextInt();
//        sum = num1 + num2;
//        System.out.print("sum is " + sum);
//    }
//
//                //WITH RETURN VALUE
//                static  int sum1(){
//                    Scanner in = new Scanner(System.in);
//                    int num1 , num2 , sum1;
//                    System.out.println("enter the first element :");
//                    num1 = in.nextInt();
//                    System.out.print("enter the second element :");
//                    num2 = in.nextInt();
//                    sum1 = num1 + num2;
//                    return sum1; // return khatam ; after this nothing will be execute
//                   // System.out.print("this line can never be executed");
//    }

              //PARAMETRIC FUNCTION
//    public static void main(String[] args) {
//        int ans = sum(20,30);
//        System.out.print(ans);
//    }
//
//    static int sum(int a, int b){
//        int sum = a + b;
//        return sum;
//    }


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter your name");
//        String naam = in.next();
//        String personalised = myGreet(naam);
//        System.out.print(personalised);
//    }
//    static String myGreet(String name) {
//       String message = "Hello " + name ;
//       return message;
//    }



      /*PASS BY VALUE ==>in java, we only have pass by value
            primitive datatype are just pass by value
          for obj and stuff ==> passing value of that reference*/


   /* FOR STRINGS ==> IN java we can not change string using pass by value because of security reasons
                ==> here in this example, naam is only valid in it's scope(changeName) so so its is not valid in other scope like(main)
                ==>here in this example, name is pointing towards "Neha Bansal" and naam also first point towards "Neha Bansal"
                but in changeName scope naam point towards "Harshita Bansal".as change valid in there scope .
                thats why name is not change . bs ab naam new onj ki taraf point karne laga hai.
                 (visualization:)name ==> "Neha Bansal"
                                 naam ==> "Neha Bansal"
                                 naam ==> "harshita bansal"
     AS WE CAN SEE ITS ONLY CHANGE THE NAAM , WHICH VALID TILL IT'S SCOPE.THAT'S WHY NO CHANGE IN NAME*/


//      public static void main (String[] args) {
//           String name = "Neha Bansal";
//           changeName(name);
//           System.out.println(name);
//      }
//      static void changeName(String naam){
//          naam = "Harshita Bansal";
//      }
//

      // FOR ARRAY(NON - PRIMITIVE DATATYPE) => here it is not pass by value. here it is pass by copy of the reference
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0]=99;
    }
}/* IN STRING WE ARE CREATING A NEW OBJECT BUT IN ARRAY MODIFICATION IS DONE ON SAME ARRAY*/



        /*MOST IMPORTANT CONCEPT: THAT SHOULD BE CLEAR IN MIND*/
             /*  public static void main(String[] args){
                 int a = 10;
                 int b = 20;
                 {
                     int a = 70; //already initialized outside the block,so we can reinitialized it
                     a = 100;  // we can reassign original ref variable to some other value, even outside the block
                               // as this block , we did not change variable , used the same old variable thats why we able to modify it
                     System.out.println(a);
                     int c = 99;
                 }
                System.out.println(a);//
                System.out.println(c); // can not use this outside the block
            }
           */

//SUMMARY ==> anything which outside the block , can be used it inside block , modified inside the block but can not be reinitialised
//        ==> anything which is inside the block , can be reinitialised outside the block but we can not use it outside the block(in the case of c)
