// 5. Find the maximum element in an array
// Problem Statement:
// Given an array of integers, find the maximum element using recursion.
// Examples
// • Example 1:
// Input: arr = [2, 5, 9, 1, 6]
// Output: 9



import java.util.*;

class maxelement{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr []= new int[arrlen];

        for (int i =0;i<arrlen;i++){
            arr[i]= sc.nextInt();

        }
        int max = -1;
        int start=0;
        int maxele = maxele(arr,max,start);
        System.out.println(maxele);
    }

    static int maxele(int arr[],int max,int start){

        if(start>=arr.length){
            return max;
        }

        
        return maxele(arr, Math.max(arr[start],max),start+1);
    }
}