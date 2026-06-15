package com.sorting;
import java.util.*;
public class cycle_sort {
    //when given number from 1 to n =>use cyclic sort
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 1, 4};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void Sort(int[] num) {
        int i = 0;
        while (i < num.length) {
            int correct = num[i] - 1; // index
            if (num[i] != num[correct]) { //**
                swap(num, i, correct);
            } else {
                i++;
            }
        }
    }


    static void swap(int[] num, int first, int second) {
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;

    }
}
// time complexity : 2n-1
