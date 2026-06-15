package com.sorting;

import java.util.Arrays;

import static com.sorting.cycle_sort.swap;

public class selection_Sort {
    //not stable
    // works well for small array
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] num){
        for(int i = 0; i < num.length; i++ ){
            //find max item in remaining array and swap with correct index
            int last = num.length - i -1;
            int maxIndex = getMaxIndex(num,0,last);
            swap(num,last,maxIndex);
        }
    }
    private static int getMaxIndex(int[] num, int start,int end){
        int max = start;
        for(int i = start ; i <= end; i++){
            if(num[max] < num[i]){
                max = i;
            }
        }
        return max;
    }
}

// using recursion
//static void selection_sort(int[]arr,int r ,int c int m){
//    if( r == 0){
//        return;
//    }
//    if( c < r){
//        if(arr[c] > arr[m]){
//            selection_sort(arr,r,c+1,c);
//        }
//        else{
//            selection_sort(arr,r,c+1,m);
//        }
//    }else{
//        int temp = arr[m];
//        arr[m] = arr[r-1];
//        arr[r-1] = temp;
//        selection_sort(arr,r-1,0,0);
//    }
//
//}