package com.generics.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeTimeComparisonExample {

  public static void main(String[] args) {

    Map<Integer, Integer> treeMap = new TreeMap<>();

    long now = System.currentTimeMillis();
    for (int i = 0; i < 500000; i++) {
      treeMap.put(i, i);
    }
    System.out.println("Time taken for TreeMap: " + (System.currentTimeMillis() - now));

    Map<Integer, Integer> hashMap = new HashMap<>();
    now = System.currentTimeMillis();
    for (int i = 0; i < 500000; i++) {
      hashMap.put(i, i);
    }
    System.out.println("Time taken for HashMap: " + (System.currentTimeMillis() - now));


  }

}
