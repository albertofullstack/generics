package com.generics.streams;

import java.util.stream.LongStream;

public class ParallelExample1 {

  public static void main(String[] args) {

    // parallel() - because we have to make sure that the given
    // stream can be parallelized
    // under the hood the fork-join framework is used
    long now = System.currentTimeMillis();
    System.out.println(sum(1000000000));
    System.out.println("Time taken with sequential approach: " + (System.currentTimeMillis() - now));

    long now2 = System.currentTimeMillis();
    System.out.println(parallelSum(1000000000));
    System.out.println("Time taken with parallel approach: " + (System.currentTimeMillis() - now2));
  }

  private static long sum(long n) {
    return LongStream.rangeClosed(1, n).reduce(0L, Long::sum);
  }

  private static long parallelSum(long n) {
    return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
  }

}
