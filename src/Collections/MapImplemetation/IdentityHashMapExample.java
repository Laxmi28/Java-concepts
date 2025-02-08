package Collections.MapImplemetation;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {

    public static void main(String[] args) {
        
        String key1 = new String("key1");
        String key2 = new String("key1");

        IdentityHashMap<String , Integer> identityHashMap = new IdentityHashMap<>();

        identityHashMap.put(key1,45);
        identityHashMap.put(key2,67);

        System.out.println(identityHashMap);

        /* here this is happening because identity has map used by default object class hashcode and uses == instead of .equals
         * where as If I use the same with the help of hash map we will have only one output that is second one valu
          * as it uses string class hashcode and equals method with check by content not by memory
        */

        IdentityHashMap<String , Integer> identityHashMap2 = new IdentityHashMap<>();

        identityHashMap2.put("teste", 1);
        identityHashMap2.put("teste", 2);

        System.out.println(identityHashMap2);

    }

}
