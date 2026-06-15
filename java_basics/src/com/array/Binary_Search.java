package com.array;

public class Binary_Search {

    //BinarySearch is done on sorted array
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 11, 12, 14, 20, 36, 58};
        int target = 36;
        int n = arr.length -1;
        int ans =binarySearch(arr, target, arr[0],n);
        System.out.println("Target at index : " + (ans));
    }
    static  int binarySearch(int[] num, int target, int low, int  high) {
        while (low <= high) {
            //int mid = (low + high) / 2; //might be possible that (start+ end) exceed int range
            int mid = low + (high - low) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] > target) {
                high = mid -1;
            }
            else{
                low =mid + 1;
            }
        }
        return -1;
    }
}

