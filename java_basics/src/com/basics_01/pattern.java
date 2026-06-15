package com.basics_01;

public class pattern {
     // 1:) outer loop => tell us about rows/lines
    //  2:) inner loop =>identify for each row :- no. of columns are there
     public static void main(String[] args) {
//         System.out.println("pattern1");
//         pattern1(4);
//         System.out.println("pattern2");
//         pattern2(4);
//         System.out.println("pattern3");
//         pattern3(4);
//         System.out.println("pattern4");
//         pattern4(5);
//         System.out.println("pattern5");
//         pattern5(8);
//         System.out.println("pattern6");
//         pattern6(5);
//           System.out.println("pattern7");
//           pattern7(5);
//          System.out.println("pattern8");
//           pattern8(4);
         System.out.println("pattern9");
         pattern9(4,0);
     }
//     static void pattern1(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1;j <=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     static void pattern2(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1;j <=n ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//    static void pattern3(int n){
//        for(int i = 1; i <= n; i++){
//            for(int j = 1;j <=n-i+1 ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern4(int n){
//        for(int i = 1; i <= n; i++){
//            for(int j = 1;j <=i ; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }

//    static void pattern5(int n){
//        for(int i = 1; i <= 2*n; i++){
//            int totalColsInRow = i > n ? 2*n-i : i;
//            for(int j = 1;j < totalColsInRow; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern6(int n){
//        for(int i = 1; i <= 2*n; i++){
//            int totalColsInRow = i > n ? 2*n-i : i;
//            int noOfSpaces = n- totalColsInRow;
//            for(int j = 0;j < noOfSpaces; j++){
//                System.out.print(" ");
//            }
//            for(int j = 0;j < totalColsInRow; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//   }

//        static void pattern7(int n){
//         for (int i =1 ; i <= n ; i++){
//             int noOfSpaces = n-i;
//             for(int j=1 ; j<=noOfSpaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i ; j >=1;j--){
//                 System.out.print(" "+ j);
//             }
//             for(int j=2; j <=i;j++){
//                 System.out.print(" "+j);
//             }
//             System.out.println();
//         }
//        }

//        static void pattern8(int n){
//         int original = n;
//          for(int i=0; i <=2*n  ; i++){
//              for(int j = 0 ; j <= 2*n ; j++){
//                  int num =Math.max(Math.max(i,j),Math.max(2*n-i,2*n-j)) -original  ;
//                  System.out.print(num + " ");
//              }
//              System.out.println();
//          }
//    }

     // using recursion
    static void pattern9(int r , int c){
         if(r == 0){
             return;
         }
         if( c < r){
             System.out.print("* ");
             pattern9(r,c+1);
         }
         else{
             System.out.println();
             pattern9(r-1,0);
         }

    }
}
