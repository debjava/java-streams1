package com.ddlab.rnd.practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax1 {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    Integer minValue = intList.stream().min(Comparator.comparing(Integer::intValue)).get();
    System.out.println("minValue = " + minValue);

    Integer maxValue = intList.stream().max(Comparator.comparing(Integer::valueOf)).get();
    System.out.println("maxValue = " + maxValue);
  }
}
