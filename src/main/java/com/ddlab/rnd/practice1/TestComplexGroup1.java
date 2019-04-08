package com.ddlab.rnd.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Programmer {
  private String name;
  private String stateName;
  private String gender;
  private String skill;

  public Programmer(String name, String stateName, String gender, String skill) {
    this.name = name;
    this.stateName = stateName;
    this.gender = gender;
    this.skill = skill;
  }

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
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

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Programmer{"
        + "name='"
        + name
        + '\''
        + ", stateName='"
        + stateName
        + '\''
        + ", gender='"
        + gender
        + '\''
        + ", skill='"
        + skill
        + '\''
        + '}';
  }
}

public class TestComplexGroup1 {
  public static void main(String[] args) {
    List<Programmer> pList =
        Arrays.asList(
            new Programmer("John", "KA", "Male", "Java"),
            new Programmer("Vidya", "TN", "FeMale", "Python"),
            new Programmer("Moumita", "TN", "FeMale", "Python"),
            new Programmer("RAM", "KA", "Male", "Java"));

    Map<String, List<Programmer>> datMap =
        pList.stream()
            .filter(element -> element.getSkill().equals("Python")) // Skill
            .filter(element -> element.getStateName().equals("TN")) // state name
            .filter(element -> element.getGender().equals("FeMale"))
            .collect(Collectors.groupingBy(Programmer::getName));

    datMap.forEach((k, v) -> System.out.println(k + "---" + v));
  }
}
