// 3. Insertion Sort Question (Dry run every input)
// Problem:
// Given an array of names, sort them non-decreasing using Insertion Sort.
// Input 1:
// [18, 22, 20, 19, 21]
// Input 2:
// [34, 12, 56, 45, 23]
// Expected Output:
// For Input 1: [18, 19, 20, 21, 22]
// For Input 2: [12, 23, 34, 45, 56]


import java.util.*;

class InsertionSort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[]=new int[arrlen];
        for(int i =0;i<arrlen;i++){
            arr[i]= sc.nextInt();
        }

        performInsertionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void  performInsertionSort(int arr[]){
            for(int i = 0;i<arr.length;i++){
                int end = i;
               while(end > 0 && arr[end]< arr[end-1]){
                    swap(arr,end,end-1);
                    end --;
               } 
            }
    }

    static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}