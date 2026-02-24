// 10. Reverse a number using recursion
// Problem Statement:
// Given an integer N, reverse its digits using recursion.
// Examples
// • Example 1:
// Input: N = 1234
// Output: 4321

import java.util.*;

class ReverseNum{
     
      public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revNum = 0;

        System.out.println(reverseNum(num,revNum));

      }

      static int reverseNum(int num,int revNum){

        if(num == 0){
            return revNum;
        }
        
        int remainder = num % 10;
        
        return reverseNum(num /10,revNum*10+remainder);
       

      }
}