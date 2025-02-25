package com.generics.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExample {

  public static void main(String[] args) {

    int[] nums = {1, 5, 3, -2, 9, -12};
    // we don't have to use for loops with streams
//    for (int i : nums) {
//      System.out.println(i);
//    }

    Arrays.stream(nums).forEach(System.out::println);
    System.out.println(Arrays.stream(nums).sum());

    IntStream.range(0, 5).forEach(System.out::println);
    IntStream.range(0, 5).forEach(num -> System.out.print(num + "  "));
    IntStream.range(0, 10).filter(num -> num > 4).forEach(System.out::println);
  }

}
