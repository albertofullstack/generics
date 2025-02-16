package com.generics.wildcards.upperbounded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

  public static double sumAll(List<? extends Number> list) {

    double sum = 0;
    for (Number n : list) {
      sum += n.doubleValue();
    }
    return sum;
  }
  public static void showAll(List<? extends Number> list) {

    for (Number n : list) {
      System.out.println(n);
    }
  }

  public static void main(String[] args) {

    // we can create ArrayList like this
    List<? extends Number> list1 = new ArrayList<Integer>();
    List<? extends Number> list2 = new ArrayList<Double>();
//    List<? extends Number> list3 = new ArrayList<String>();

    // we user upper bounded wildcards to read items
    List<Integer> integerList = new ArrayList<>();
    integerList.add(3);
    integerList.add(4);
    showAll(integerList);
//    showAll(Arrays.asList(1.1f, 45.4f, 3.2f));

    System.out.println(sumAll(Arrays.asList(1.5, 3.5, 5.2)));
  }

}
