package com.array;
import java.util.Arrays;
import java.util.Scanner;

//public class ques {
//    public static void main(String[] args) {
//        int[] arr = {2,3,0, 3, 4, 5, 98};
//        //reverse(arr);
//        System.out.println(Arrays.toString(arr));
////      System.out.println(SearchForMin_Max(arr));
//    }
//
//    //REVERSE WHOLE ARRAY
////    static void reverse(int[] arr) {
////        int start = 0;
////        int end = arr.length-1;
////        while (start < end) {
////            int temp = arr[start];
////            arr[start] = arr[end];
////            arr[end] = temp;
////            //swap(arr,start,end);
////            start++;
////            end--;
////
////        }
////    }
//
//    //FIND MAX AND MIN NUMBER
////    static int SearchForMin_Max(int[] nums){
////        int max = nums[0];
////        int min = nums[0];
////       for(int index = 0 ; index < nums.length; index++){
////           if(min > nums[index]){
////               min= nums[index];
////           }
////       }
////        return min;
////    }
//}

              //SEARCH IN 2D ARRAY
//public class ques{
////    public static void main(String[] args){
////        int[][]  arr = {
////                         {23,4,5},
////                         {18,34,56,78},
////                         {23,56,98,23,45}
////                       };
////        int target = 34;
////        int ans[] = search(arr,target);//format of return value{row,col}
////        System.out.println(Arrays.toString(ans));
////    }
////    static int[] search(int[][] nums, int target){
////        for(int row = 0; row < nums.length ; row++ ){
////            for (int col = 0 ; col < nums[row].length ;col++){
////                if (nums[row][col] == target){
////                    return new int[]{row,col};
////                }
////            }
////        }
////        return new int[]{-1,-1};
////    }
//}

             //HOW MANY NUMBER IN ARRAY HAVE EVEN NO. OF DIGITS
public class ques{
//    //APPROACH 1 =>
////    public static void main(String[] args){
////        Scanner in = new Scanner(System.in);
////        int[] arr = new int[5];
////        for(int i = 0; i < arr.length ; i++){
////            arr[i] = in.nextInt();
////        }
////        int totalevenNo =0;
////        for(int i = 0; i < arr.length ; i++){
////           if( secApproach(arr[i])){
////               totalevenNo++;
////           }
////        }
////        System.out.println(totalevenNo);
////    }
//    // finding total no of even digits number
////    static int digit(int nums){
////        if (nums == 0){
////            return 1;
////        }
////        int count = 0;
////        while(nums> 0){
////            count++;
////            nums /= 10;
////        }
////            return count;
////    }
//    //optimize approach to get no of digits:
//    /*Static int digits2(int num){
//         return (int)(math.log10(num))+1;
//         }*/
//
//    // checking whether a number is even digit or not
////    static boolean check(int  num){
////        int no_of_digits = digit(num);
////        if(no_of_digits % 2 == 0){
////            return true;
////        }
////        return false;
////    }
//
//    //2 APPROACH => USING STRING
////     static boolean secApproach(int no){
////        String str = Integer.toString(no);
////         int len = str.length();
////         if (len % 2 == 0){
////             return true;
////         }
////         return false;
////     }

//        FIND CEILING NUMBER => smallest element in array greater or equal to target
//                      /*INTIUTION ==> when loop breaks start = end +1 , then next big number would be (start) element */
////  public static void main(String[] args){
////    int[] arr = {2,3,5,9,14,16,18};
////    int target = 15 ;
////    int ans =ceilingNumber(arr ,target);
////    System.out.println(ans);
////  }
////  static int ceilingNumber(int[] num, int target){
////    int start = 0;
////    int n = num.length -1;
////    int end = n;
///         if(target > num[n]){
///             return -1;
///         }
////    while ( start <= end){
////        int mid = start + (end - start) / 2;
////        if(num[mid] == target){
////            return num[mid];
////        }
////        else if(num[mid] > target){
////            end = mid - 1;
////        }
////        else {
////            start = mid + 1;
////        }
////    }
////     return num[start];
////  }
//
//    // FLOOR OF NUMBER =>Greatest no. smaller or egual to target
//    /*just  (return end) to (return -1) in binary change */
////    public static void main(String[] args){
////    int[] arr = {2,3,5,9,14,16,18};
////    int target = 19;
////    int ans =floorNumber(arr ,target);
////    System.out.println(ans);
////  }
////  static int floorNumber(int[] num, int target){
////    int start = 0;
////    int n = num.length -1;
////    int end = n;
///     if(target > num[n]){
///             return -1;
///        }
////    while ( start <= end){
////        int mid = start + (end - start) / 2;
////        if(num[mid] == target){
////            return num[mid];
////        }
////        else if(num[mid] > target){
////            end = mid - 1;
////        }
////        else {
////            start = mid + 1;
////        }
////    }
////     return num[end];
////  }


//   // Smallest letter greater than Target => same as ceiling but in String
////   public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        String str = in.next();
////        char[] ch = str.toCharArray(); // NEW THING
////        char target = 'a';
////        char ans = ceilingString(ch , target);
////        System.out.println(ans);
////    }
////    static char ceilingString(char[] num,char target){
////        int start = 0;
////        int n = num.length -1;
////        int end = n;
////        if(target > num[n]){
////            return '\0';
////        }
////        while ( start <= end){
////            int mid = start + (end - start) / 2;
////            if(num[mid] == target){
////                return num[mid];
////            }
////            else if(num[mid] > target){
////                end = mid - 1;
////            }
////            else {
////                start = mid + 1;
////            }
////        }
////        return num[start];
////    }

