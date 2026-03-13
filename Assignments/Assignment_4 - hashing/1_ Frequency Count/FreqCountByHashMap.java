import java.util.*;

class FreqCountByHashMap{
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> hm = new HashMap<>();

        HashMap<Integer,Integer> result = freqCount(arr,hm);

        // System.out.println(result);

        // System.out.print("{");
        // for(Integer key : result.keySet()){
        //     System.out.print(key + " : " + result.get(key) + " , ");
        // }
        //  System.out.print("}");

        for(Map.Entry<Integer,Integer> entry : result.entrySet()){
            System.out.print(entry.getKey() + " : " + entry.getValue() + " ");
        }

    }

    static HashMap<Integer,Integer> freqCount(int arr[],HashMap<Integer,Integer> hm){
        for(int i =  0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        return hm;
    }
}