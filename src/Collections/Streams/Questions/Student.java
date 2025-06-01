package Collections.Streams.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int grade;
    private String subject;

    // Constructor
    public Student(String name, int grade, String subject) {
        this.name = name;
        this.grade = grade;
        this.subject = subject;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Optional: For printing
    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + ", subject='" + subject + "'}";
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
    new Student("Aisha", 95, "Math"),
    new Student("Rahul", 89, "Math"),
    new Student("Priya", 92, "Science"),
    new Student("Aman", 88, "Science"),
    new Student("Neha", 91, "Math"),
    new Student("Vikas", 84, "English"),
    new Student("Sneha", 97, "English")
                );


                System.out.println(students.stream().collect(Collectors.groupingBy(Student::getSubject, Collectors.mapping(Student::getName, Collectors.toList()))));

                System.out.println(students.stream().collect(Collectors.groupingBy(Student::getSubject , Collectors.averagingInt(Student::getGrade))));

                System.out.println(students.stream().filter(x->x.getGrade() > 90).collect(Collectors.toList()));

                System.out.println(students.stream().collect(Collectors.groupingBy(Student::getSubject ,
                Collectors.maxBy(Comparator.comparing(Student::getGrade)))));

                System.out.println(students.stream().collect(Collectors.groupingBy(Student::getSubject, Collectors.counting())));


                System.out.println(students.stream().collect(Collectors.averagingInt(Student::getGrade)));

                System.out.println(students.stream().map(Student::getName).sorted().collect(Collectors.toList()));

                System.out.println(students.stream()
                .collect(Collectors.partitioningBy(x->x.getGrade() >= 60)));


                Optional<Student>  res = students.stream().filter(x->x.getGrade() < 60).findAny();
                // if (res.get() == null){
                    // System.out.println("All students passed");
                // }


                Optional<Student> res1 = students.stream().filter(x->x.getGrade()== 100).findAny();

                // res1.ifPresent((res1)->System.out.println("Yes there is one"));



                // for questions 5 Sort students first by subject, then by descending grade.
                
                System.out.println(students.stream().sorted(Comparator.comparing(Student::getSubject)
                .thenComparing(Comparator.comparing(Student::getName).reversed())).collect(Collectors.toList()));

                // for question 3 Return a comma-separated string of names of students in a specific subject, e.g., Math.

                System.out.println(students.stream().filter(x->x.getSubject()=="Math").map(Student::getName).collect(Collectors.joining(" ,")));


                //Find the subject with the highest average grade.

                Map<String, Double> map1 = students.stream().collect(Collectors.groupingBy(Student::getSubject , 
                Collectors.averagingInt(Student::getGrade)));


                System.out.println(map1.entrySet().stream().collect(Collectors.maxBy(Comparator.comparing(x->x.getValue()))));


                System.out.println(students.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGrade))));

                //Create a Map<String, List<Student>> where the key is the first letter of the student's name.

                Map<String, List<Student>> groupedByFirstLetter = students.stream()
                   .collect(Collectors.groupingBy(student -> student.getName().substring(0, 1)));

     
    }
}
