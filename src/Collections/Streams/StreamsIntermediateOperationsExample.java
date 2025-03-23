package Collections.Streams;

import java.rmi.server.ServerRef;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsIntermediateOperationsExample { 
    public static void main(String[] args) {

    //Creating streams from collections    
        
    List<Integer> list = Arrays.asList(1,2,3,4,5);
    System.out.println(list.stream().filter(x->x%2==0).count());

    Stream<Integer> st1 = list.stream();
    System.out.println(st1);

    //Creating streams from Array
    Integer[] arr = {1,2,34,4};
    Stream<Integer> strEx = Arrays.stream(arr);

    //using stream of
     Stream<String> st2 = Stream.of("a","b");

     //Infinite Stream
     System.out.println(Stream.generate(() -> 1).limit(10));
     System.out.println(Stream.iterate(1, x -> x+2));
    

     //Intermediate Operations
      // They are lazy and wont be executing until a terminal operation is called and its operation always returns a 
      // intermediate streams

      System.out.println("----Intermediate Operations begins-----");

      List<String> names = Arrays.asList("Jamie","Oliver","Cynthia","Akasha","Amerai","Akasha");

      // 1. filter

      System.out.println(names.stream().filter(x->x.startsWith("A")));
      System.out.println(names.stream().filter(x->x.startsWith("A")).count());

      // 2. map
    System.out.println(names.stream().map(String ::toLowerCase).collect(Collectors.toList()));

      // 3. sorted
      System.out.println(names.stream().sorted().collect(Collectors.toList()));

      // 4. distinct
      System.out.println(names.stream().filter(x->x.startsWith("A")).sorted().distinct().collect(Collectors.toList()));

      // 5. limit
      System.out.println(Stream.generate(() -> 1).limit(10).count());

      // 6. skip
      System.out.println(names.stream().filter(x->x.startsWith("A")).sorted().distinct().collect(Collectors.toList()));
    
    }

}
