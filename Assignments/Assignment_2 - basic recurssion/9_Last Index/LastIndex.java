// 9. Find the last index of an element in an array
// Problem Statement:
// Given an array and a key, find the last occurrence (index) of the key using recursion.
// Examples
// • Example 1:
// Input: arr = [4, 2, 7, 7, 9], key = 7
// Output: 3


import java.util.*;

class LastIndex{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        for(int i = 0;i< arrlen;i++){
            arr[i] = sc.nextInt();

        }
        int key = sc.nextInt();
        int end = arrlen-1;

        System.out.println(findLastIndex(arr,key,end));
    }

    static int findLastIndex(int arr[],int key,int end){

        if (end == -1){
            return -1;
        }
        if(arr[end]== key){
            return end;
        }
        return findLastIndex(arr,key,end-1);
    }
}