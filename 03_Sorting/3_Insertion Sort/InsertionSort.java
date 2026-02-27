import java.util.*;

class InsertionSort{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];

        for(int i =0;i<arrlen;i++){
            arr[i] = sc.nextInt();

        }
         
         insertionSort(arr);
    }

    static void insertionSort(int arr[]){
        for(int i = 0;i<arr.length;i++){
           int  end = i;
            //here while loop is used because we dont know untill when we want to do the swaps bt the base conditionis end ==0;
            while(end > 0 && arr[end] < arr[end-1]){
                swap(arr,end,end-1);
                end--;
            }
        }

        for(int l : arr){
            System.out.print(l + " ");
        }
    }

    static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }
}