package Collections.Streams.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {
  

    private int id;
    private String name;
    private String department;
    private int salary;

    Employee(int id , String name, String department , int salary){
    
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;

    }

    private int getSalary(){
        return this.salary;
    }

    private int getId(){
        return this.id;
    }

    private String getName(){
        return this.name;
    }

    private String getDepartment(){
        return this.department;
    }
    
    @Override
    public String toString(){
       return "Employee details { " + "id : " + this.id + " ,name :" + this.name +  " ,dept:" +
        this.department + ", salary:" + this.salary + "}" ;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                                new Employee(1, "Alice", "HR", 50000),
                                new Employee(2, "Bob", "HR", 60000),
                                new Employee(3, "Charlie", "IT", 80000),
                                new Employee(4, "David", "IT", 90000),
                                new Employee(5, "Eve", "Finance", 70000),
                                new Employee(6, "Frank", "Finance", 85000));


       //Find the highest-paid employee in each department.

       Map<String,Long> res1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
      System.out.println(res1);
      Map<String,Optional<Employee>> map =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
       
      map.forEach((dept, emp) -> System.out.println(dept  + "->" + emp.map(Employee::getName).orElse("No employee")));
    //Compute the total salary paid per department.
      System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.summingInt(Employee::getSalary) )));

      Map<String, Double> res = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment ,  Collectors.averagingInt(Employee::getSalary)));

       List<Employee> empList = employees.stream().filter(x->x.getSalary() > res.get(x.getDepartment())).collect(Collectors.toList());

       empList.forEach(emp -> System.out.println(emp.getName()));

      System.out.println(empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.groupingBy(Employee::getDepartment , Collectors.toList())));
                             

    }
}
