package Collections.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParrellelStreamsEx {

    public static void main(String[] args) {
      

        /*
         * Parellel streams are used when we want to perform independent task in minimum time
         * it allows multiple thread to process the task simultaneouly
         * workload is distributed accross multiple threads
         * 
         */
        
      List<Integer> nums = Stream.iterate(0, x -> x+ 1).limit(1000).collect(Collectors.toList());

      Long startTime = System.currentTimeMillis();

      nums.stream().map(x->factorial(x)).collect(Collectors.toList());

      Long endTime = System.currentTimeMillis();

      System.out.println("Time taken by normal streams : " + (endTime - startTime)  + " ms ");

       startTime = System.currentTimeMillis();

       nums.parallelStream().map(x->factorial(x)).collect(Collectors.toList());

       endTime = System.currentTimeMillis();

      System.out.println("Time taken by parellel streams : " + (endTime - startTime)  + " ms ");


      

    }

    public static int factorial(int x){

        int res = 1;
        for(int i = x ; i > 0 ; i--){
            res *= i;
        }

        return res;


    }

}
