// 2. Bubble Sort Question (Dry run every input)
// Problem:
// Given an array, sort them in non-decreasing order using Bubble Sort.
// Input 1:
// [30, 25, 27, 35, 29]
// Input 2:
// [15, 10, 25, 40, 30]
// Expected Output:
// For Input 1: [25, 27, 29, 30, 35]
// For Input 2: [10, 15, 25, 30, 40]


import java.util.*;

class BubbleSort{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        for(int i = 0;i<arrlen;i++){

            arr[i]= sc.nextInt();

        }
        performBubbleSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    static void performBubbleSort(int arr[]){
        int totalswaps = 0;
        for(int i = arr.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[i]){
                    swap(arr,i,j);
                    totalswaps++;

                }

            }
            if(totalswaps == 0){
                System.out.println("No need of sorting coz no of swaps are "+totalswaps);
                break;
            }
        }
    }

    static void swap(int arr[],int a,int b){

        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]=temp;
    }
}