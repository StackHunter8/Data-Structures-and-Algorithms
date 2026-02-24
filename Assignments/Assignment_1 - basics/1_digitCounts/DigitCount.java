// 1. Count digits in a number
// Problem Statement: Given an integer N, return the number of digits in N.
// Examples
//                 Example 1:
//                 Input:    N = 12345
              
//                 Output: 5
               
//                 Explanation: The number 12345 has 5 digits.
                                       
//                 Example 2:
//                 Input:    N = 7789               
               
//                 Output:      4
               
//                 Explanation: The number 7789 has 4 digits.

import java.util.*;

class DigitCount{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        while(number!=0){
                int remainder = number%10;
                count+=1;
                number=number/10;

        }
        System.out.println(count);
    }
}