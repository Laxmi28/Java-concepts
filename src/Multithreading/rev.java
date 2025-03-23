package Multithreading;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


class Employee {

     private String name;
     private int id;

    
     public Employee(String name , int id){
            this.name = name;
            this.id = id;
     }


    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    
    @Override
    public String toString(){
        return "Employee name : [ " + this.getName() + " ] and id :  [ " + this.getId() + " ] ";
    }


    // @Override
    // public int compareTo(Employee o) {
    //     //    return Integer.compare(this.getId(),o.getId());
    //     return o.getName().compareTo(this.name);
    // }
}

public class rev {
    public static void main(String[] args) {
        

        // List<Employee> empList = Arrays.asList(new Employee("Taxis Tave",1),new Employee("Kavie kurs",2),
        //                     new Employee("Iagis koralepa",3),new Employee("Taxis Tave",4));
        

        // // empList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getId));

        // Comparator mComparator = Comparator.comparing(Employee::getName);

        // empList.sort(mComparator.reversed());


        // System.out.println(empList);

      //copyOnwriteArray

      List<Integer>  intList = Arrays.asList(1,2,4,7,5,5,6,6,7);

      CopyOnWriteArrayList<Integer> testlist = new CopyOnWriteArrayList<>(intList);

    //   for(int i : testlist){
    //     if(i==7){
    //         testlist.remove(i);
    //     }
    //     System.out.println(i);
    //   }

    //   System.out.println(testlist);

    //   testlist.removeIf(i->i==7);
    //   System.out.println(testlist);

      Iterator<Integer> it = testlist.iterator();

      while(it.hasNext()){

        int num = it.next();
        if(num == 7){
            testlist.remove(Integer.valueOf(7));
        }

      }

       System.out.println(testlist);

      



    }
}
