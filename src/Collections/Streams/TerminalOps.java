package Collections.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

      //anyMatch,allMatch,noneMatch,findAny,findFirst -> these are short circuit operations which means once the expected res
      //is found it does not moves ahead

      //stateful and stateless operations
      /*
       * stateful operations are those operation that will have information about the entire collection - sorted , distinct,count
       * stateless operations are those operation that does not have information about the entire collection - map , anyMacth,ect
       */
      

    }

}
