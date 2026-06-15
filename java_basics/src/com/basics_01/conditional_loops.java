//package com.basics_01;
//import java.util.Scanner;
//public class conditional_loops {
//    public static void main(String[] args){
//        int salary =356778;
//        if (salary > 10000){
//            salary = salary +2000;
//        }
//        else{
//            salary = salary +1000;
//        }
//        System.out.println(salary);
//    }
//}

//LOOPS
package com.basics_01;
import java.util.Scanner;
public class conditional_loops {
    public static void main(String[] args){

        // for loop

        //PRINT NUMBERS FROM 1 TO 5
        for(int num=1 ; num <= 5; num+=1){
            System.out.println(num);
        }

        // PRINT NUMBER FROM 1 TO N
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int num1 =1;num1<=n;num1++){
            System.out.println(num1);
        }


        // while loop

         int num3=1;
        while(num3<=8){
            System.out.println("BANSAL");
            num3 +=1;
        }


        // do while loop
        int num4 =1;
        do{
            System.out.println(num4);
        }while(num4 != 1);
    }
}