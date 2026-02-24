// 2. Find the sum of digits of a number
// Problem Statement:
// Given an integer N, find the sum of its digits using recursion.
// Examples
// • Example 1:
// Input: N = 1234
// Output: 10
// Explanation: 1 + 2 + 3 + 4 = 10

import java.util.*;

class digitsum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

       int result = digitsum(num,sum);
       System.out.println(result);

    }

    static int digitsum(int num,int sum){
        if(num == 0){
            return sum;
        }

        int remainder = num %10;
       return digitsum(num/10,sum + remainder);

    }

}