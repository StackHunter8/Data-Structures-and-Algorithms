import java.util.*;

class ReverseNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revNum = 0;
        int result = reverseNum(num,revNum);
        System.out.println(result);
    }

    static int reverseNum(int num,int revNum){
        if(num==0){
            return revNum;
        }

        int remainder =  num%10;
        revNum = revNum * 10 + remainder;
        

       return reverseNum(num/10,revNum);
    }
}