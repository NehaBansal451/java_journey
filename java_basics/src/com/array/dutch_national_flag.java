package com.array;

import java.util.Arrays;

public class dutch_national_flag {
    //timecomplexity : n
    //space complexity :1
    // 3 pointer
    // only 3 types of elements

    //[ 0s | 1s | UNKNOWN | 2s ]
    //   ↑     ↑      ↑      ↑
    //  low   mid    mid    high

    //Case 1: nums[mid] == 0
    //
    //👉 Put it on LEFT
    //👉 Swap with low
    //👉 low++ , mid++
    //
    //🔹 Case 2: nums[mid] == 1
    //
    //👉 Already correct (MIDDLE)
    //👉 Just mid++
    //
    //🔹 Case 3: nums[mid] == 2
    //
    //👉 Put it on RIGHT
    //👉 Swap with high
    //👉 high-- (don’t move mid) because The element that comes from the high side is UNKNOWN whether it is 1,2,0

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortcolor(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortcolor(int[] num){
        int low = 0;
        int high = num.length -1;
        int mid = 0;

         while(mid <= high){
             if(num[mid] == 0){
                 swap(num,low,mid);
                 low++;
                 mid++;
             }
             else if(num[mid] == 1){
                 mid++;
             }
             else{
                 swap(num,mid,high);
                 high --;
             }
         }
    }
    static void swap(int[] num,int first, int second){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }
}
