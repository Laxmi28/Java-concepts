package Collections.listImplementation;

import java.util.*;

class MyComparator implements Comparator<String>{

  @Override
  public int compare(String o1, String o2) {
       System.out.println(o2.length() - o1.length());
        return o2.length() - o1.length();
  } 

 // ok test
}

public class ArrayListExample {

  public static void main(String[] args) {

    /* A array list internally uses a array itself so the initial holding capacity is 10
     * and when the elements that are added increases this capacity the size of the array crossed 10 then 
     * a new array is created internally and then these elements are copied here
     * Note :- when the size of the araylist increases the capacity is then increase 1.5 times its initial capacity
     */
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.sort(null);

    System.out.println(list1);  // internally uses to string method to do so

    list1.add(2,45);
    list1.add(0,232);

    System.out.println(list1);

    for (int i : list1){
        System.out.println(i);
    }

    list1.remove(0);
    System.out.println(list1);  // internally uses to string method to do so


    List<String>  strList = new ArrayList<>();

    strList.add("Hello");
    strList.add("helium");
    strList.add("hexagon");
    strList.add("why");
    strList.add("?");
    System.out.println("With the help of custom comparator");
    strList.sort(new MyComparator()); // sorting in ascending order  by length
    System.out.println(strList);
    System.out.println("sorting the list");
    strList.sort(null); // asc to desc
    System.out.println(strList);

    Comparator<String> comparator = Comparator.comparing(String::length);

    strList.sort(comparator.reversed()); //sort according to length 
    strList.get(0); // checking for the validating the index and then calling the direct access of the element --- . O(1)
    System.out.println(strList);

    // strList.sort(Comparator.comparing(null));
  }  
 

}
