package CollectionsframeworkRevision;

import java.util.HashMap;
import java.util.Hashtable;

public class MapRev1 {

   
   public static void main(String[] args) {

    HashMap<Integer , Integer> map = new HashMap<>();
            map.put(1,2);
            map.put(2,3);
            map.put(null, null);
            map.put(null,2);

    System.out.println(map);     
    
    map.put(9, 0);

    map.putIfAbsent(2, 7);

    System.out.println(map);

    System.out.println(map.getOrDefault(8,null));

    Hashtable<Integer,Integer> table = new Hashtable<>();

    table.put(7, 8);
    table.putIfAbsent(9, 9);

    System.out.println(table);

    
   }

}
