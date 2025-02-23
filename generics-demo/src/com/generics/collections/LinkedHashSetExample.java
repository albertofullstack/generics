package com.generics.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

  public static void main(String[] args) {

    // HashSet doesn't maintain the insertion order
    Set<String> set1 = new HashSet<>();
    set1.add("Adam");
    set1.add("Mary");
    set1.add("Katy");
    set1.add("Patrick");
    set1.add("Mary");
    System.out.println(set1);

    // LinkedHashSet maintains the insertion order
    // doubly linkedlist connecting the items
    // IT NEEDS MORE MEMORY THAN HASHSETS
    set1 = new LinkedHashSet<>();
    set1.add("Adam");
    set1.add("Mary");
    set1.add("Katy");
    set1.add("Patrick");
    set1.add("Mary");

    System.out.println(set1);
  }

}
