// 2. Check if a number is Palindrome or Not
// Problem Statement: Given an integer N, return true if it is a palindrome else return false.
// A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are
// palindromes because they remain the same when their digits are reversed.
// Examples
//                 Example 1:
//                 Input :   N = 4554
              
//                 Output:    Palindrome Number
               
//                 Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
                                       
//                 Example 2:
//                 Input:N = 7789               
               
//                 Output: Not Palindrome
               
//                 Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome

import java.util.*;

class Palindrome{
        public static void main(String []args){
            Scanner sc = new Scanner (System.in);
            int num = sc.nextInt();
            int revNum = revNum(num);

            if(revNum == num){
                System.out.println(" The Number is Palindrome");
            }else{
                System.out.println("The Number is  not Pallindrome");
            }
        }

        static int revNum(int num){
                int revnum = 0;
                while(num!=0){
                 int remainder = num % 10;
                 revnum = revnum * 10 + remainder;
                 num = num /10;
                }
            return revnum;
        }
}