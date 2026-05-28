package com.basics_01;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input: ");
        int roll_no = input.nextInt();
        System.out.println("your roll no is :"+ roll_no);
        String name = input.next();
        System.out.println("your name is:" + name);


    }
}
