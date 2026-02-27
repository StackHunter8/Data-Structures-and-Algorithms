// 12. Check if a number is a palindrome
// Problem Statement:
// Given an integer N, check if it is a palindrome using recursion.
// Examples
// • Example 1:
// Input: N = 121
// Output: true
// • Example 2:
// Input: N = 123
// Output: false

import java.util.*;

class PalindromeNum{

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = 0;
        System.out.println(isPalindromeNumber(reverseNum(num,reverseNum),num));

    }


    static boolean isPalindromeNumber(int reverseNum,int num){
        if(reverseNum == num){
          return true;
        }
        return false;
    }
     
     static int reverseNum(int num,int reverseNum){

        if(num == 0){
            return reverseNum;
        }

        int remainder = num%10;
        return reverseNum(num/10,reverseNum*10+remainder);
     }

}