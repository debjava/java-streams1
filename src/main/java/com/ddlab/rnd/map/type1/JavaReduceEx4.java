package com.ddlab.rnd.map.type1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JavaReduceEx4 {

  public static void main(String[] args) {

    List<User> users = new ArrayList<>();
    users.add(new User("Frank", LocalDate.of(1979, 11, 23)));
    users.add(new User("Peter", LocalDate.of(1985, 1, 18)));
    users.add(new User("Lucy", LocalDate.of(2002, 5, 14)));
    users.add(new User("Albert", LocalDate.of(1996, 8, 30)));
    users.add(new User("Frank", LocalDate.of(1967, 10, 6)));

    int maxAge = users.stream().mapToInt(User::getAge).reduce(0, (a1, a2) -> a1 > a2 ? a1 : a2);

    System.out.printf("The oldest user's age: %s%n", maxAge);
  }
}
