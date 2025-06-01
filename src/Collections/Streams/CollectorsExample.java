package Collections.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {
        String var = "stress";

         Map<Character, Long>  test = var.chars().mapToObj(c-> (char) c)
         .collect(Collectors.groupingBy(x->x.charValue(), Collectors.counting()));

         System.out.println(var.chars().mapToObj(c-> (char) c).filter(x->test.get(x) ==1).findFirst().get());

         List<List<String>> nestedWords = Arrays.asList(
    Arrays.asList("apple", "banana", "orange"),
    Arrays.asList("banana", "kiwi"),
    Arrays.asList("grape", "apple")
);
     System.out.println(nestedWords.stream().flatMap(x->x.stream()).distinct().sorted().collect(Collectors.toList()));


     String s = "leetCode";

     Map<Character,Long> mapResMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(x->x.charValue(),Collectors.counting()));

    
    }

}
