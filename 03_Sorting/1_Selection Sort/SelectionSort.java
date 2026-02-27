import java.util.*;

class SelectionSort{
    
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[]= new int[arrlen];
        for(int i =0;i<arrlen;i++){
             arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        
    }

    static void selectionSort(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }

    }
}
