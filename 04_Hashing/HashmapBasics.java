import java.util.*;

class HashmapBasics{
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,5,3,2,1,55,7,8,4,5,3,2,7,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
        // data gets stored randomly

        for(int i =0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);//Tc O(1) for best n avg case and for worst case tc O(n) worst case takes place due to internal collisions and this condition is very very rare

        }//total  tc n

        //for retriving the data from hashset
        // for(Integer key :hm.keySet()){
        //     System.out.println(key + " " + hm.get(key));
        // }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue() );//Tc O(1)
        }
    }

}

// alternative for hashmap in c++ is ordered map whose tc is nlogn for all the three cases