package com.array;

public class order_agnostic_binarySearch {
     //IF WE DO NOT KNOW WHERE IT IS IN ASCENDING ORDER OR IN DESCENDING ORDER
     public static void main(String[] args) {
           int[] arr = {-18,-12,0,5,6,7,8,9};
           int target = -12;
           int ans = orderAgnosticBs(arr,target);
           System.out.println(ans);
     }
     static int orderAgnosticBs(int[] num,int target){
         int low = 0;
         int high = num.length -1;

         //find whether array is sorted in ascending or descending
         boolean isAsc = num[low] < num[high];


         while (low <= high) {
             //int mid = (low + high) / 2; //might be possible that (start+ end) exceed int range
             int mid = low + (high - low) / 2;
             if (num[mid] == target) {
                 return mid;
             }
               if (isAsc){
                  if (num[mid] > target) {
                        high = mid -1;
                  }
                  else{
                     low =mid + 1;
                  }
               }else{
                   if (num[mid] < target) {
                       high = mid -1;
                   }
                   else{
                       low =mid + 1;
                   }

               }
         }
         return -1;
     }
}
