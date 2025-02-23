package com.generics.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

  public static void main(String[] args) {

    // O(log N)
    TreeSet<Integer> set1 = new TreeSet<>(Comparator.reverseOrder());
    set1.add(12);
    set1.add(20);
    set1.add(45);
    set1.add(5);
    set1.add(55);
    set1.add(920);

    for (Integer num : set1) {
      System.out.println(num);
    }

    System.out.println();
    System.out.println("Elements of subset");
    Set<Integer> subSet = set1.subSet(80, 0);
    for (Integer num : subSet) {
      System.out.println(num);
    }

    System.out.println();
    System.out.println("Elements of tailSet(values > 50): " + set1.tailSet(50));
    System.out.println("Elements of headSet(values < 50): " + set1.headSet(50));
    System.out.println("Largest item: " + set1.last());
    System.out.println("Minor item: " + set1.first());
  }
}
