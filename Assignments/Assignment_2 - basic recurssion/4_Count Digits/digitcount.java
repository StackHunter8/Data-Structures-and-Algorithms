// 4. Count number of digits in a number
// Problem Statement:
// Given an integer N, count how many digits it contains using recursion.
// Examples
// • Example 1:
// Input: N = 98765
// Output: 5

import java.util.*;

class digitcount{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int result = digitcount(num,count);
        System.out.println(result);
    }

    static int digitcount(int num,int count){
        if (num == 0){
            return count;
        }
        int remainder = num%10;
        return digitcount(num/10,count + 1);
    }
}