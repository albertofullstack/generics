package com.generics.collections.exercise6;

import java.util.Arrays;
import java.util.List;

public class ReverseList {

  public static void reverse(List<Integer> list) {

    for (int i = 0; i < list.size()/2; i++) {
      int aux = list.get(i);
      list.set(i, list.get(list.size() - i - 1));
      list.set(list.size() - i - 1, aux);
    }
  }

  public static void main(String[] args) {

    List<Integer> ints = Arrays.asList(2, 3, 4, 5, 6);
    System.out.println("List: " + ints);
    reverse(ints);
    System.out.println("Reversed list: " + ints);

    System.out.println();
    List<Integer> ints2 = Arrays.asList(2, 3, 4, 6);
    System.out.println("List2: " + ints2);
    reverse(ints2);
    System.out.println("Reversed list 2: " + ints2);

    System.out.println();
    List<Integer> oneElementList = Arrays.asList(1);
    reverse(oneElementList);
    System.out.println(oneElementList);
  }

}
