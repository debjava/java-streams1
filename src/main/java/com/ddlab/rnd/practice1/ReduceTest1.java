package com.ddlab.rnd.practice1;

import java.util.Arrays;
import java.util.List;

class Employee {
  private String name;
  private int sal;

  public Employee(String name, int sal) {
    this.name = name;
    this.sal = sal;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSal() {
    return sal;
  }

  public void setSal(int sal) {
    this.sal = sal;
  }

  @Override
  public String toString() {
    return "Employee{" + "name='" + name + '\'' + ", sal=" + sal + '}';
  }
}

public class ReduceTest1 {
  public static void main(String[] args) {
    List<String> strList = Arrays.asList("a", "b", "c", "d", "e");
    // Join the list of string by tilde ~
    String tildeStr = strList.stream().reduce((p, q) -> p + "~" + q).get();
    System.out.println("tildeStr = " + tildeStr);

    // Join the list of strings by comma.
    String commaStr = strList.stream().reduce((p, q) -> p + "," + q).get();
    System.out.println("commaStr = " + commaStr);

    // Total salaries of all employees
    List<Employee> empList =
        Arrays.asList(
            new Employee("John", 2000),
                new Employee("Vidya", 1000),
                new Employee("Ram", 5000));

    Integer totalSalary =
        empList.stream().map(element -> element.getSal()).reduce((p, q) -> p + q).get();
    System.out.println("totalSalary = " + totalSalary);

    List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    Integer totalSum = intList.stream().reduce((a, b) -> a + b).get();
    System.out.println("totalSum = " + totalSum);
  }
}
