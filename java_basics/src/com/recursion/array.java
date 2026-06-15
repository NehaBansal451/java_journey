package com.recursion;
import java.util.*;
public class array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};
        //check sorted or not
        System.out.println(sort(arr , 0));
        // target element
        int target = 2;
        ArrayList<Integer> ans = findAllIndex(arr ,target, 0 , new ArrayList<>());
        System.out.println(ans);
    }

    static boolean sort(int[] num , int index){
        if(index == num.length - 1){
            return true;
        }
        return num[index] < num[index + 1] && sort(num,index +1);
    }


    static ArrayList<Integer>  findAllIndex(int[] num , int target , int index , ArrayList<Integer> list){
        if(index == num.length){
            return  list;
        }
        if(num[index] == target){
            list.add(index);
        }
        return  findAllIndex(num,target,index+1 , list);
    }
}
