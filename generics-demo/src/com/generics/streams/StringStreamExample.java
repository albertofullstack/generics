package com.generics.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StringStreamExample {

  public static void main(String[] args) {

    String[] names = {"Adam", "Daniel", "Martha", "Kevin", "Ben", "Joe", "Brad", "Susan"};
    Stream.of(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    System.out.println();
    Stream.of(names).filter(name -> name.startsWith("B")).forEach(System.out::println);
  }

}
