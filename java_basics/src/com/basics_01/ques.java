package com.basics_01;
import java.util.Scanner;
public class ques {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();

        // LARGEST OF THREE NUMBER
//        if (a > b && a > c) {
//            System.out.println("Largest number is a");
//        } else if (b > c) {
//            System.out.println("Largest number is b");
//        } else {
//            System.out.println("Largest number is c");
//        }


                      /* MAX KA CONCEPT */
//        int max = Math.max(c, Math.max(a,b));
//        System.out.println("Largest number is "+max);



                       /* CHAR KA CHOTI SI INFO*/
//        char ch = in.next().trim().charAt(0);// trim removes extra space from aage and piche . whereas char(0) provide us first character from the string if write .
//        System.out.println(ch);

        //CHECK WHETHER IT IS LOWER CASE OR UPPER CASE
//        if(ch >= 'a'  && ch <= 'z'){
//            System.out.println("lower case");
//        }else{
//            System.out.println("upper case");
//        }


        //FIBONACCI NUMBERS
//        int n =7;
//        int a =0;
//        int b=1;
//        int sum=0;
//        System.out.println(a);
//        System.out.println(b);
//        for(int i = 0; i < n - 2; i++){
//            sum=a+b;
//            System.out.println(sum);
//            a=b;
//            b=sum;
//        }

        //COUNTING OCCURENCE
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int count = 0;
//        /* jab bhi humme individual digits ke sath deal karna hota hai toh => (first)approach is convert into string then do it;(second)approach:by taking remainder*/
//        while(n >0){
//            int rem =(n % 10);
//            if(rem == 5){
//                count++;}
//                n = n / 10;
//
//        }
//        System.out.println(count);


        //REVERSE NUMBER
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int num = 0;
//        while(n > 0) {
//            int rem = n % 10;
//            n = n / 10;
//            num = (num*10) + rem;
//        }
//        System.out.println(num);


        // SWITCH PROBLEM
//        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

              /* .equal check whether the value same or not */
//        if (fruit.equals("mango")){
//            System.out.println("KING OF FRUITS");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("SWEET RED FRUIT");
//        }

              /*Same ques with switch*/
//        switch (fruit){
//            case "Mango":
//                System.out.println("KING OF FRUITS");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "apple":
//                System.out.println("sweet red fruit");
//                break;
//            case "grapes":
//                System.out.println("small green fruit");
//            default:
//                System.out.println("invalid entry");
//        }

             // ARMSTRONG NUMBER 153=1^3 + 5^3 + 3^3
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = check(n);
        System.out.println(ans);
    }

     static boolean check(int n){
        int original = n;
        int sum =0;
        while (n>0){
           int  rem = n % 10;
            sum += rem*rem*rem;
            n=n/10;
        }
        return sum == original;
     }
}

