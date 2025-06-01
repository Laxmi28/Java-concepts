package Collections.MapImplemetation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prac {

    public static void main(String[] args) {
      

       List<String> list = Arrays.asList("a", "bb", "cc", "ddd", "ee");


       System.out.println(list.stream().collect(Collectors.groupingBy(x->x.length(),Collectors.counting())));


       List<String> ip = Arrays.asList("apple", "bat", "apple");

       String combined = String.join("", ip);

       Map<Character,Long> intermediateRes = combined.chars().mapToObj(x->(char) x).collect(Collectors.groupingBy(x->x.charValue(),Collectors.counting()));

      for(char ch : combined.toCharArray()){
           if ( intermediateRes.get(ch) == 1){
            System.out.println(ch);
            break;
           }
      }

      List<Integer> nums = Arrays.asList(1,1,2,3,3,4,5,6,6,78,89);


      Map<Boolean, List<Integer>> op = nums.stream().collect(Collectors.partitioningBy(x->x%2==0));

      System.out.println(op);


      List<String> res = Arrays.asList("sister","chatgpt is my friend","hate","Lots of love" ,"version is my friend");

         Map<Integer, List<String>>  res1 = res.stream().collect(Collectors.groupingBy(x->x.length()));

         System.out.println(res.stream().mapToInt(String::length).max().orElse(0));

         System.out.println( res1.keySet().stream().sorted(Comparator.reverseOrder()).findFirst().get());

        

      System.out.println(res1);

      int maxCount = 0;

      for (String s : res){
        if (maxCount < s.length()){
          maxCount = s.length();
      }

      List<String> words = Arrays.asList(
                                "apple", "art", "angle", 
                                "bat", "ball", "banana", 
                                "cat", "cup", 
                                "dog"
                            );


     Map<Character,List<String>> res3 = words.stream().collect(Collectors.groupingBy(w->w.charAt(0)));     
     
     System.out.println(res3.entrySet().stream().filter(x->x.getValue().size() > 2)
     .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));

    }

 

 
  }
}
