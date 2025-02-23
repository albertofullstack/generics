package com.generics.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

  public static void main(String[] args) {

    // O(1) < O(logN)
    TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
    treeMap.put(10, "ten");
    treeMap.put(3, "three");
    treeMap.put(1, "one");
    treeMap.put(1, "1");
    treeMap.put(8, "eight");
    treeMap.put(5, "five");

    System.out.println("Smallest key: " + treeMap.lastKey());
    System.out.println("Largest key: " + treeMap.firstKey());
    for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
      System.out.println(entry.getKey() + "-" + entry.getValue());
    }
  }

}
