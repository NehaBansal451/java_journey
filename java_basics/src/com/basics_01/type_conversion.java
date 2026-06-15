package com.basics_01;
import java.util.Scanner;
public class type_conversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float num = input.nextInt();
        System.out.println(num);
        //destination should be greater than source .in other words we can say that rhs should be greater than lhs.


        //TYPECASTING: focus converting in smaller datatype
        int num1 = (int)(65.98f);
        System.out.println(num1);


        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); //257%256=1
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = (c*d)/e;
        System.out.println(f);//20 => as we know c and d are byte then there multiplication should also be in byte but because of d int datatype.


        //ASCII value
        int number ='a';
        System.out.println(number);//97

        //Rules for type promotion
        System.out.println(3*5686887.58768f);// datatype would be float


    }
}
