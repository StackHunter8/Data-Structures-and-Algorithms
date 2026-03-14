import java.util.*;


class ArrayOperations{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr [] = new int[arrlen];

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        applyOperations(arr);

        for(int i : arr){
            System.out.print(i);
        }

    }

    static void applyOperations(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){

                arr[i]= arr[i]*2;
                arr[i+1] =0;
            }
        }

        for(int l= 0;l<arr.length-1;l++){
            for(int j = l+1;j<arr.length;j++){
                if(arr[j]!=0 && arr[l]==0){
                    int temp = arr[j];
                    arr[j]=arr[l];
                    arr[l]=temp;
                    break;
                }
            }
        }
    }
}