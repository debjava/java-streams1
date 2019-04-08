package com.ddlab.rnd.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Person {
  private String name;
  private String stateName;
  private String type;

  public Person(String name, String stateName, String type) {
    this.name = name;
    this.stateName = stateName;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Person{"
        + "name='"
        + name
        + '\''
        + ", stateName='"
        + stateName
        + '\''
        + ", type='"
        + type
        + '\''
        + '}';
  }
}

public class TestGroupBy1 {
  public static void main(String[] args) {
    List<Person> personList =
        Arrays.asList(
            new Person("John", "KA", "Male"),
            new Person("Vidya", "TN", "Female"),
            new Person("Roma", "TN", "Female"),
            new Person("Deb", "OR", "Male"),
            new Person("Ramesh", "KA", "Male"),
            new Person("Rani", "KA", "Female"));

    Map<String, List<Person>> groupByStates =
        personList.stream().collect(Collectors.groupingBy(Person::getStateName));

    groupByStates.forEach(
        (k, v) -> {
          System.out.println("Key ->" + k);
          System.out.println("Value ->" + v);
        });

    // Provide the group of persons from each states
    // Example: OR -1, KA -2, TN -2
    Map<String, Long> countMap =
        personList.stream()
            .collect(Collectors.groupingBy(Person::getStateName, Collectors.counting()));

    countMap.forEach(
        (k, v) -> {
          System.out.println(k + "-----" + v);
        });

    List<String> fruits =
        Arrays.asList("Banana", "Apple", "Banana", "Orange", "Grape", "Orange", "Apple");
    Map<String, Long> fruitsMap =
        fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    fruitsMap.forEach((k, v) -> System.out.println(k + "---" + v));

    // Multiple grouping
      //Group by States Name and then group by gender
    Map<String, Map<String, List<Person>>> listMap =
        personList.stream()
            .collect(
                Collectors.groupingBy(
                    Person::getStateName, Collectors.groupingBy(Person::getType)));

    listMap.forEach(
        (k, v) -> {
          System.out.println("K--->" + k);
          v.forEach((p, q) -> System.out.println(p + "<====>" + q));
        });

    // How many male and female are there from each state
    Map<String, Map<String, Long>> pMap =
        personList.stream()
            .collect(
                Collectors.groupingBy(
                    Person::getStateName,
                    Collectors.groupingBy(Person::getType, Collectors.counting())));

    pMap.forEach(
        (k, v) -> {
          System.out.println("K--->" + k);
          v.forEach((p, q) -> System.out.println(p + "<====>" + q));
        });
  }
}
