package com.ddlab.rnd.stream.type1;

import com.ddlab.rnd.type1.Emp;
import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduce1 {

  public static void showSumOfAllNos() {
    int[] nos = new int[] {1, 2, 3, 4, 5};
    OptionalInt optionalInt = Arrays.stream(nos).reduce((a, b) -> a + b);
    if (optionalInt.isPresent())
      System.out.println("Sum of all Nos : " + optionalInt.getAsInt()); // 15

    Integer[] allNos = new Integer[] {1, 2, 3, 4, 5};
    Optional<Integer> optionalObj = Stream.of(allNos).reduce((a, b) -> a + b);
    if (optionalObj.isPresent())
      System.out.println("Sum of all No Objects : " + optionalObj.get()); // 15
  }

  public static void showSumOfAllEmpSalary() {
    Emp emp1 = new Emp("John", 23, 4500, 3);
    Emp emp2 = new Emp("Vidya", 24, 5500, 2);
    Emp emp3 = new Emp("Ron", 30, 3700, 6);
    Emp emp4 = new Emp("John", 23, 4500, 1);
    Emp emp5 = new Emp("Vidya", 24, 5500, 7);
    Emp emp6 = new Emp("Ron", 30, 3700, 8);
    List<Emp> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
    Optional<Double> totalSalary = empList.stream().map(Emp::getSalary).reduce((a, b) -> a + b);
    if (totalSalary.isPresent()) System.out.println("Total Salary Spent : " + totalSalary.get());
  }

  public static void main(String[] args) {
    //    showSumOfAllNos();
    //    showSumOfAllEmpSalary();

    //    int[] array = {1, 2, 3, 4, 5};
    //    int startValue = 100;
    //    int sum = Arrays.stream(array).reduce(100, (x, y) -> x + y);
    //    System.out.println(sum);

    //      //Reduce Array to String.
    //      String[] array = {"Mohan", "Sohan", "Mahesh"};
    //      Arrays.stream(array).reduce((x, y) -> x +"," + y)
    //              .ifPresent(s -> System.out.println("Array to String: "+ s));
    //      //Reduce List to String.
    //      List<String> list = Arrays.asList("Mohan", "Sohan", "Mahesh");
    //      list.stream().reduce((x, y) -> x +"," + y)
    //              .ifPresent(s -> System.out.println("List to String: "+ s));

    //    Stream<String> streamBuilder = Stream.<String>builder()
    //            .add("a").add("b").add("c").build();
    //    streamBuilder.forEach(e -> System.out.print(e + "\t"));

    //    Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);

    //    Stream.generate(() -> "element")
    //            .limit(5)
    //            .forEach(e -> System.out.print(e + "\t"));

    //    Stream.iterate(10, n -> n + 1)
    //            .limit(10).forEach(e -> System.out.print(e + "\t"));

    //    IntStream intStream = IntStream.range(1, 3);
    //    intStream.forEach(e -> System.out.print(e + "\t"));

    //      Stream<String> streamOfString =
    //              Pattern.compile(", ").splitAsStream("a, b, c");
    //      streamOfString.forEach( e -> System.out.print(e+"\t"));

    //    Stream<String> stream = Stream.of("a", "b", "c")
    //            .filter(element -> element.contains("b"));
    //    Optional<String> anyElement = stream.findAny();
    //    System.out.println("anyElement.get() = " + anyElement.get());

    //    Stream.of("AAA", "BBB", "CCC")
    //            .skip(1).forEach(e -> System.out.print(e+"\t"));

    //      List<String> list = Arrays.asList("abc1", "abc2", "abc3");
    //      int counter = 0;
    //      Stream<String> stream = list.stream().filter(element -> {
    //          return element.contains("2");
    //      });
    //      stream.forEach( e -> System.out.print(e+"\t"));

    //      OptionalInt reduced =
    //              IntStream.range(1, 4).reduce((a, b) -> a + b);
    //    System.out.println("reduced.getAsInt() = " + reduced.getAsInt());

    //      Integer val = Stream.of(1, 2, 3).reduce(10, (a, b) -> a+b);
    //      System.out.println("val using + as addition "+val);
    //
    //      val = Stream.of(1, 2, 3).reduce(10, (a, b) -> a*b);
    //      System.out.println("val using * as multiplication " + val);

    //      List<String> list = new ArrayList<String>();
    //      list.add("java");//length 4
    //      list.add("php");//3
    //      list.add("python");//6
    //      list.add("perl");//4
    //      Stream<String> wordStream = list.stream();
    //      int total = wordStream.map(s -> s.length())
    //              .mapToInt(Integer::new)
    //              .sum();
    //      System.out.println(total);//17

    //      wordStream = list.stream();
    //      int s = wordStream.reduce(0, (x, y) -> x + y.length(), (x, y) -> x + y);
    //      System.out.println(s);

    //    List<String> prodList = Arrays.asList("a", "a", "b", "c", "d", "e", "d");
    //    Set<String> prodSet = prodList.stream().collect(Collectors.toSet());
    //    System.out.println("prodSet = " + prodSet);
    //    Set<String> unmodifiableSet =
    //        prodList.stream()
    //            .collect(
    //                Collectors.collectingAndThen(Collectors.toSet(),
    // Collections::unmodifiableSet));
    //    System.out.println("unmodifiableSet = " + unmodifiableSet);

    //    String[][] countryCapital =
    //        new String[][] {{"USA", "Washington DC"}, {"UK", "London"}, {"India", "New Delhi"}};
    //    Map<String, String> immutableMap =
    //        Stream.of(countryCapital)
    //            .collect(
    //                Collectors.collectingAndThen(
    //                    Collectors.toMap(p -> p[0], p -> p[1]),
    //                    Collections::<String, String>unmodifiableMap));
    //    System.out.println("immutableMap--->"+immutableMap);

    //    List<String> reverseList =
    //        countries.stream()
    //            .collect(
    //                Collectors.collectingAndThen(
    //                    Collectors.toCollection(ArrayList::new),
    //                    lst -> {
    //                      Collections.reverse(lst);
    //                      return lst.stream();
    //                    }))
    //            .collect(Collectors.toCollection(ArrayList::new));
    //    List<String> countries = Arrays.asList("USA", "UK", "India");
    //    List<String> reverseList =
    //        countries.stream()
    //            .collect(
    //                Collectors.collectingAndThen(
    //                    Collectors.toList(),
    //                    lst -> {
    //                      Collections.reverse(lst);
    //                      return lst.stream();
    //                    }))
    //            .collect(Collectors.toCollection(ArrayList::new));
    //    reverseList =
    //        countries.stream()
    //            .collect(
    //                Collectors.collectingAndThen(
    //                    Collectors.toList(),
    //                    lst -> {
    //                      Collections.reverse(lst);
    //                      return lst.stream();
    //                    }))
    //            .collect(Collectors.toList());
    //    System.out.println("reverseList = " + reverseList);

//    Stream<Integer> stream = IntStream.rangeClosed(0, 10).boxed();
// Get a List containing elements from fromIndex to toIndex
//    int fromIndex = 2;
//    int toIndex = 5;
//    List<Integer> slice = stream.collect(Collectors.collectingAndThen(
//            Collectors.toList(),
//            list -> list.stream()
//                    .skip(fromIndex)
//                    .limit(toIndex - fromIndex + 1)
//    )).collect(Collectors.toList());
//    System.out.println(slice);


  }
}
