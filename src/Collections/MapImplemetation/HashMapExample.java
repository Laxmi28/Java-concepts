package Collections.MapImplemetation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Laxmi");
        map.put(1, "Laxmi");
        map.put(1, "Laxmi");
        map.put(1, "Laxmi P");

        System.out.println(map);
        

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1, "hello");
        map1.put(2,"TEST");
        map1.put(89, "HEMA");

        System.out.println(map1);

        System.out.println(map1.get(2));

        for (int i : map1.keySet()){
            System.out.println(map1.get(i));
        }

       Set<Map.Entry<Integer,String>> entries = map1.entrySet();

       for (Map.Entry<Integer,String> entry : entries){
           System.out.println( entry.getValue().toLowerCase());
       }

       Set<Map.Entry<Integer , String>> test1 =map.entrySet();

       for( Map.Entry<Integer,String> entry : test1){
        System.out.println(entry.getKey() + entry.getValue().toUpperCase());
       }


        HashMap<Integer,Integer> mapt = new HashMap<>();
        mapt.put(1,1);
            mapt.put(2,1);

        System.out.println(mapt.clone());


        //longest substring characters length in the given string

        String g = "abcabcbb";

        int left = 0;
        int right = 0;
        int maxLen = 0 ;

        Map<Character,Integer> result = new HashMap<>();

        for ( right = 0 ; right < g.length() ; right ++){
            char r = g.charAt(right);

            if (result.containsKey(r)){
                left = Math.max(left,result.get(r)+1);
            }

            result.put(r,right);
            maxLen = Math.max(maxLen,right - left + 1 );
        }
 
      System.out.println(maxLen);
    }

    
    
    /*
     * 
     * 
     * key -> value -> bucket -> hash function
     * 
     * bascically bucket is a array list having a initial capacity of 16 and it will resize when it has reching to its 
     * load factor value that is default 0.75 so reaching point will be 16 * 0.75 = 12 (u can change both the value while 
     * declaring it)
     * 
     * hash function will return a fixed numerical value basicalyy a position whenere the key value should be stored in
     * inside the bucket , some times the hash function will return the same index value then the bucket will store the previous
     * as well as the recent key - value pair as a linked list it will aslo have a defult capacity of 8 and when the limit is
     * recahed it will resizes to BST tree
     * 
     * 
     * in resizing the time complexity will be O(n) as it has to hash again
     * and in normal cases it will be O(1) due to hashing
     * 
     * hashing value formal index = hashcode of key % arraysize(16 by default)
     * 
     * no insertion order is maintained
     * 
     * 
     * 
     * 
     * 
     * 
     */



    


}
