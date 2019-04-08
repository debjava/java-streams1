package com.ddlab.rnd.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
  public static void main(String[] args) {
    List<String> namesList = new ArrayList(Arrays.asList("a", "b", "c", "d", "e"));
    Stream<String> stream = namesList.stream();
    namesList.add("F"); // Even if it is added here, stream will catch
    // because streams are lazy and only perform operations on
    // terminal operations.
    stream.forEach(e -> System.out.print(e + "-" + "\t"));

    // It will throws exception because stream has already been used and data has
    // been exhausted.
    //     String commaSeparatedValue = stream.collect(Collectors.joining(","));
    //     System.out.println("commaSeparatedValue = " + commaSeparatedValue);

    String commaSeparatedValue1 = namesList.stream().collect(Collectors.joining("---"));
    System.out.println("commaSeparatedValue1 = " + commaSeparatedValue1);

    String concatenated = namesList.stream().reduce("~~~", String::concat);
    System.out.println("concatenated = " + concatenated); // ~~~abcdeF

    List<String> strings =
        namesList.stream()
            .map(Objects::toString)
            .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    System.out.println("strings = " + strings);
  }
}
