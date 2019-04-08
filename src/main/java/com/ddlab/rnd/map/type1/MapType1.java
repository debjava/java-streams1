package com.ddlab.rnd.map.type1;

import com.ddlab.rnd.type1.Emp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapType1 {

  // Show all the letters in Capital Case
  public static void showAllInCapital() {
    List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
    List<String> inCapsList =
        letters.stream().map(t -> t.toUpperCase()).collect(Collectors.toList());
    inCapsList.forEach(a -> System.out.print(a + "\t"));
    System.out.println("\n------------------");
    // It can be written in the following manner also
    inCapsList = letters.stream().map(String::toUpperCase).collect(Collectors.toList());
    inCapsList.forEach(a -> System.out.print(a + "\t"));
  }

  // Provide a list of all the skills from the list of employees
  public static void showAllSkills() {
    Emp emp1 = new Emp("John", 23, 4500, 3, "Java");
    Emp emp2 = new Emp("Vidya", 24, 5500, 2, "Python");
    Emp emp3 = new Emp("Ringa", 30, 3700, 6, ".Net");
    Emp emp4 = new Emp("John", 23, 4500, 1, "Java");
    Emp emp5 = new Emp("Vidya", 24, 5500, 7, "Java");
    Emp emp6 = new Emp("Rytha", 30, 3700, 8, ".Net");
    Emp emp7 = new Emp("Swami", 30, 3700, 8, "Python");
    Emp emp8 = new Emp("Shankar", 30, 3700, 9, "Java");
    Emp emp9 = new Emp("Julie", 30, 3700, 6, "Python");
    List<Emp> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9);
    List<String> skillList = empList.stream().map(Emp::getSkill).collect(Collectors.toList());
    skillList.forEach(t -> System.out.print(t + "\t"));
    System.out.println("\n------------------------------");
    skillList = empList.stream().map(t -> t.getSkill()).collect(Collectors.toList());
    skillList.forEach(t -> System.out.print(t + "\t"));
  }

  // Provide the total amount spent for all the employee towards salary
  public static void showTotalSalary() {
    Emp emp1 = new Emp("John", 23, 4500, 3, "Java");
    Emp emp2 = new Emp("Vidya", 24, 5500, 2, "Python");
    Emp emp3 = new Emp("Ringa", 30, 3700, 6, ".Net");
    Emp emp4 = new Emp("John", 23, 4500, 1, "Java");
    Emp emp5 = new Emp("Vidya", 24, 5500, 7, "Java");
    Emp emp6 = new Emp("Rytha", 30, 3700, 8, ".Net");
    Emp emp7 = new Emp("Swami", 30, 3700, 8, "Python");
    Emp emp8 = new Emp("Shankar", 30, 3700, 9, "Java");
    Emp emp9 = new Emp("Julie", 30, 3700, 6, "Python");
    List<Emp> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9);
    double totalSalary = empList.stream().collect(Collectors.summingDouble(Emp::getSalary));
    System.out.println("Total Salary spent : " + totalSalary);
  }

  public static void main(String[] args) {
    //    showAllInCapital();
    //    showAllSkills();
    //    showTotalSalary();

    int myArray[] = {1, 5, 8};
    int sum = Arrays.stream(myArray).sum();
    System.out.println("Sum :::" + sum);
  }
}
