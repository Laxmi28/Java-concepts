package CollectionsframeworkRevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListRev {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        

        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());

        
         System.out.println( list.stream().filter(x->x%2==0).collect(Collectors.toList()));

         System.out.println(list);


           int[] arr2 = {1,2,3,4,5,6,5};

           List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

           System.out.println(list2.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

         int[] arr3 = {1,1,2,3,4,4,5,4,5,5,6,5};

         List<Integer> list4 = Arrays.stream(arr3).boxed().toList();


         Map<Object,Long> resMap =  list4.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));

    

         System.out.println(resMap.entrySet().stream().
         sorted((e1,e2)->Long.compare(e2.getValue(), e1.getValue())).
         map(x->x.getKey()).limit(2).collect(Collectors.toList()));

         int n = arr3.length / 3;

         System.out.println(n);

         List<Integer> list5 = Arrays.stream(arr3).boxed().collect(Collectors.toList());

         Map<Integer, Long> resMap2 = list5.stream().collect(Collectors.groupingBy(x->(Integer) x , Collectors.counting()));

         List<Integer> f = resMap2.entrySet().stream().filter(x->x.getValue() > n).map(x->x.getKey()).toList();

         System.out.println(f);

         int[] array0 = {1,2,3,5,6,7,7};

         List<Integer> lIntegers = Arrays.stream(array0).boxed().collect(Collectors.toList());

         Map<Integer, Long> resMap3 = lIntegers.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));

        //  Map<Long,List<Integer>> resMap6 = 
         
        //  resMap3.entrySet().collect(Collectors.groupingBy(x->x.getValue(),Collectors.mapping(x->x.getKey(), Collectors.toList())));
        //   resMap3.entrySet().collect(Collectors.groupingBy(
        // x -> x.getValue(),
        // Collectors.mapping(x -> x.getKey(), Collectors.toList())
    ));
    



 
    }

}
