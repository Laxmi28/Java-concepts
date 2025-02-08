package Collections.MapImplemetation;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExa { 

    public static void main(String[] args) {
        
       SortedMap<Integer , String> map = new TreeMap<>();
       /* 
        * It internally has a default sorting method that is compareTo on keys
        you can also use custom comaparator inside it
        */

        map.put(1, "Laxmi");
        map.put(2, "hello");
        map.put(89,"why");
        map.put(0, null);

        System.out.println(map);


        SortedMap<Integer , String> map2 = new TreeMap<>((a,b)->b-a);

        map2.put(1, "Laxmi");
        map2.put(2, "hello");
        map2.put(89,"why");
        map2.put(0, null);

        System.out.println(map2);
        System.out.println(map2.headMap(1));
        System.out.println(map2.tailMap(2));

        NavigableMap<String , String> test = new TreeMap<>();
        test.put("key1", "value1");
        test.put("key2", "value2");
        test.put("akey3", "value3");

        System.out.println(test);
        System.out.println(test.firstEntry());
        System.out.println(test.higherKey("key1"));



       
        



    }

}
