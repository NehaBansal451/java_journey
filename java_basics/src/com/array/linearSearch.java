package com.array;

import java.util.Scanner;

//public class linearSearch {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[7];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        int target = in.nextInt();
//        int index = linearSearch(arr, target);
//        System.out.println("Target at index : " + index);
//
//
//    }
//     //FOR SEARCHING IN ARRAY
//        static int linearSearch(int[] nums ,int target){
//             if(nums.length == 0){
//                    return -1;
//             }
//             for(int j = 0 ; j < nums.length; j++){
//                if(nums[j] == target){
//                   return j;
//                }
//             }
//             //this line will be execute if  none of the return statements above have executed
//            //hence the target not found
//            return -1;
//        }
//}



                  //SEARCH IN STRING
public class linearSearch{
    public static void main(String[] args){
          String name  = "Neha";
          char target = 'u';
          System.out.println(search(name,target));
    }
    static boolean search(String str,char target){
        if(str.length() == 0){  // in string , it(str.length() )is a function thats why we used brackets where as in arr of int we do not used brackets
             return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){ // this is how we get each index element in string
                return true;
            }
        }
        return false;
    }
}