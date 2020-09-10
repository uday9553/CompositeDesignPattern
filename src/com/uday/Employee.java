package com.uday;
import java.util.ArrayList;
import java.util.List;

public class Employee {
   private String name;
   private String dept;
   private int salary;
   private List<Employee> employeeList;

   // constructor
   public Employee(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
      employeeList = new ArrayList<Employee>();
   }

   public void add(Employee e) {
      employeeList.add(e);
   }

   public void remove(Employee e) {
      employeeList.remove(e);
   }

   public List<Employee> getEmployeeList(){
     return employeeList;
   }

   public String toString(){
      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
   }   
}