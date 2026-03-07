// 1. Selection Sort Question (Dry run every input)
// Problem:
// Sort an array of integers in non-decreasing order using Selection Sort.
// Input 1:
// [18, 22, 20, 19, 21]
// Input 2:
// [34, 12, 56, 45, 23]
// Expected Output:
// For Input 1: [18, 19, 20, 21, 22]
// For Input 2: [12, 23, 34, 45, 56]


import java.util.*;

class SelectionSort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        for(int i = 0;i<arrlen;i++){
            arr[i]= sc.nextInt();
        }

        performSelectionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    static void performSelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if(arr[j]<arr[i]){

                    swap(arr,i,j);
                }
            }
        }
    }

    static void swap(int arr[],int a,int b){

        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]=temp;
    }
}