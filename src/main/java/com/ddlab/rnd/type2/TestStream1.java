package com.ddlab.rnd.type2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream1 {
  public static void showFilterByAge() {
    Student s1 = new Student("John", 23);
    Student s2 = new Student("Vidya", 33);
    Student s3 = new Student("Tinku", 43);
    Student s4 = new Student("Chicky", 13);
    Student s5 = new Student("Baby", 03);
    Student s6 = new Student("Romanov", 23);
    List<Student> studentList = Arrays.asList(s1, s2, s3, s4, s5, s6);
    List<Student> age30List =
        studentList.stream()
            .filter(t -> t.getAge() > 30)
            .map(Student::new) //Calls the constructor public Student(Student s)
            .collect(Collectors.toList());
    age30List.forEach(System.out::println);
    System.out.println("=========================");
    List<Student> student30List =
        studentList.stream().filter(t -> t.getAge() > 30)
                .collect(Collectors.toList());
    student30List.forEach(System.out::println);
  }

  public static void main(String[] args) {
    showFilterByAge();
  }
}
