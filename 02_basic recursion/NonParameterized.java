import java.util.*;

class NonParameterized{
    public static void main(String [] args){
        f();
    }
   static  int count = 0;

    static void f(){
        if(count == 3){
            return;
        }
        System.out.println(count);
        count ++;
        f();
    }
}