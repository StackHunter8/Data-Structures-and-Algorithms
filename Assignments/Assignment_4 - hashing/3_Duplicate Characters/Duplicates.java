import java.util.*;

class Duplicates{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = 0;
        HashMap <Integer,Integer> hm = new HashMap<>();
        int ans = findDuplicates(arr,result,hm);

        if(ans > 1){
            System.out.println("Duplicate Found" + ans);
        }else{
            System.out.println("No Duplicates Found ");
        }
        

    }

    static int findDuplicates(int arr[],int result,HashMap<Integer,Integer> hm){
        for(int i = 0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for(Integer i : hm.keySet()){
            if(hm.containsKey(i) && hm.get(i)>1){
                result = i;
            }
        }
        return result;
    }


}