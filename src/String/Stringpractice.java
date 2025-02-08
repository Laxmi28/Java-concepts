package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stringpractice {
    
  
    static String name = "Laxmi";  // here the object is created in string pool

    static String  message = new String("This is a message"); // here the object is created in heap memory 
    
        public static void main(String[] args) {
             name = "Test";
             name.replace("T", "L");
             System.out.println(message);
             System.out.println(name);

             // string methods 

             String str ;
             str = "hello";

             System.out.println("The string methods execution are starting from here -------------");
             System.out.println("String length : " + str.length());
             System.out.println("String replace : " + str.replace("h","y"));
             System.out.println("string substring : " + str.substring(1,3) );
             System.out.println("String charAt : " + str.charAt(0));
             System.out.println("------------------------------------------------------------------");


             String test1 = "hello";
             String test2 = "Hello";

             if (test1 == test2){
               System.out.println("equal");
             }else{
                System.out.println("Not equal");
             }

             if (test1.equals(test2)){
                System.out.println("equal");
              }else{
                 System.out.println("Not equal");
              }
            
              if (test1.equalsIgnoreCase(test2)){
                System.out.println("equal");
              }else{
                 System.out.println("Not equal");
              }

              System.out.println("String comparison " + test1.compareTo(test2));
            

              // string.intern() method usage
              String internString = test1.intern();
              System.out.println("String .intern method " + internString + " - " +  internString.hashCode() + " test1 hashcode  - " + test1.hashCode());

              String formatted = String.format("The %s of the string", "value");
              System.out.println(formatted);

              StringBuilder sb = new StringBuilder();
              sb.append("hello").append(" ").append("Laxmi");
              sb.reverse();
              System.out.println(sb);

              List<String> listofnames = new ArrayList<>();
              List<String> listofnamesres = new ArrayList<>();
              String res;
              

              listofnames.add(" ekod");
              listofnames.add("  Tets  ");
              listofnames.add("Hello    hello  ");

              for(String var:listofnames){
                  res = var.trim().toLowerCase().replace("  ", " ");
                   listofnamesres.add(res);

              }
              System.out.println(listofnamesres);

              List<String> listofnamesres2 = listofnames.stream().map( r -> r.trim().toLowerCase().replaceAll("\\s+", " ")).collect(Collectors.toList());

             
              System.out.println(listofnamesres2);

              String name2 = "hello";
              String[] array = name2.split(",");
              System.out.println(array.length);

            //   HashMap<Character,Integer> res2HashMap = new HashMap<>();

            //   for(int i = 0 ; i <= name2.length()-1;i++){
                      
            //   }
               


 
    }

}
