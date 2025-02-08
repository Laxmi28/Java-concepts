package Collections.MapImplemetation;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

        /*
         * It is based on compare and swap approach  need to study more about it
         */

        long time1;
        long time2;

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
