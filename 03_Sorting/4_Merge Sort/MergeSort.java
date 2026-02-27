import java.util.*;

class MergeSort{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr [] = new int[arrlen];
        for(int i = 0;i<arrlen;i++){
            arr[i]= sc.nextInt();
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

        int temp[]= new int[high-low +1];//it is done because the temp size gets vary based on the elemenst and the merge is supposed to get happened between the space of those elements only.
        int left = low;
        int right = mid+1;
        int index =0;

        while(left<=mid &&  right <=high){
            if(arr[left]<=arr[right]){
                temp[index] = arr[left];
                index++;
                left++;
            }else{
                temp[index] = arr[right];
                index++;
                right++;
            }
        }

        while(left<=mid){
            temp[index] = arr[left];
            index++;
            left++;
        }

        while(right<=high){
            temp[index]= arr[right];
            index++;
            right++;
        }
       
        for(int i = 0;i<temp.length;i++){
           arr[low + i] = temp[i];//it is done so that the values get places on the currect position in the original array
        //    for example we have sorted the portion of the og array from indices 2 to 6 abd now in temp array the index of these arrays become from 0 to the last limit so in order to put the elements to its corret position the arr[low+i] is done     that means the 0 in the temp gets placed to low that is 2 + i i.e 0 of the og array and the position becomes 2 + 0 = 2;
        }

       
    }
}