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