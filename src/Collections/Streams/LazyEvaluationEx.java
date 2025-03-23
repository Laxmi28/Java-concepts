package Collections.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationEx {

    public static void main(String[] args) {
        

        List<String> names = Arrays.asList("Alice","Charlie","Bob");

        Stream<String> stream1 = names.stream().filter(name -> {
              System.out.println("Filtering : "+ name);
              return name.length() > 3 ;
        });

        System.out.println("Stream before terminal operations");
        List<String> list = stream1.collect(Collectors.toList());
        System.out.println("After terminal operations");
        System.out.println(list);



    }

}
