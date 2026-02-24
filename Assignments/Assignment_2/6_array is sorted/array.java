// 6. Check if an array is sorted (strictly increasing)
// Problem Statement:
// Given an array, check whether it is sorted in strictly increasing order using recursion.
// Examples
// • Example 1:
// Input: arr = [1, 2, 3, 4]
// Output: true
// • Example 2:
// Input: arr = [1, 2, 2, 3]
// Output: false

import java.util.*;

// check whether the array is strictly sorted (strictly increasing) or not i.e 1 2 3 4 is valid but 1 2 2 3 not valid.
class array{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlength= sc.nextInt();
        int arr[]  = new int[arrlength];
        int start = 0;
       
        for (int i = 0;i<arrlength;i++){
            arr[i]=sc.nextInt();
        }
        boolean result = isArraySortedStrictly(arr,start);
        System.out.println(result);
    }

    static boolean isArraySortedStrictly(int arr[],int start){
              if(start >= arr.length-1){
                
                return true;
              }

              if(arr[start]>= arr[start + 1]){

                return false;
              }
              return isArraySortedStrictly(arr,start+1);
    }
}