package com.recursion;

import java.util.ArrayList;

public class interviewQues {

    //PhonePad
    //digit range --> [(digit - 1)*3 , digit*3 )
    public static void main(String[] args){
       pad("","12");
       //System.out.println(Pad("","12");

        //number of dice rolls with target sum
      //  4 -->[1,2,3,4,5,6]
      //  ans --> [4,22,112,31-----]-->taking some and rejecting some
        dice("",4);
    }



    static void pad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            pad(p+ch , up.substring(1));
        }
    }

    //arraylist
//    static ArrayList<String>  pad(String p , String up){
//        if(up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        int digit = up.charAt(0) - '0';
//
//        ArrayList<String> list = new ArrayList<>();
//        for(int i = (digit - 1) * 3; i < digit * 3; i++){
//            char ch = (char)('a' + i);
//            list.addAllpad(p+ch , up.substring(1));
//        }
//    return list;
//    }

 static void dice(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= 6 && i <= target; i++){ //loop will start from 1 , not from 0
            dice(p+i,target-i);
        }
 }
 //using arraylist
//    static ArrayList<String> diceArr(String p , int target){
//        if(target == 0){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        ArrayList<String> list = new ArrayList<>();
//        for(int i = 1; i <= 6 && i <= target; i++){ //loop will start from 1 , not from 0
//            list.addAll(diceArr(p+i,target-i));
//
//        }
//        return list;
//    }

}
