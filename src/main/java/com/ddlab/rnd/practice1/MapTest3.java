package com.ddlab.rnd.practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
  private String name;
  private int age;
  private String type;

  public Student(String name, int age, String type) {
    this.name = name;
    this.age = age;
    this.type = type;
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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Student{" + "name='" + name + '\'' + ", age=" + age + ", type='" + type + '\'' + '}';
  }
}

public class MapTest3 {
  public static void main(String[] args) {
    List<Student> studList =
        Arrays.asList(
            new Student("John", 23, "Java"),
            new Student("Lion", 33, "Python"),
            new Student("Clove", 45, "Java"),
            new Student("Slavia", 21, ".Net"),
            new Student("Roma", 47, "Python"));
    // List of senior python developers, means age > 30
    // Usage of double filter
    studList.stream()
        .filter(element -> element.getAge() > 30)
        .filter(element -> element.getType().equals("Python"))
        .collect(Collectors.toList())
        .forEach(data -> System.out.println("Senior Py Dev = " + data));

    // Who is the senior most Python developer
    Student stud =
        studList.stream()
            .filter(element -> element.getType().equals("Python"))
            .max(Comparator.comparing(Student::getAge))
            .get();
    System.out.println("Senior Most Py Dev = " + stud);
  }
}
