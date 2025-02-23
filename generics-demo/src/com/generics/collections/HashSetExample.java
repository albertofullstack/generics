package com.generics.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

  public static void main(String[] args) {

    // initial capacity = 16
    // hashCode function (hash-function) transforms the input into an array index
    // O(1) + memory heavy
    // there may be collisions - O(log N)
    Set<String> set1 = new HashSet<>();
    set1.add("Adam");
    set1.add("Mary");
    set1.add("Katy");
    set1.add("Patrick");
    set1.add("Mary");

    for (String s : set1) {
      System.out.println(s);
    }

    Set<String> set2 = new HashSet<>();
    set2.add("Adam");
    set2.add("Mary");

    System.out.println();
    System.out.println("Retaining elements from set2 in set1");
    set1.retainAll(set2);
    for (String s : set1) {
      System.out.println(s);
    }

    set1.remove("Mary");
    System.out.println(set1);
    System.out.println(set1.containsAll(set2));
  }
}
