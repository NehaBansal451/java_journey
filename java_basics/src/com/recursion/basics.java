package com.recursion;

public class basics {
    // the function, not finished execution , it will remain in stack
    //when a function finish its execution , it will remove from stack and flow of problem is restored to where function is called
    //variables:-->arguments , will define what will go in next function
//                -->return type ,-->make sure you are returning result if there is return type ;
//                -->body of function , specific to that function call
    public static void main(String[] args) {
          //print(1);
          System.out.println(fibonacci(7));
    }
       // print number from 1 to n
//        static void print(int n){
//        //base condition --. cond where our recursion stop making new call ,just return
//        if(n > 5){
//            return;
//        }
//        System.out.println(n);
//        print(n + 1);
//    }

    // print fibonacci number
    static int fibonacci(int n){
       if(n < 2){
           return n;
       }
       return fibonacci(n-1) + fibonacci(n-2);
    }

    //binary search
   /* static int search(int[] arr ,int target,int s,int e){
   if(s > e){
     return -1;
   }
   int m = s + (e - s) / 2;
   if(arr[mid] == target){
      return m;
   }
   if(target < arr[m]){
   return search(arr,target,s,m-1)
   }
  else{
   return search(arr,target,m+1,e)
   }
   */
}
