package com.ddlab.rnd.type1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxInteger1 {

  public static void showMinMax() {
    Integer minValue = Stream.of(10, 9, 8, 7, 6).min(Comparator.comparing(Integer::valueOf)).get();
    System.out.println("Min Value :::" + minValue);
    Integer maxValue = Stream.of(1, 2, 3, 4, 5).max(Comparator.comparing(Integer::valueOf)).get();
    System.out.println("Max Value :::" + maxValue);
  }

  public static void showMinByAge() {
    Emp emp1 = new Emp("John", 23, 4500);
    Emp emp2 = new Emp("Vidya", 24, 5500);
    Emp emp3 = new Emp("Ron", 30, 3700);

    Emp minAgeEmp = Stream.of(emp1, emp2, emp3).min(Comparator.comparing(Emp::getAge)).get();
    System.out.println("Youngest Emp by Age :::" + minAgeEmp);
    List<Emp> empList = Arrays.asList(emp1, emp2, emp3);
    Emp minAgeEmp1 = empList.stream().min(Comparator.comparing(Emp::getAge)).get();
    System.out.println("Youngest Emp by Age :::" + minAgeEmp1);
  }

  public static void showHighestPaid() {
    Emp emp1 = new Emp("John", 23, 4500);
    Emp emp2 = new Emp("Vidya", 24, 5500);
    Emp emp3 = new Emp("Ron", 30, 3700);

    Emp highestPaidEmp = Arrays.asList(emp1, emp2, emp3).stream()
            .max(Comparator.comparing(Emp::getSalary))
            .get();
    System.out.println("Highest Paid Emp :::"+highestPaidEmp);
  }

  public static void main(String[] args) {
//    showMinByAge();
    showHighestPaid();
  }
}
