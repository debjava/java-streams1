package com.ddlab.rnd.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Developer {
  private String name;
  private String type;

  public Developer(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Developer{" + "name='" + name + '\'' + ", type='" + type + '\'' + '}';
  }
}

public class MapTest2 {
  public static void main(String[] args) {
    List<Developer> devList =
        Arrays.asList(
            new Developer("John", "Java"),
            new Developer("Vidya", "Python"),
            new Developer("Sambit", "Python"),
            new Developer("Rona", "Java"));

    List<Developer> pythonList =
        devList.stream()
            .map(
                element -> {
                  if (element.getType().equals("Python")) return element;
                  return null;
                })
            .filter(data -> data != null)
            .collect(Collectors.toList());
    pythonList.forEach(element -> System.out.println("element = " + element));

    // Instead of using .map(), you can use filter.
    devList.stream()
        .filter(element -> element.getType().equals("Python"))
        .collect(Collectors.toList())
        .forEach(data -> System.out.println("data = " + data));
  }
}
