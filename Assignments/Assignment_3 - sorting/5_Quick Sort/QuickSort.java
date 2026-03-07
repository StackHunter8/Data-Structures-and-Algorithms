// 5. Quick Sort Question (Dry run every input)
// Problem:
// Sort an array of integers using Quick Sort.
// Input 1:
// [75, 85, 55, 95, 65]
// Input 2:
// [42, 56, 12, 67, 34]
// Expected Output:
// For Input 1: [55, 65, 75, 85, 95]
// For Input 2: [12, 34, 42, 56, 67]

import java.util.*;

class QuickSort{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        for(int i = 0;i<arrlen;i++){
            arr[i]=sc.nextInt();

        }
        int low = 0;
        int high = arr.length-1;

        performQuickSort(arr,0,arr.length-1);

        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    static void performQuickSort(int arr[],int low,int high){
            if(low>=high){
                return;
            }

            int pivotIndex = findPivotIndex(arr,low,high);
            performQuickSort(arr,low,pivotIndex-1);
            performQuickSort(arr,pivotIndex+1,high);
    }

    static int findPivotIndex(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
      
      while(i<j){

        while(arr[i]<=pivot && i <= high-1){
            i++;
        }
        while(arr[j]>pivot && j >= low+1){
            j--;
        }

        if(i<j){
            swap(arr,i,j);
        }
      }

      swap(arr,low,j);
      return j;
    }

    static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]=temp;

    }
}