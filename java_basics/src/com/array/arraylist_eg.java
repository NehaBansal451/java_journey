package com.array;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_eg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(2344);
//        list.add(5658);
//        list.add(2344);
//        list.add(5658);
//        list.add(2344);
//        list.add(5658);
//        System.out.println(list.contains(76786976));//to check weather a number present in a list or not
//        list.set(0,99); // to update index 0 , to number 99
//        list.remove(2);
//        System.out.println(list);

        Scanner in = new Scanner(System.in);
        // input
        for(int i =0;i < 5;i++){
            list.add(in.nextInt());
        }
        //for getting a value of any index
        for(int i =0;i < 5;i++){
            list.add(list.get(i));
        }
        // for output list
            System.out.println(list);

    }
}
