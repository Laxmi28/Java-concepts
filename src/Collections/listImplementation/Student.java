package Collections.listImplementation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {

    private String name;
    private double cgpa;

    private Student ( String name , double cgpa){
        this.cgpa = cgpa;
        this.name = name;
    }

    private String getName(){
        return name;
    }

    private double getCgpa(){
        return cgpa;
    }

    private void setName(String Name){
        this.name = name;
    }

    private void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
    
    @Override
    public String toString(){
       return "Student name : " + name + " and cgpa is " + cgpa; 
    }
   
    public static void main(String[] args) {
        List<Student> students = new ArrayList();

        students.add( new Student("Alice",4.0));
        students.add( new Student("Alice",2.96));
        students.add( new Student("James",2.63));
        students.add( new Student("John",4.0));

        // List<Student> res = students.stream().sorted(Comparator.comparing(Student::getCgpa).
        // thenComparing(Student::getName).reversed()).collect(Collectors.toList
        // ());
        System.out.println(students);
        List<Student> example = students.stream().sorted(Comparator.comparing(Student::getName).
        thenComparing(Student::getCgpa).reversed()).collect(Collectors.toList());
        System.out.println(example);
    }

}
