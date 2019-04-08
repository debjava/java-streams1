package com.ddlab.rnd.type2;

public class Student {
  private String name;
  private int age;

  public Student() {}

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student(Student s) {
    this(s.getName(),s.getAge());
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

  @Override
  public String toString() {
    return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
