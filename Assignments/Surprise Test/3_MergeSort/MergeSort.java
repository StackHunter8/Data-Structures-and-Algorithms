import java.util.*;

class MergeSort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int start = 0;
        int end = arr.length-1;

        performMergeSort(arr,start,end);
        for(int l : arr){
            System.out.print(l);
        }

    }

    static void performMergeSort(int arr[],int start,int end){

        if(start>=end){
            return;
        }

        int mid = (start + end) / 2;

        performMergeSort(arr,start,mid);
        performMergeSort(arr,mid+1,end);
        merge(start,end,mid,arr);

    }

    static void merge(int start,int end, int mid,int arr[]){

        int temp[] = new int [(end- start) + 1];
        int left = start;
        int right = mid +1;
        int ind = 0;

        while(left <= mid && right<=end){
            
                if(arr[left]<arr[right]){
                    temp[ind] = arr[left];
                    left++;
                    ind++;

                }else{
                    temp[ind] = arr[right];
                    right++;
                    ind++;
                }
            


        }

        while(left<=mid){
            temp[ind]=arr[left];
            left++;
            ind++;

        }

        while(right<=end){
            temp[ind] = arr[right];
            right++;
            ind++;

        }

        for(int i =0;i<temp.length;i++){
            arr[start+i] = temp[i];
        }
    }
}