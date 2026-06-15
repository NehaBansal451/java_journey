package com.array;
import java.util.Arrays;
import java.util.Scanner;
public class multi_dimension_array {
    public static void main(String[] args) {
        //int[][] arr = new int[3][3];

        int[][] arr = {
                        {1,2,3}, //oth index
                        {2,3,4}, // 1st index
                        {3,4,5}  //2nd index
        };
       Scanner in = new Scanner(System.in);
       int[][] arr2D = new int[3][2];
        //System.out.println(arr.length);// no. of rows
       //System.out.println(arr[row].length);   no of columns
       for(int i = 0 ; i < arr.length ; i++){
           for(int j = 0; j < arr[i].length ; j++){
               arr[i][j] = in.nextInt();
           }
       }
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0; j < arr[i].length ; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        //output
//        for(int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
