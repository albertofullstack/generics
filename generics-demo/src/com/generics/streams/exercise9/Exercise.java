package com.generics.streams.exercise9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise {

  public static List<List<Integer>> generatePairs() {

    List<Integer> nums1 = Arrays.asList(1, 2, 3);
    List<Integer> nums2 = Arrays.asList(4, 5);

    // implement your algorithm here (the pairs will be the result)
    return nums1.stream()
        .flatMap(x -> nums2.stream().map(num2 -> List.of(x, num2)))
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println(generatePairs());
  }

}
