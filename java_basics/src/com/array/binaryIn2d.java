//package com.array;
//
//import java.util.Arrays;
//
//public class binaryIn2d {
////   search in sorted matrix which sorted in column and row wise
////    public static void main(String[] args) {
////        int[][] arr = {
////                {10,20,30,40},
////                {15,25,35,45},
////                {28,29,37,50}
////        };
////        int target = 37;
////        System.out.println(Arrays.toString(search(arr , target)));
////    }
////    static int[] search(int[][] num ,int target){
////        int r = 0;
////        int c = num[0].length-1;
////
////        while(r < num.length && c >=0){
////            if(num[r][c] == target){
////                return new int[]{r,c};
////            }
////            if(num[r][c] < target){
////                r++;
////            }
////            else{
////                c--;
////            }
////        }
////        return new int[]{-1,-1};
////    }


    // search in sorted matrix
    //case1: element == target
    // ans
    //case2: element > target
    // ignore rows after it
    //case3: element < target
    //ignore rows above it
//public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int target = 7;
//        System.out.println(Arrays.toString(search(arr , target)));
//    }
//    static int[] binarySearch(int[][] matrix, int row, int cstart, int cend, int target) {
//        while (cstart <= cend) {
//            int mid = cstart + (cend - cstart) / 2;
//
//            if (matrix[row][mid] == target) {
//                return new int[]{row, mid};
//            } else if (matrix[row][mid] > target) {
//                cend = mid - 1;
//            } else {
//                cstart = mid + 1;
//            }
//        }
//        return new int[]{-1, -1};
//    }
//}
//    class Solution {
//        public boolean searchMatrix(int[][] matrix, int target) {
//            int rows = matrix.length;
//            int cols = matrix[0].length;
//
//            if (rows == 1) {
//                return binarySearch(matrix, 0, 0, cols - 1, target);
//            }
//         if (cols == 1) {
//          for (int i = 0; i < rows; i++) {
//            if (matrix[i][0] == target) return true;
//             }
//            return false;
//              }
//
//            int rstart = 0;
//            int rend = rows - 1;
//            int cmid = cols / 2;
//
//            // reduce rows to 2
//            while (rstart < (rend - 1)) {
//                int mid = rstart + (rend - rstart) / 2;
//
//                if (matrix[mid][cmid] == target) {
//                    return true;
//                } else if (matrix[mid][cmid] < target) {
//                    rstart = mid;
//                } else {
//                    rend = mid;
//                }
//            }
//
//            // check middle column of 2 rows
//            if (matrix[rstart][cmid] == target) return true;
//            if (matrix[rstart + 1][cmid] == target) return true;
//
//            // search in 4 parts
//
//            // 1st quadrant
//            if (target <= matrix[rstart][cmid - 1]) {
//                return binarySearch(matrix, rstart, 0, cmid - 1, target);
//            }
//
//            // 2nd quadrant
//            if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][cols - 1]) {
//                return binarySearch(matrix, rstart, cmid + 1, cols - 1, target);
//            }
//
//            // 3rd quadrant
//            if (target <= matrix[rstart + 1][cmid - 1]) {
//                return binarySearch(matrix, rstart + 1, 0, cmid - 1, target);
//            }
//
//            // 4th quadrant
//            return binarySearch(matrix, rstart + 1, cmid + 1, cols - 1, target);
//        }
//
//        static boolean binarySearch(int[][] matrix, int row, int cstart, int cend, int target) {
//            while (cstart <= cend) {
//                int mid = cstart + (cend - cstart) / 2;
//
//                if (matrix[row][mid] == target) {
//                    return true;
//                } else if (matrix[row][mid] > target) {
//                    cend = mid - 1;
//                } else {
//                    cstart = mid + 1;
//                }
//            }
//            return false;
//        }
//    }