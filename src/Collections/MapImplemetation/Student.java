package Collections.MapImplemetation;

import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparable<Student> {

    String name;
    private Double marks;
    public int id;

    public Student(String string, double d) {
            this.name = string;
            this.marks = d;
        }
    
        @Override
        public String toString() {
            return "{" +
                " name='" + getName() + "'" +
                ", marks='" + getMarks() + "'" +
                "}";
        }
       
    
        public String getName() {
            return this.name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public Double getMarks() {
            return this.marks;
        }
    
        public void setMarks(Double marks) {
            this.marks = marks;
        }
    
        @Override
        public int compareTo(Student o) {
            return Double.compare(o.getMarks(), this.getMarks());
        }
        /*
         * The above method is used to maintain the natural ordering sort in short a default sorting order for custom clases
         * 
         * if we want to create our our own sorting order then we need to make use of comparator class and it
         * compare method as shown in the below example
         */
        
    
        public static void main(String[] args) {
            
           ArrayList<Student>  list = new ArrayList<>();
           list.add(new Student("Alex" , 3.66));
           list.add(new Student("Alex" , 3.78));
           list.add(new Student("Alice" , 3.895));
           list.add(new Student("Alesea" , 3.0));
           list.add(new Student("Jamuna" , 3.0));

           list.sort(null);
           System.out.println(list);
           System.out.println("With the help of custom comparator");

           Comparator<Student> comparator = Comparator.comparing(Student::getMarks).reversed().
                                              thenComparing(Student::getName);

           list.sort(comparator);
           System.out.println(list);
       /*
        * In simple terms, the difference between Comparator and Comparable in Java lies in how and where you define the sorting logic for objects.

                    1. Comparable:
                    Where to use: You use Comparable when the class itself defines its natural ordering.
                    How it works: You implement the compareTo() method inside the class.
                    When to use: If you want to specify a default sorting order for objects of that class.

            Where to use: You use Comparator when you want to define sorting outside of the class itself. This is useful when you want to sort objects in multiple different ways (e.g., by name, by age, by marks).
            How it works: You implement the compare() method in a separate class.
            When to use: If you need to define multiple sorting orders for a class or want sorting to be applied in different situations.           
        */
    }


}
