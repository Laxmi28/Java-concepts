package Collections.MapImplemetation;

import java.util.Hashtable;

public class HashTableDemp {

    public static void main(String[] args) {
        
        Hashtable<Integer , String> hashtable = new Hashtable<>();

        hashtable.put(1, "Tesr");
        hashtable.put(2,"tets2");
        long time1 = 0;
        long time2 = 0;

        /*
         * Unlike hashmap it cannot have null value for both key as well as value
         * it is a legacy class
         * it is synchronized
         * implements map
         */
        // hashtable.put(null,"value");
        // hashtable.put(4,null);

        System.out.println(hashtable);
        /*
         * for the below example u will get 2001 as the output
         * but if you try the same with hashmap then we will get unexpected output because
         * hashtable is synchronized but hashtable is not
         */
        Hashtable<Integer, Integer> map = new Hashtable<>();
        time1 = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i=0;i<=1000;i++){
               map.put(i,i);
            }
            
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1000 ; i<=2000; i++){
              map.put(i, i);
            }
           
        });

        time2 = System.currentTimeMillis();

        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();;
        }
        System.out.println("Total time taken for the 2 executions is " + (time2 - time1));
        System.out.println(map.size());
        

    }

}
