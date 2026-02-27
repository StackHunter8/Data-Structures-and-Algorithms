//  7. Check if a number is prime
// Problem Statement:
// Given an integer N, check whether it is prime or not. A prime number is a number that is only
// divisible by 1 and itself and the total number of divisors is 2.
// Examples
// • Example 1:
// Input: N = 2
// Output: true
// • Example 2:
// Input: N = 10
// Output: false
 
 import java.util.*;

 class Prime{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 1;
        
       
        int dgCount = divisors(num,start);

        if(dgCount==2){
            System.out.println("It is a Prime Number");
        }else{
            System.out.println("It is not  a Prime");
        }
    }

    static int divisors(int num,int start ){
        if(start > num){
            return 0;
        }

        if(num % start ==  0){
           
           return 1 + divisors(num,start+1);
        }else{
            return divisors(num,start +1);
        }
        
    }
 }