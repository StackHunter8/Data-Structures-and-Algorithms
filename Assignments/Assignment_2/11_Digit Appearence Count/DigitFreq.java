// 11. Count how many times a digit appears in a number
// Problem Statement:
// Given an integer N and a digit D, count how many times D appears in N using recursion.
// Examples
// • Example 1:
// Input: N = 717237, D = 7
// Output: 3

import java.util.*;

class DigitFreq{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key = sc.nextInt();
        int keyFreq = 0;

        System.out.println(digitfreq(num,key,keyFreq));


    }

    static int digitfreq(int num,int key,int keyFreq){
            if(num == 0){
                return keyFreq;
            }

            int remainder = num %10;
            if(remainder == key){
                return digitfreq(num/10,key,keyFreq+1);
            }

            return digitfreq(num/10,key,keyFreq);
    }
}