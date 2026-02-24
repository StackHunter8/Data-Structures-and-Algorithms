   
// 6. Check if a number is prime or not
// Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is
// only divisible by 1 and itself and the total number of divisors is 2.
// Examples
//                 Example 1:
//                 Input : N = 2
              
//                 Output: True
               
//                 Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
                                       
//                 Example 2:
//                 Input: N = 10               
               
//                 Output: False
               
//                 Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and
// 10.                           

import java.util.*;

class PrimeNum{

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        if(digitCount(num)>2){
            System.out.println("It is not a prime num");

        }else{
            System.out.println("It is a prime num");
        }

        
    }

    static int digitCount(int num){
        int digitCount = 0;
        for(int i =1 ; i<= Math.sqrt(num);i++){
            if(num % i==0){
                digitCount+=1;
                if(num/i !=1){
                    digitCount+=1;
                }
            }
        }
        return digitCount;
    }
} 