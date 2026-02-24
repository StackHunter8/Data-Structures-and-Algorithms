// 4. Check if a number is Armstrong Number or not
// Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the
// number of digits.
// Examples
//                 Example 1:
//                 Input:N = 153
              
//                 Output:True
               
//                 Explanation: 13+53+33 = 1 + 125 + 27 = 153
                                       
//                 Example 2:
//                 Input:N = 371               
               
//                 Output: True
               
//                 Explanation: 33+53+13 = 27 + 343 + 1 = 371


import java.util.*;

class ArmStrong{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ogNum = num;
        int count = totalDigits(num);
        int armstrongNum = armstrongnum(num,count);

        if(armstrongNum == ogNum){
            System.out.println("The number is a Armstrong number");

        }else{
            System.out.println("The number is not a Armstrong number");
        }

    }

    static int totalDigits(int num){
        int count = 0;
        while(num !=0){
        int remainder = num % 10;
        count +=1;
        num = num / 10;

        }
        return count;
    }

    static int armstrongnum (int num,int count){
        int sum = 0;
        while (num != 0){

        int remainder = num %10;
         sum = sum + (int)Math.pow(remainder,count);
         //typecasting is performed here ..Math.pow returns the answer in double data type and if not typecasted 
         // or catched in double datatype , it cn give possible loossy conversion error.
        num = num /10;
        }
        return sum;

    }
}