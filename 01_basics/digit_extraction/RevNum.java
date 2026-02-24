import java.util.*;

class RevNum{

public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int revnum=0;
    
    while(num !=0){

        int remainder = num %10;
        revnum = revnum * 10 + remainder;
        num = num /10;
    }
    System.out.println(revnum);
    
    
}
}