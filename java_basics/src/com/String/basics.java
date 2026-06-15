package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class  basics {
      public static void main(String[] args) {
          String name = "neha" ;//here  name comes in stack and neha will go in heap
          //String are immutable in java
          //comparison  of string
          //--> == checks if ref variable pointing to same object
          // --> .equals() , used when only need to check value

          // pointing to same reference variable in heap
          String a = "neha";
          String b = "neha";
          // we can check it using == comparison operator
          System.out.println(a == b); // if give true means pointing to same


          //in this two different neha willbe create in heap
          String name1 = new String("neha");
          String name2 = new String("neha");
          System.out.println(name1 == name2);
          System.out.println(name1.equals(name2));

          ///******************************************

          //printf --> format string , here %place holder --> till how much decimal
          float e = 453.6868f;
          System.out.printf("formatted number is %.2f ", e);
          System.out.printf("pie number is %.2f ", Math.PI);
          System.out.printf("hello my name is %s and i am %s ", "neha", "smart");
          //place holder
          //%c --> character
          //%d --> decimal number
          //%e --> expotential floating number
          //%f --> floating point number
          //%i --> integer
          //%o --> octal number
          //%s --> string
          //%u --> unsigned decimal
          //%x --> hexadecimal number
          //%t --> date/time
          //%n --> new line

          ///************************************************************
          // when we do math operation with character then it will convert it into ascii values
          System.out.println('a' + 'b');
          // when nwe do math operation with string , it do not convert in ascii value , it will just concate it
          System.out.println("a" + "b");
          System.out.println('a' + 3);
          System.out.println("a" + 'b');//if one of the them is string then ans will be string
          //here integer will be converted into Integer which will call toString()
          System.out.println("a" + 3);//a3
          System.out.println("neha" + new ArrayList<>()); //neha[]
          System.out.println("neha" + new Integer(56));//neha56

          //in java operator + is defined for primitives or any one of them is string
          // System.out.println(new ArrayList<>() + new Integer(56)); // atleast one of them must be string

          ///**********************************************************
          String series = "";
          for (int i = 0; i < 26; i++) {
              char ch = (char) ('a' + i);
              System.out.println(ch);
              series = series + ch;
          }
          System.out.println(series);

          ///****************************************************************************888
          //StringBuilder
          StringBuilder builder = new StringBuilder();
          for (int i = 0; i < 26; i++) {
              char ch = (char) ('a' + i);
              System.out.println(ch);
              builder.append(ch);
          }
          System.out.println(builder.toString());
          builder.deleteCharAt(0);
          System.out.println(builder.toString());
          builder.reverse();
          System.out.println(builder.toString());

          ///**************************************************
          //to convert it into char array
          System.out.println(Arrays.toString(name.toCharArray()));
          //split
          System.out.println(Arrays.toString(name.split("e")));

          //palindrome
          Scanner in = new Scanner(System.in);
          String str = in.next();
          str = str.toLowerCase();
          for(int i =0; i <= str.length()/2 ; i++){
              char start = str.charAt(i);
              char end = str.charAt(str.length() - i - 1);
              if(start == end){
                  start ++ ;
                  end--;
              }else{
                  System.out.println("false");
                  break;
              }
              System.out.println("true");
          }



      }
  }

