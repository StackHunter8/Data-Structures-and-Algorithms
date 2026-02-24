// 1. Print elements of an array (forward and backward)
// Problem Statement:
// Given an array, print all elements using recursion in both forward and reverse order.
// Examples
// • Example 1:
// Input: arr = [1, 2, 3, 4]
// Output (Forward): 1 2 3 4
// Output (Backward): 4 3 2 1


import java.util.*;

class forward{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arraylength = sc . nextInt();
        int arr [] = new int [arraylength];

        for (int i =0;i<arraylength;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
         printForwardArray(arr,start);

    }

    static void printForwardArray(int arr [],int start){

        if(start == arr.length){
            return;
        }
        System.out.print(arr[start]);

        printForwardArray(arr,start+1);

    }


}