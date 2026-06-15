//package com.sorting;
//
//import java.util.*;
//
//public class quesoncyclesort {


//           MISSING NUMBER FROM RANGE 0 TO N
////    public static void main(String[] args) {
////        int arr[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
////        int ans = FindElement(arr);
////        System.out.println(ans);
////    }
////    static int FindElement(int[] num){
////        sort(num);
////        for(int i = 0; i < num.length; i++){
////            if(num[i] != i ){
////                return i ;
////            }
////        }
////        return -1;
////    }
////    static void sort(int[] num){
////        int i = 0;
////        while ( i < num.length){
////            int correct = num[i];
////            if(num[i] < num.length && num[i] != num[correct]){
////                swap(num, i , correct);
////            }
////            else{
////                i++;
////            }
////        }
////    }
////    static void swap(int[] num , int first , int second){
////        int temp = num[first];
////        num[first] = num[second];
////        num[second] = temp;
////    }

//FIND ALL NUMBERS DISAPPEARED IN AN ARRAY
//public static void main(String[] args) {
//        int arr[] = {4,3,2,7,8,2,3,1};
//        List<Integer> ans1 = FindElement(arr);
//        System.out.println(ans1);
//    }
//    static List<Integer> FindElement(int[] num){
//        sort(num);
//        List<Integer> ans = new ArrayList<>();
//        for(int i = 0; i < num.length; i++){
//            if(num[i] != i + 1 ){
//                ans.add(i+1);
//            }
//        }
//        return ans;
//    }
//    static void sort(int[] num){
//        int i = 0;
//        while ( i < num.length){
//            int correct = num[i] - 1;
//            if( num[i] != num[correct]){
//                swap(num, i , correct);
//            }
//            else{
//                i++;
//            }
//        }
//    }
//    static void swap(int[] num , int first , int second){
//        int temp = num[first];
//        num[first] = num[second];
//        num[second] = temp;
//    }

//if range from 0 to n => every element will be at index = value;
//if range from 1 to n => every element will be at index = value -1;


