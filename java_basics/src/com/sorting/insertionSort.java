package com.sorting;

import java.util.Arrays;

import static com.sorting.cycle_sort.swap;

public class insertionSort {
    //for every index: put that index element at the correct index of lhs
    // stable
    // used for smaller values of nu => woks good for which array is partially sorted
    public static void main(String[] args) {
        int[] arr ={4,5,1,2,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] num){
        for(int i = 0; i < num.length -1 ; i++){
            for(int j =i+1 ; j > 0; j--){
                if(num[j] < num[j-1] ){
                    swap(num,j,j-1);
                }
                else{
                    break; // internal loop break
                }
            }
        }
    }

}
