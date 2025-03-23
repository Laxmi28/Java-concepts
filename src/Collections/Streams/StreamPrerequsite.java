package Collections.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamPrerequsite {

    public static void main(String[] args) {
        //Predicate example -> returns a boolean value
        
        Predicate<Integer> predicate = x->x%2 == 0;
        
        System.out.println(predicate.test(23));

        Predicate<String> isStartWithA = s->  s != null && s.toUpperCase().startsWith("A");
        Predicate<String> isEndsWithA = s-> s != null && s.toUpperCase().endsWith("A");

        Predicate<String> bothConditions = isStartWithA.and(isEndsWithA);
        System.out.println(bothConditions.test("Amanda"));

        //Function -> will do any work for you

        Function<Integer,Integer> doubleIt = x -> x * 2;
        Function<Integer,Integer> halfIt = x -> x / 2;

        System.out.println( doubleIt.apply(10));
        System.out.println(halfIt.apply(10));
         
        System.out.println(doubleIt.andThen(halfIt).apply(10));
        System.out.println(Function.identity().apply(doubleIt.andThen(halfIt).apply(10)));

        //Consumer

        Consumer<Integer> consumer1 = x-> System.out.println(x);

        List<Integer> list = Arrays.asList(1,2,2,3);
        Consumer<List<Integer>> c2 = x -> {
            for(int i : x){
                System.out.println(i);
            }
        };

        c2.accept(list);

         //Supplier
         Supplier s = () -> "message hello there !";
         System.out.println(s.get());

         Predicate<Integer> isOdd = x -> x%2!=0;
         Function<Integer,Integer> tripleIt = x -> x*x*x;
         Consumer<Integer> c1 = x -> System.out.println(x);
         Supplier<Integer> s1 = () -> 101;

         if(isOdd.test(s1.get())){
               c1.accept(tripleIt.apply(s1.get()));
         }

         //Bifunction , Bipredicate , biconsumer

         BiPredicate<Integer, Integer> bipredicate = (x,y) -> (x + y) % 2 == 0;
         BiFunction<String , String , Integer> biFunction = (x,y)-> (x+y).length() ;
         BiConsumer<Integer,Integer > biConsumer = (x,y) ->{
            System.out.println(x);
            System.out.println(y);
         };

        //UnaryOperator and BiOperator

        //Method references : better than that lambda expersions

         



        

    }

}
