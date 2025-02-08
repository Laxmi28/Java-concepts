package Collections.MapImplemetation;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        /*
         * 
         * It extends hash map  and internal bucket structure is doubly linked list
         * 
         *  same as hash map it is not thread safe
         */

        LinkedHashMap<String , Integer> map = new LinkedHashMap<>();

        map.put("Jamie", 90);
        map.put("John", 80);
        map.put("Jack", 78);

        System.out.println(map.get("hello"));
        System.out.println("getting the default value");
        System.out.println(map.getOrDefault("hello",45));
        System.out.println(map);
        System.out.println(map.putIfAbsent("Joy",45));
        System.out.println(map);

        System.out.println(map.get("Jamie"));
        System.out.println(map.get("John"));
        System.out.println(map);
        

        // here we  need to study LRU cache mechanism
        
    }

}
