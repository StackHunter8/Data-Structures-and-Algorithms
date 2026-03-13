import java.util.*;

class FreqCountByFreqArr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];

        for(int i =0;i<arrlen;i++){
            arr[i] = sc.nextInt();
        }

        
        int max = findMax(arr,0);
        int freq[] = new int [max+1];
        int result[] = freqCount(arr,freq);

        for(int l = 0 ;l < freq.length;l++){

           if(freq[l] !=0){
            System.out.println( l + " : " + freq[l]);
           }
        }


    }

    static int findMax(int arr[],int max){
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max =  arr[i];
            }
        }
        return max;
    }

    static int[] freqCount(int arr[],int freq[]){
        for(int i =0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}