    // find first and last position of element in sorted array
      /**/
//public static void main(String[] args) {
////    int[] arr ={ 5,7,7,7,7,8,8,10};
////    int target = 8;
////    int[] ans1 = new int[2];
////    ans1 = SearchRange( arr, target);
////    System.out.println(Arrays.toString(ans1));
////}
////static int[] SearchRange(int[] num,int target){
////   int[] ans ={-1,-1};
////   int start = search(num , target, true);
////   int end = search(num,target,false);
////   ans[0] = start;
////   ans[1] = end;
////   return ans;
////    }
////    // this function return the index of target
////    static int search(int[] num, int target,boolean firstStartIndex) {
////        int ans = -1;
////        int start = 0;
////        int end = num.length - 1;
////        while (start <= end) {
////            int mid = start + (end - start) / 2;
////            if (num[mid] == target) {
////                //potential ans is found
////                ans = mid;
////                if (firstStartIndex) {
////                    end = mid - 1;
////                } else {
////                    start = mid + 1;
////                }
////
////            } else if (num[mid] > target) {
////                end = mid - 1;
////            } else {
////                start = mid + 1;
////            }
////        }
////        return ans;
////    }
//}


                  // Rotated sorted array => sorted means : binary search
                                                        //  :  we will find the pivot : pivot means largest number in the array
                                                        //  : first, search in first half then in second half
              /* case 1 => when mid > mid + 1 then element is pivot
                case 2 =>  if mid < mid -1 then my ans = mid -1 ;
                case 3 => start element >= mid element  :=> in this case all elements from  mid , will be smaller than start , hence we will ignore all these elements since we are looking for peak ie largest element
                       => end = mid -1
                 case 4 => start < mid  :=>  start = mid+1    */

//public static void main(String[] args) {
////    int[] arr = {4, 5, 6, 7, 0, 1, 2};
////    int target = 7;
////    System.out.println(findPivot(arr));
////}
////static int search(int[] num, int target){
////    int pivot = findPivot(num);
////    // if we did not get pivot , it means the array is not rotated
////      if(pivot == -1){
////          // just do normal binary search
////          return binarySearch(num,target,0,num.length-1);
////      }
////      //case1:
////      if(num[pivot] == target){
////          return pivot;
////      }
////      // case2:
////    if(target >=  num[0]){
////        return binarySearch(num,target,0,pivot -1);
////    }
////    return binarySearch(num,target,pivot+1,num.length-1);
////
////}
////    static  int binarySearch(int[] num, int target, int low, int  high) {
////        while (low <= high) {
////            //int mid = (low + high) / 2; //might be possible that (start+ end) exceed int range
////            int mid = low + (high - low) / 2;
////            if (num[mid] == target) {
////                return mid;
////            } else if (num[mid] > target) {
////                high = mid -1;
////            }
////            else{
////                low =mid + 1;
////            }
////        }
////        return -1;
////    }
////    // this will not cover duplicate value
////static int findPivot(int[] arr){
////    int start =0;
////    int end = arr.length -1;
////    while(start <= end){
////        int mid = start = (end - start) / 2;
////        // 4 cases over here
////        if(mid < end && arr[mid] > arr[mid+1]){
////            return mid;
////        }
////        if(arr[mid] < arr[mid]-1){
////            return mid - 1;
////        }
////        if(arr[start] >= arr[mid]){
////            end = mid -1;
////        }
////        else{
////            start = mid + 1;
////        }
////    }
////    return -1;
////}
////
//////with duplicates
////static int findPivotwithduplicate(int[] arr){
////    int start =0;
////    int end = arr.length -1;
////    while(start <= end){
////        int mid = start = (end - start) / 2;
////        // 4 cases over here
////        if(mid < end && arr[mid] > arr[mid+1]){
////            return mid;
////        }
////        if( arr[mid] < arr[mid]-1) {
////            return mid - 1;
////        }
////        if(arr[mid] == arr[start] && arr[mid] ==arr[end]) {
////            //skip the duplicates
////            //note:what if these elements at start and end were the pivot?
////            //check if start is pivot
////            if (arr[start] > arr[start + 1]) {
////                return start;
////            }
////            start++;
////            if (arr[end] < arr[end - 1]) {
////                return end - 1;
////            }
////            end--;
////        }
////           //left side is sorted, so pivot should be in right
////            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
////                start = mid +1;
////            }
////            else{
////                end = mid -1;
////            }
////        }
////    return -1;
////}


// how many times the array is rotated
//public static void main(String[] args) {
////    int[] arr = {4, 5, 6, 7, 0, 1, 2};
////    System.out.print(countRotations(arr));
////}
////private static int countRotations(int[] arr){
//// int pivot = findPivotwithduplicate(arr);
//// return pivot + 1;
////}
////static int findPivotwithduplicate(int[] arr){
////    int start =0;
////    int end = arr.length -1;
////    while(start <= end){
////        int mid = start = (end - start) / 2;
////        // 4 cases over here
////        if(mid < end && arr[mid] > arr[mid+1]){
////            return mid;
////        }
////        if( arr[mid] < arr[mid]-1) {
////            return mid - 1;
////        }
////        if(arr[mid] == arr[start] && arr[mid] ==arr[end]) {
////            //skip the duplicates
////            //note:what if these elements at start and end were the pivot?
////            //check if start is pivot
////            if (arr[start] > arr[start + 1]) {
////                return start;
////            }
////            start++;
////            if (arr[end] < arr[end - 1]) {
////                return end - 1;
////            }
////            end--;
////        }
////           //left side is sorted, so pivot should be in right
////            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
////                start = mid +1;
////            }
////            else{
////                end = mid -1;
////            }
////        }
////    return -1;
////}


          //SPLIT ARRAY LARGEST SUM
public static void main(String[] args) {
    int[] arr = {7,2,5,10,8};
    int m =2;
    System.out.println(splitArray(arr,m));

}
static int splitArray(int[] nums,int m){
    int start =0;
    int end =0;
    for(int i =0 ; i < nums.length; i++){
        start = Math.max(start,nums[i]); //in the end of the loop this will contain the max item
        end += nums[i];
    }
    //binarysearch
    while(start < end){
        //try for middle as potenial ans
        int mid = start + (end - start)/2;
        //calculate how many pieces you can divide this in with this max sum
        int sum = 0;
        int pieces = 1;
        for(int num : nums){
            if(sum + num > mid){
                //we can't add this in this subarray , make new one
                // say you add this num in new subarray then sum= num
                sum = num;
                pieces++;
            }else{
               sum +=num;
            }
        }
        if (pieces > m){
            start = mid +1;
        }
        else {
            end = mid;
        }

    }
    return end; //here start == end
}
}


