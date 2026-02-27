// 3. Find the product of digits of a number
// Problem Statement:
// Given an integer N, find the product of its digits using recursion.
// Examples
// • Example 1:
// Input: N = 231
// Output: 6
// Explanation: 2 × 3 × 1 = 6



import java.util.*;

class product{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prod = 1;
        int product = findProduct(num,prod);
        System.out.println(product);

    }

    static int findProduct(int num,int prod){

        if (num == 0){
            return prod;

        }

       int remainder = num%10;
        return findProduct(num/10,prod*remainder);
    }
}