// 15. Find power of a number using recursion
// Problem Statement:
// Given two integers A and B, compute A raised to the power B (A^B) using recursion.
// Examples
// • Example 1:
// Input: A = 2, B = 4
// Output: 16
// Explanation: 2^4 = 2×2×2×2 = 16

import java.util.*;

class PowerNum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int start = 0;
        int result = 1;
        System.out.println(powerNum(num,pow,start,result));
    }

    static int powerNum(int num,int pow,int start,int result){
        if(start == pow){
            return result;
        }
        
        return powerNum(num,pow,start+1,result*num);
    }
}