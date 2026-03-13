import java.util.*;

class FirstRepeatChar{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arrlen = sc .nextInt();
        int arr[] = new int[arrlen];
        for(int i = 0;i<arrlen;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int result = 0;
        System.out.print(findFirstReapeatingChar(arr,hm,result));

    }

    static int findFirstReapeatingChar(int arr[],HashMap<Integer,Integer> hm,int result){
        for(int i = 0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            
        }

         System.out.println(hm);

        for(int j = 0 ; j<arr.length;j++){
            if(hm.containsKey(arr[j]) && hm.get(arr[j]) == 1){
                result = arr[j];
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}