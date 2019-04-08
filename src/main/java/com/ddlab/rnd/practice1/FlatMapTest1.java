package com.ddlab.rnd.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest1 {
  public static void main(String[] args) {
    List<List<String>> listOfList =
        Arrays.asList(
            Arrays.asList("111", "222", "333"),
            Arrays.asList("a", "b", "c"),
            Arrays.asList("ppp", "qqq", "rrr"));

    listOfList.stream()
        .flatMap(childList -> childList.stream())
        .collect(Collectors.toList())
        .forEach(element -> System.out.println("element = " + element));
  }
}
