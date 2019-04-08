package com.ddlab.rnd.stream.type1;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {
  public static void main(String[] args) {
    String[] strs = new String[] {"a", "b", "c", "d", "e", "b", "d"};
    long count = Arrays.stream(strs).count();
    System.out.println("Total Count : " + count); // 7
    Stream<String> streams = Arrays.stream(strs).limit(3);
    streams.forEach(e -> System.out.print(e + "\t")); // a b c
    System.out.println("\n");
    Stream<String> uniqueStream = Arrays.stream(strs).distinct();
    uniqueStream.forEach(e -> System.out.print(e + "\t")); // a	b	c	d	e
    Stream<String> stream =
        Stream.<String>builder()
                .add("a").add("b").add("c")
                .add("d").add("e").build();
    System.out.println("\n");
    Stream limitStream = stream.limit(3);
    limitStream.forEach(e -> System.out.print(e + "\t"));//a b c
  }
}
