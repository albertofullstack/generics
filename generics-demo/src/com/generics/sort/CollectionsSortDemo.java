package com.generics.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortDemo {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("Adam");
    names.add("Joe");
    names.add("Alfonso");
    names.add("Isabelle");
    Collections.sort(names);
    System.out.println(names);

    Collections.sort(names, Collections.reverseOrder());
    System.out.println(names);
  }

}
