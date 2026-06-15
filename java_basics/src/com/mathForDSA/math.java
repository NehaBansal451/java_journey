package com.mathForDSA;
import java.util.*;

public class math {
  public static void main(String[] args){

      System.out.println(isPrime(12));

      //sieve method --> to check prime number
      int n = 40;
      boolean[] primes = new boolean[n+1]; //initially all elements in boolean array is false
      sieve(n,primes);

      //newton rapshon method --> square root of n
      //sqrt(n) = (x + n/x)/2
      System.out.println(sqrt(n));

      //factor of number1 --> number which divide number1
      factors(n);

      // Properties of Modulo (%)
          // 1. Addition
             // (a + b) % m = ((a % m) + (b % m)) % m;
         // 2. Subtraction
            // (a - b) % m = ((a % m) - (b % m) + m) % m;
        // 3. Multiplication
           // (a * b) % m = ((a % m) * (b % m)) % m;
       // 4. Division (using modular inverse)
          //(a / b) % m = (a % m) * modInverse(b, m) % m;

      // HCF/GCD --> minimium positive value of equation ax+by where x and y are integers
      int a = 20;
      int b = 40;
      System.out.println(gcd(a,b));

      //lcm
      System.out.println(lcm(a,b));

  }


  //prime number
    static boolean isPrime(int n){
      if(n <= 1){
          return false;
      }
      int c = 2;
      while( c * c <= n){
          if( n % c == 0){
              return false;
          }
          c++;
      }
      return true;
    }

    //sieve method
    //false in array means number is prime
    static  void sieve(int n ,boolean[] primes){
      for(int i =2; i*i <= n; i++){
          if(!primes[i] ){
               for(int j = i*2 ; j <= n ; j+=i ){
                   primes[j] = true;
               }
          }
      }
      for(int i = 2 ;i <= n ; i++ ){
          if(!primes[i]){
              System.out.println(i + " ");
          }
      }


    }


    //newton rapshon method --> square root of n
    //sqrt(n) = (x + (n/x))/2
    //error = |root - x|
    //1.) assign x to n
    //2.) you will find your ans when error < 1
    //update value of x = root
    static double sqrt(double n){
      double x = n;
      double root;
      while(true){
           root = 0.5 * (x + (n /x));
        if(Math.abs(root -x) < 1 ){
            break;
        }
        x = root;
      }
      return root;
    }


    //factors of a number
    static void factors( int n) {
        ArrayList<Integer> list = new ArrayList<>(); // in list store like this 40, 20 ,10......
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                }
                System.out.print(i + " ");
                list.add(n / i);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }// we store n / i in seperate array to sort the ans
    // that's why now time and space complexity will become sqrt(n)

      //gcd /hcf
        static int gcd(int  a, int b){
            if(a == 0){
                return b;
            }
            return gcd( b % a , a);
        }

    // LCM (Least Common Multiple)
    // Smallest number that is divisible by both a and b
        static int lcm(int a ,int b){
           return a * b / gcd(a , b);
        }
}
