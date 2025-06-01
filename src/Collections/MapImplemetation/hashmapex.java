package Collections.MapImplemetation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;



public class hashmapex {

     int id;
    String name;

   hashmapex(int id , String name){
    this.id = id;
    this.name = name;
   }

    private static String sortedWords(String word){
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

   @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }

        if (!(o instanceof hashmapex)) return false;

        hashmapex student = (hashmapex) o;

         return this.id == student.id && this.name.equals(student.name);




    }


     @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }

    public static void main(String[] args) {
        

        String s = "namesss";
        HashMap<Character,Integer> res = new HashMap<>();

        for (int i = 0 ; i <= s.length()-1;i++){
              if(res.containsKey(s.charAt(i))){
                  res.put(s.charAt(i), res.getOrDefault(s.charAt(i),0)+1);
              }
              else{
                 res.put(s.charAt(i), res.getOrDefault(s.charAt(i) + 1, 1));
              }
        }

        System.out.println(res);


        String test = "namases";
       
        Map<Character,Long> result =
        test.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c->c.charValue(),Collectors.counting()));

        System.out.println(test.chars().mapToObj(x->(char) x).filter(x->result.get(x) == 1).findFirst().get());


        List<String> input = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String,List<String>> resMap = new HashMap<>(); 

        
        System.out.println(input.stream().collect(Collectors.groupingBy(x->sortedWords(x))));

        for(String str : input){
             String dummy = sortedWords(str);

             if (resMap.containsKey(dummy)){
                List<String> intermList = resMap.get(dummy);
                System.out.println(intermList);
                intermList.add(str);
                resMap.put(dummy,intermList);
             }else{
                
                resMap.put(dummy,new ArrayList<>(Arrays.asList(str)));
             }
        }

        System.out.println(resMap);



      Map<hashmapex,String> op = new HashMap<>();

      hashmapex s1 = new hashmapex(1, "test");
      hashmapex s2 = new hashmapex(2,"test");

      op.put(s1, "test");
     

      System.out.println(op);

      System.out.println("the second key output : " + op.get(s2));

    }

}
