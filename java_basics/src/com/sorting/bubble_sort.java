package com.sorting;

import java.util.Arrays;

public class bubble_sort {
    //with the first pass through the array , the largest element came to end
    // stable => order should be same when value is same
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]num){
        boolean Swapped ;
        //run the steps n-1 times
        for(int i = 0 ; i < num.length;i++){
            //for each step , max item will come at last respective index
            Swapped = false;
            for(int j = 1 ; j < num.length - i ; j++){
                //swap if the item is smaller than previous item
                if(num[j] < num[j-1]){
                    //swap
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                    Swapped = true;
                }
            }
            //if we did not swap a particular value of i , it means the array is sorted hence stop
            if(!Swapped){ // !false=true
                break;
            }
        }
    }
}


///          using recursion
//static void bubble_sort(int[]arr,int r ,int c){
//    if( r == 0){
//        return;
//    }
//    if( c < r){
//        if(arr[c] > arr[c+1]){
//            //swap
//            int temp = arr[c];
//            arr[c] = arr[c+1];
//            arr[c+1] = temp;
//        }
//        bubble_sort(arr,r,c+1);
//    }else{
//        bubble_sort(arr,r-1,0);
//    }
//
//}