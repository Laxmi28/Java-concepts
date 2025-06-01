package CollectionsframeworkRevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ListRev2 {

    public static void main(String[] args) {
        
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        list.add(12);
        list.add(13);
        list.add(null);

        synchronized(list){

            Iterator<Integer> it = list.iterator();
            while(it.hasNext()){
                Integer i = it.next();
                System.out.println(i);
                if(i == null){
                    it.remove();
                }

            }
        }

        CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<>();

        list2.add(12);
        list2.add(null);

        for (Integer i : list2){
            System.out.println(i);
                if(i == null){
                    list2.remove(null);
                }
        }

        List<List<Integer>> listOflist = Arrays.asList(Arrays.asList(1,2,4),Arrays.asList(1,2,3,5,6));
        System.out.println(listOflist.stream().flatMap(List::stream).collect(Collectors.toList()));

        List<String> list3 = new ArrayList<>();
        list3.add("Apple");
        list3.add("Mango");

        Object[] objArr = list3.toArray();

        String str1 = objArr[0].toString();
        System.out.println(str1);

        String[] objArr1 = list3.toArray(new String[0]);
        String str2 = objArr1[0];
        System.out.println(str2);



    }

}
