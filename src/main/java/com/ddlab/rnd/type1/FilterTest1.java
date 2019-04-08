package com.ddlab.rnd.type1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest1 {

  public static void showHighestRatedEmps() {
    Emp emp1 = new Emp("John", 23, 4500, 3);
    Emp emp2 = new Emp("Vidya", 24, 5500, 2);
    Emp emp3 = new Emp("Ron", 30, 3700, 6);
    Emp emp4 = new Emp("John", 23, 4500, 1);
    Emp emp5 = new Emp("Vidya", 24, 5500, 7);
    Emp emp6 = new Emp("Ron", 30, 3700, 8);
    List<Emp> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
    List<Emp> highestRatedEmps =
        empList.stream().filter(t -> t.getRating() > 5).collect(Collectors.toList());
    highestRatedEmps.forEach(System.out::println);
  }

  public static void showListOfJavaEmps() {
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
    List javaEmps =
        empList.stream()
            .filter(t -> t.getSkill().equalsIgnoreCase("java"))
            .collect(Collectors.toList());
    javaEmps.forEach(System.out::println);
  }

  public static void showHighRatedJavaEmps() {
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

    List<Emp> javaEmps =
        empList.stream()
            .filter(t -> t.getSkill().equalsIgnoreCase("Java") && t.getRating() > 5)
            .collect(Collectors.toList());

    javaEmps.forEach(System.out::println);

    // Another way of writing
    javaEmps =
        empList.stream()
            .filter(
                t -> {
                  //return t.getSkill().equalsIgnoreCase("java") && t.getRating() > 5; It is also correct
                  if (t.getSkill().equalsIgnoreCase("java") && t.getRating() > 5) return true;
                  else return false;
                })
            .collect(Collectors.toList());

    System.out.println("================================");
    javaEmps.forEach(System.out::println);

    javaEmps = empList.stream().filter(t -> isOk(t)).collect(Collectors.toList());
    System.out.println("-------------------------------");
    javaEmps.forEach(System.out::println);
    javaEmps = empList.stream().filter(FilterTest1::isOk).collect(Collectors.toList());
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    javaEmps.forEach(System.out::println);
  }

  private static boolean isOk(Emp emp) {
    return emp.getRating() > 5 && emp.getSkill().equalsIgnoreCase("Java");
  }

  public static void main(String[] args) {
//        showHighestRatedEmps();
//        showListOfJavaEmps();
    showHighRatedJavaEmps();
  }
}
