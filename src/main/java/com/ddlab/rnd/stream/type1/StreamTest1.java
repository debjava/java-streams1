package com.ddlab.rnd.stream.type1;

import java.util.stream.Stream;

public class StreamTest1 {
  public static void main(String[] args) {
    Stream<String> stream =
        Stream.<String>builder().add("a").add("b").add("c").add("d").add("e").build();
//    long count = stream.count();
//    System.out.println("Total Count : " + count); // 3
    Stream limitStream = stream.limit(3);
    limitStream.forEach(e -> System.out.print(e+"\t"));
  }
}
