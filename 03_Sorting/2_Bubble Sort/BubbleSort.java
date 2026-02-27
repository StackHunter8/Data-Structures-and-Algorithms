import java.util.*;

class BubbleSort{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[]= new int[arrlen];
        for(int i =0;i<arrlen;i++){
             arr[i]=sc.nextInt();
        }

        BubbleSort(arr);
    }

    static void BubbleSort(int arr[]){

        for(int i = arr.length-1;i>=0;i--){
            int totalswaps = 0;
            for(int j = 0;j <= i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    totalswaps ++;
                }
            }

            if(totalswaps == 0){
                break;
            }
            // This step is donne because if the array is already sorted in accending way then there is no need for the outer loop to get iterate multiple times.and we can easily come to know about this at one iteration of the inner loop.

          
        }
       
        

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}