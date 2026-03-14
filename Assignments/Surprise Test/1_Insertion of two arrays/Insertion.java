import java.util.*;

class Insertion{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr1len = sc.nextInt();
        int arr2len = sc.nextInt();

        int arr1[] = new int[arr1len];
        int arr2[] = new int[arr2len];


        for(int i = 0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

          for(int j= 0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }

        ArrayList<Integer> al = new ArrayList();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int l = 0;l<arr2.length;l++){
            hm.put(arr2[l],hm.getOrDefault(arr2[l],0)+1);
        }
        ArrayList<Integer> res = findInsertion(arr1,arr2,al,hm);

        for(Integer i : res){

        System.out.print(i);
        
        }


    }

    static ArrayList<Integer> findInsertion(int arr1[],int arr2[],ArrayList<Integer> al,HashMap<Integer,Integer> hm){
                for(int i = 0;i<arr1.length;i++){
                    if(hm.containsKey(arr1[i]) && hm.get(arr1[i])>0 ){
                            al.add(arr1[i]);
                            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)-1);
                    }
                    }
                
                System.out.println(al.size());

                

        return al;
    }
}
