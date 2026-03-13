import java.util.*;

class Hashing{
    //there are 2 ways to solve these hashing based problem 1.through frequency aarray and 2nd one through hashmap.

    //implementation of frequency array 

    public static void main(String [] args){
        int arr[] = {1,2,4,5,6,2,3,4};


        // Srep 1 - Find the max element  in the arr
        int max = 0;
        for(int i = 0;i<arr.length;i++){
                if(max<arr[i]){
                    max= arr[i];
                }
        }

        // Step 2 - Create freq array 
        int freq[] = new int[max+1];//this is done coz arr starts from 0 index.

        // Step 3 - store the frequencies 

        for(int j=0;j<arr.length;j++){
            freq[arr[j]]++;
        }

        for(int l = 0;l < freq.length;l++){
            System.out.println(l + " " + freq[l]);
        }



    }
}

// if max element is 10^9,10^15 segmentation fault error gets occured.



