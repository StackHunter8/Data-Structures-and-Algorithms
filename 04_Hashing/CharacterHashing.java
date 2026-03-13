// Character Hashing 
// --here we store the asci values of the characters in the frequency array.and generate the frequency array of 26 size.
//while storing the values and increasing the frequency count we simply subsstract ascii value  from the current charcter ascii value so that the charchter gets its correct position.


import java.util.*;

class CharacterHashing{
    public static void main(String [] args){
         String demo = "parnika";

        int freq[] = new int[26];//if charcters are alphabets only
        // for string the strin can contain symbols too so the freq array becomes
        // int freq[] = new int [256];
        
        for(int i =0;i<demo.length();i++){
            freq[demo.charAt(i)-'a'] ++;
        }

        for(int j = 0;j<demo.length();j++){
            System.out.println(demo.charAt(j) + " " + freq[demo.charAt(j)-'a']);
        }
    }
}