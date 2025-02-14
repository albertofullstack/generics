package com.generics.boundedtypes.exercise3;

import java.util.stream.Stream;

public class Exercise3App {

  public static <T extends Comparable<T>> long countGreaterItems(T[] items, T item) {

    int count = 0;
    for (T element: items) {
      if (element.compareTo(item) > 0) {
        count++;
      }
    }
    return count;
    //return Stream.of(items).filter(element -> element.compareTo(item) > 0).count();
  }

  public static void main(String[] args) {

    System.out.println(Exercise3App.countGreaterItems(new Integer[]{1, 2, 3, 4, 5}, 3));
    System.out.println(Exercise3App.countGreaterItems(new Double[]{1.4, 2.1, 3.9, 4.3, 5.1}, 2.0));
    System.out.println(Exercise3App.countGreaterItems(new String[]{"a", "b", "f", "d", "e"}, "c"));
  }
}
