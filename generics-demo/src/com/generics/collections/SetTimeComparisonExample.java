package com.generics.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTimeComparisonExample {

  public static void main(String[] args) {

    Set<Integer> treeMap = new TreeSet<>();

    long now = System.currentTimeMillis();
    for (int i = 0; i < 500000; i++) {
      treeMap.add(i);
    }
    System.out.println("Time taken for TreeSet: " + (System.currentTimeMillis() - now));

    Set<Integer> hashMap = new HashSet<>();
    now = System.currentTimeMillis();
    for (int i = 0; i < 500000; i++) {
      hashMap.add(i);
    }
    System.out.println("Time taken for HashSet: " + (System.currentTimeMillis() - now));


  }

}
