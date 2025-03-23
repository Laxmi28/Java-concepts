package Collections.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {

    public static void main(String[] args) {
        

      List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

      //Terminal operations

      // 1. Collect

      System.out.println(list.stream().collect(Collectors.toSet()));

      //forEach
      list.stream().forEach(x->System.out.println(x));

      

      //reduce : combine all the elements in a sinlge result ( It returns an optional)

      System.out.println(list.stream().reduce((x,y)->x+y).get());
     
      //allMatch,anyMatch,NoneMatch -> returns a boolean value

      System.out.println(list.stream().anyMatch(x->x%2==0));
      System.out.println(list.stream().allMatch(x->x%2==0));
      System.out.println(list.stream().noneMatch(x->x<0));

      //findfirst , findany( It returns an optional)

      System.out.println(list.stream().filter(x->x%3==0).findAny().get());
      System.out.println(list.stream().filter(x->x%3==0).findFirst().get());

      // min & max
      System.out.println("Min & max operation");
      System.out.println(list.stream().min(Comparator.naturalOrder()).get());
      System.out.println(list.stream().max(Comparator.naturalOrder()).get());
      System.out.println(list.stream().max((s,x) -> x-s).get());


      // streams cannot be reused once a terminal operation has been performed on it

      Stream<Integer> str = list.stream().filter(x->x/2==0);
      
      System.out.println(str.collect(Collectors.toList()));

      //str.map(x->x*2).collect(Collectors.toList()); //exception at this line


      //anyMatch,allMatch,noneMatch,findAny,findFirst -> these are short circuit operations which means once the expected res
      //is found it does not moves ahead

      //stateful and stateless operations
      /*
       * stateful operations are those operation that will have information about the entire collection - sorted , distinct,count
       * stateless operations are those operation that does not have information about the entire collection - map , anyMacth,ect
       */

       // forEachOrdered

       System.out.println("For each with  parellel streams");

       list.parallelStream().forEach(x->System.out.println(x));

       System.out.println("forEachOrdered with  parellel streams");

       list.parallelStream().forEachOrdered(x->System.out.println(x));
      

    }

}
