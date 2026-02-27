// 13. Find GCD (HCF) of two numbers using recursion
// Problem Statement:
// Given two integers A and B, find their greatest common divisor (GCD) using recursion.
// Examples
// • Example 1:
// Input: A = 24, B = 36
// Output: 12

import java.util.*;

class Gcd{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(findGcd(num1,num2));
    }

    static int findGcd(int num1,int num2){

        if (num1==0){
            return num2;
        }
        if (num2 == 0){
            return num1;
        }

        if(num1>num2){

            return findGcd(num1%num2,num2);
        }

        return findGcd(num1,num2%num1);
    }
}