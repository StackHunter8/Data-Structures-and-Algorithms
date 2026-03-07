// 4. Merge Sort Question (Dry run every input)
// Problem:
// Sort a large array of random numbers efficiently using Merge Sort.
// Input 1:
// [50, 23, 9, 18, 61, 32]
// Input 2:
// [12, 45, 1, 23, 67, 90]
// Expected Output:
// For Input 1: [9, 18, 23, 32, 50, 61]
// For Input 2: [1, 12, 23, 45, 67, 90]

import java.util.*;

class MergeSort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[]=new int[arrlen];
        for(int i = 0;i<arrlen;i++){

            arr[i]=sc.nextInt();
        }
        int low = 0;
        int high = arr.length-1;
        if(arr.length>0){

        performMergeSort(arr,low,high);
        }

        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    static void performMergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;

        performMergeSort(arr,low,mid);
        performMergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }


    static void merge(int arr[],int low,int mid,int high){
        int temp[] = new int[high-low +1];
        int left = low;
        int right = mid+1;
        int ind = 0;
       
          while(left<= mid && right <= high){
            if(arr[left]<=arr[right] ){
                temp[ind]=arr[left];
                ind++;
                left++;
            }else{
                temp[ind]= arr[right];
                ind++;
                right++;
            }


          }

          while(left<= mid){

            temp[ind]= arr[left];
            ind++;
            left++;
          }

          while(right <= high){
            temp[ind] = arr[right];
            ind++;
            right++;
          }
        

        for(int l = 0;l<temp.length;l++){
            arr[low+l] = temp[l] ;
        }


    }
}