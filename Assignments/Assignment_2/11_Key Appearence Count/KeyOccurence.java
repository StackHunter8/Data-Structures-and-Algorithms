import java.util.*;

class KeyOccurence{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        for (int i = 0;i<arrlen;i++){
            arr[i]= sc.nextInt();
        }
        int key = sc.nextInt();
        int count = 0;
        int start =  0;

        System.out.println(findKeyOccurence(arr,key,count,start));
    }

    static int findKeyOccurence(int arr[],int key,int count,int start){

        if(start == arr.length){
            return count;
        }
        if(arr[start] == key){
            findKeyOccurence(arr,key,count+1,start+1);
        }
        

        return findKeyOccurence(arr,key,count,start+1);
    }
}