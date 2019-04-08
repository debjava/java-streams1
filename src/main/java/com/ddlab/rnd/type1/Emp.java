package com.ddlab.rnd.type1;

public class Emp {
  private String name;
  private int age;
  private double salary;
  private int rating;
  private String skill; // Java, Python, NodeJS, Angular, React

  public Emp() {}

  public Emp(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public Emp(String name, int age, double salary, int rating) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.rating = rating;
  }

  public Emp(String name, int age, double salary, int rating, String skill) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.rating = rating;
    this.skill = skill;
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

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  @Override
  public String toString() {
    return "Emp{"
        + "name='"
        + name
        + '\''
        + ", age="
        + age
        + ", salary="
        + salary
        + ", rating="
        + rating
        + ", skill='"
        + skill
        + '\''
        + '}';
  }
}
