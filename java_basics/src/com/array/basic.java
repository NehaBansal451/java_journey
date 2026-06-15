package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        //Syntax
        //datatype[] variable_name = new datatype[size];
        //store 5 roll numbers;
        // int[] rnos = new int[5];
        //or directly
        //int[] rnos ={23,12,45,32,15}


        //ARRAY OF PRIMITIVE DATATYPE


//        int[] arr;//declaration of array.ros is getting defined in the stack
//        arr= new int[5];//initialization : actually here object is being created in the memory(heap)
                         //heap objects are not continuous

//        Scanner in = new Scanner(System.in);
//        //INPUT IN ARRAY
//        for(int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//        }
        //OUTPUT OF ARRAY
//        for(int i = 0; i < arr.length ; i++){
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr){
//            System.out.print(num + " "); // here num represents element of array
//        }

//        System.out.print(Arrays.toString(arr));


        Scanner in = new Scanner(System.in);
            //ARRAY OF NON-PRIMITIVE(OBJECTS)
        String[] str = new String[4];
        for(int i = 0; i < str.length;i++){
            str[i] = in.next();
        }
        System.out.print(Arrays.toString(str));

       }
}
