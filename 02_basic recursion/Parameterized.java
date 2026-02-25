import java.util.*;

class  Parameterized{

    public static void main(String [] args){
        int count = 0;
        f(count);
    }

    static void f(int count){

        if (count == 3){
            return;
        }
        System.out.println(count);
        f(count+1);
    }
}