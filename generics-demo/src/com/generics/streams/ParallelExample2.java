package com.generics.streams;

import java.util.stream.IntStream;

public class ParallelExample2 {

  public static void main(String[] args) {

    // sequential stream
    long now = System.currentTimeMillis();
    long numberOfPrimes = IntStream.rangeClosed(2, Integer.MAX_VALUE/100).filter(ParallelExample2::isPrime).count();
    System.out.println("Number of primes (sequential): " + numberOfPrimes);
    System.out.println("Time taken with sequential approach: " + (System.currentTimeMillis() - now));

    // parallel stream
    long now2 = System.currentTimeMillis();
    long numberOfPrimes2 = IntStream.rangeClosed(2, Integer.MAX_VALUE/100).parallel().filter(ParallelExample2::isPrime).count();
    System.out.println("Number of primes (parallel): " + numberOfPrimes2);
    System.out.println("Time taken with parallel approach: " + (System.currentTimeMillis() - now2));
  }

  private static boolean isPrime(long num) {
    if (num <= 1) {
      return false;
    }
    if (num == 2) {
      return true;
    }
    if (num % 2 == 0) return false;

    // we can check the numbers in the range [0, sqrt(N)]
    long maxDivisor = (long) Math.sqrt(num);

    for (int i = 3; i < maxDivisor; i+=2) {
      if (num % i == 0)
        return false;
    }
    return true;
  }


}
