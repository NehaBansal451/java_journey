package com.array;

public class kadane_algo {
    //brute force with 2 loops => time complexity with (n^2)

    public static void main(String[] args) {
        // Kadane's Algorithm:
// Iterate through the entire array and keep adding elements to the current sum.
// If the current sum becomes negative, reset it to 0 (since it cannot contribute to a maximum subarray).
// Use a variable 'max' to keep track of the maximum sum found so far among all subarrays.
        int[] arr = {-2 , -3, 4, -1, -2, 1, 5, -3};
        int ans = kadane_algo(arr);
        System.out.println("Maximum sum is : " + ans);
    }

    static int kadane_algo(int[] num){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i = 0 ; i < num.length ; i++){
                sum +=num[i];

            if (sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0){
                sum = 0;
                start = i + 1; // next index will be new start
            }
        }
        System.out.println("Subarray: from index " + ansStart + " to " + ansEnd);
        return max;
    }

}
 // time complexity : n
//space complexity : 1