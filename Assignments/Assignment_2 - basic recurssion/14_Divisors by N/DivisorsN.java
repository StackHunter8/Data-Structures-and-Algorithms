// 14. Print all numbers from 1 to N divisible by 3
// Problem Statement:
// Given an integer N, print all numbers from 1 to N that are divisible by 3 using recursion.
// Examples
// • Example 1:
// Input: N = 10
// Output: 3 6 9

import java.util.*;

class DivisorsN{

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int endNum = sc.nextInt();
        int divisor = sc.nextInt();
        printDivisors(endNum,divisor,1);
    }

    static void printDivisors(int endNum,int divisor,int start){

        if(start > endNum){
            return;
        }

        if(start % divisor == 0){
            System.out.print(start + " ");
        }

        printDivisors(endNum,divisor,start+1);
    }
}