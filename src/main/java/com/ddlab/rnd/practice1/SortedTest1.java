package com.ddlab.rnd.practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Emp implements Comparable<Emp> {
  private String name;
  private int age;
  private int salary;

  public Emp(String name, int age, int salary) {
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

  @Override
  public int compareTo(Emp o) {
    return name.compareTo(o.getName());
  }
}

public class SortedTest1 {
  public static void main(String[] args) {
    List<Emp> empList =
        Arrays.asList(
            new Emp("John", 23, 1000), new Emp("Bihu", 33, 2000), new Emp("Vidya", 21, 1500));

    empList.stream()
        .sorted(Comparator.comparing(Emp::getSalary))
        .collect(Collectors.toList())
        .forEach(e -> System.out.println(e));

    System.out.println("----------------- sort all salary in reverse order ------------");
    empList.stream()
        .sorted(Comparator.comparing(Emp::getSalary).reversed())
        .collect(Collectors.toList())
        .forEach(e -> System.out.println(e));
  }
}
