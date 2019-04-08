package com.ddlab.rnd.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapTest1 {

  public static void main(String[] args) {
    List<String> namesList = Arrays.asList("a", "b", "c", "d", "e");

    namesList.stream()
        .map(element -> element.toUpperCase())
        .collect(Collectors.toList())
        .forEach(data -> System.out.println("data = " + data));

    System.out.println("---------- ANOTHER WAY OF WRITING -------------");
    namesList.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList())
        .forEach(data1 -> System.out.println("data1 = " + data1));

    System.out.println(" Multiple numbers with 10 from a list of numbers");
    List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> numbersList = intList.stream()
                .map(element -> element * 10)
                .collect(Collectors.toList());

    numbersList.forEach(data -> System.out.println("data = " + data));
  }
}
