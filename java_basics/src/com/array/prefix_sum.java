package com.array;
import java.util.*;

public class prefix_sum {
    public static void main(String[] args) {
        //Keep adding elements to get current prefix sum, and store all previous sums in a HashMap.
        //If (current_sum − k) exists in the map, then a subarray with sum k is found.
      int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
      int k = 3;
      System.out.println(subarraySum(arr , k));

    }
    static int subarraySum(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int prefixSum = 0;
        int count = 0;
        for( int num: nums){
            prefixSum += num;

            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
//map.getOrDefault(sum, 0)
//👉 If sum exists → return its count
//👉 If not → return 0

