// 3. Find GCD of two numbers
// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
// The Greatest Common Divisor of any two integers is the largest number that divides both integers.
// Examples
//                 Example 1:
//                 Input:N1 = 9, N2 = 12
               
               
//                 Output:3
//                 Explanation:Factors of 9: 1, 3 and 9
//                 Factors of 12: 1, 2, 3, 4, 6, 12
//                 Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.
// Example 2:
//                 Input:N1 = 20, N2 = 15
               
               
//                 Output: 5
//                 Explanation:Factors of 20: 1, 2, 4, 5
//                 Factors of 15: 1, 3, 5
//                 Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.

import java.util.*;

class Gcd{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();  
        System.out.println("The gcd is " + gcd(num1,num2) );
    }

    static int gcd(int n1,int n2){
        int gcdnum = 0;
        while(n1>0 && n2 >0){
            if (n1>n2){
                n1 = n1%n2;
            }else{
                n2 = n2%n1;
            }

            if (n1==0){
                gcdnum = n2;
            }else{
                gcdnum = n1;
            }
        }
        return gcdnum;
    }
}