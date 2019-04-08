package com.ddlab.rnd.type1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest1 {

  public static void showAllNamesInUpperCase() {
    Emp emp1 = new Emp("John", 23, 4500, 3, "Java");
    Emp emp2 = new Emp("Vidya", 24, 5500, 2, "Python");
    Emp emp3 = new Emp("Ringa", 30, 3700, 6, ".Net");
    Emp emp4 = new Emp("John", 23, 4500, 1, "Java");
    Emp emp5 = new Emp("Vidya", 24, 5500, 7, "Java");

    List<Emp> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
    List<String> namesInUpperCase =
        empList.stream().map(t -> t.getName().toUpperCase()).collect(Collectors.toList());
    namesInUpperCase.forEach(System.out::println);
  }

    public static void showEmpNamesInUpperCase() {
        Emp emp1 = new Emp("John", 23, 4500, 3, "Java");
        Emp emp2 = new Emp("Vidya", 24, 5500, 2, "Python");
        Emp emp3 = new Emp("Ringa", 30, 3700, 6, ".Net");
        Emp emp4 = new Emp("John", 23, 4500, 1, "Java");
        Emp emp5 = new Emp("Vidya", 24, 5500, 7, "Java");

        List<Emp> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        List<Emp> empInUpperCase =
                empList.stream().map( t-> {
                        return new Emp(t.getName(),t.getAge(),t.getAge());
                }).collect(Collectors.toList());
    }

  public static void main(String[] args) {
    showAllNamesInUpperCase();
  }
}
