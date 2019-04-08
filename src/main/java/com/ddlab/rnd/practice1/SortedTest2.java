package com.ddlab.rnd.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Emp1 {
  private String name;
  private int age;
  private int salary;

  public Emp1(String name, int age, int salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Emp{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
  }
}

public class SortedTest2 {
  public static void main(String[] args) {
    List<Emp1> empList =
        Arrays.asList(
            new Emp1("John", 23, 1000),
                new Emp1("Bihu", 33, 2000),
                new Emp1("Vidya", 21, 1500));

    empList.stream().sorted().collect(Collectors.toList()).forEach(e -> System.out.println(e));
    System.out.println("---------------------------------");
  }
}
