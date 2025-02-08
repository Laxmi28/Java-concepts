package Collections.listImplementation;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnwritelist {

    public static void main(String[] args) {
      // ArrayList<Integer> list = new ArrayList<>();

      // list.add(1);
      // list.add(2);
      // list.add(3);

      // for (int i : list){
      //   if (i == 2){
      //       list.add(6);
      //   }

      //   System.out.println(i);
      // }


      CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

      list.add(1);
      list.add(2);
      list.add(3);

      for (int i : list){
        if (i == 2){
            list.add(6);
        }

        System.out.println(i);
      }
      
      System.out.println(list);


      /* when we want to do more of fetching examples then we use copyonwritearray this will generate a another copy
       * in case if we are writing on it but the fetching remains unchanged
       * it will help us to avoid the problem of concurrent method exception
       */
    }

}
