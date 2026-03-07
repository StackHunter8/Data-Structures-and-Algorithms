import java.util.*;

class QuickSort{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int []arr = new int [arrlen];
        for(int i = 0;i <arrlen;i++){
            arr[i]=sc.nextInt();
        }
        int low = 0;
        int high = arrlen-1;
        quickSort(arr,0,arr.length-1);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void quickSort(int arr[],int low,int high){
            if(low>=high){
                return;
            }

            int pivotIndex= findPivotIndex(arr,low,high);

            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);

          
    }

    static int findPivotIndex(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){

            while(arr[i]<=pivot && i <= high-1){
                //high-1 is done coz below swapping is going to execcute and if this is not given might cause index out of bounds error.
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                //ithe swap karaich karan te pivot cchya left la sagle  small ani right la sagle graeater no havet so.
                swap(arr,i,j);
            }
        }
        // ithe acttually pivot che swapping honar for its correcct position.
        swap(arr,low,j);
        return j;
    }

    static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }
}