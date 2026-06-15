package com.recursion;

public class basic2 {
    static void main(String[] args) {
        // n to 1
        fun(5);

        // 1 to n
        revfun(5);

        //sum of digit --> n =1342 --> s= 1+3+4+2
        //as function type is int , need to be return in int
         int ans = sumOfDigit(1342);
         System.out.println(ans);

         //reverse number
        revNum(1842);
        int ans1 =sum;
        System.out.println(ans1);

        //rev
        System.out.println(rev(121));

        //palindrome
        System.out.println(palin(121));

        //no of zeros
        System.out.println(zero(100201));

    }

    static void fun(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
        //fun(n--); led to infinite recursion as it is using same n again and again
        //fun(--n);  gives result same as n -1 because it update the value before using it
    }

    static void revfun(int n){
        if(n == 0){
            return ;
        }
        revfun(n-1);
        System.out.println(n);
    }

    static int sumOfDigit(int n){
        if( n == 0){
            return 0;
        }
       return sumOfDigit(n/10) + (n % 10);
    }

    static int sum = 0;
    static int  revNum(int n){
        if(n == 0){
            return 0;
        }
        int rem = n %10;
        sum = sum * 10 + rem;
        return revNum(n/10);
    }

    static int rev(int n) {
        //sometimes we might need some additional variables in the argument
        //in that case make another functtion
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }
    static int helper(int n ,int digits){
        if(n == 0){
           return n ;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits -1)) + helper(n/10 ,digits -1);
    }

    static boolean palin(int n){
        return (n == rev(n));
    }


    static int zero(int n){
        return helper1(n ,0);
    }
    static int helper1(int n , int c){
        if(n == 0){
            return c;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper1( n /10 , c+1);
        }
        return helper1(n/10,c);
    }
}
