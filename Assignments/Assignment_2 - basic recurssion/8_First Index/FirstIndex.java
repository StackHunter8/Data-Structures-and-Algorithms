// 8. Find the first index of an element in an array
// Problem Statement:
// Given an array and a key, find the first occurrence (index) of the key using recursion.
// Examples
// • Example 1:
// Input: arr = [4, 2, 7, 7, 9], key = 7
// Output: 2


import java.util.*;

class FirstIndex{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();

        int arr[] = new int [arrlen];
        for (int i = 0;i<arrlen;i++){
            arr[i] = sc.nextInt();

        }
        int key = sc.nextInt();
        int start= 0;

        System.out.println(findFirstIndex(arr,start,key));
    }

    static int findFirstIndex(int arr[],int start,int key){

        if(start > arr.length-1){
            return -1;
        }

        if(arr[start] == key){
            return start;
        }

      

        return findFirstIndex(arr,start+1,key);
    }
}