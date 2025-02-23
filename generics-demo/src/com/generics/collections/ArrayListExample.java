package com.generics.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

  public static void main(String[] args) {

    // resizing the array takes O(N)
    List<String> names = new ArrayList<>();
    names.add("Juan");
    names.add("Kevin");
    names.add("Bartolo");

    // random indexing in O(1)
    System.out.println("The name in the index 0 is " + names.get(0));

    System.out.println();
    // insert item in a given index - O(N)
    names.add(2, "Daniel");


    System.out.println("Elements of the list");
    // because of the Iterable interface
    for (String s : names) {
      System.out.println(s);
    }

    // ARRAYS ARE FAST - O(1) IF WE REMOVE THE LAST ITEM, OR WE INSERT IN THE LAST POSITION

    System.out.println();
    // removes Juan in index 0 - O(N)
    names.remove(0);
    System.out.println("Items after removal of index 0");
    System.out.println(names);

    System.out.println();
    System.out.println("Elements in array");
    Object[] o = names.toArray();
    for (Object element : o) {
      System.out.println(element);
    }

    // contains will check whether the item is present on the array O(N)
    System.out.println(names.contains("Kate"));
    System.out.println(names.contains("Daniel"));
  }
}
