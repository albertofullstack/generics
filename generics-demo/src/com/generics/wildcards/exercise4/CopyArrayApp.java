package com.generics.wildcards.exercise4;

import com.generics.wildcards.generic.Shape;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CopyArrayApp {

  public static <T> void copy(List<? extends T> source, List<? super T> destination) {

    destination.addAll(source);
  }

  public static void main(String[] args) {

    List<Integer> source = new ArrayList<>();
    source.add(3);
    source.add(4);

    List<Integer> destination = new ArrayList<>();
    copy(source, destination);
    System.out.println(destination);

    List<String> strings = new ArrayList<>();
    copy(strings, strings);
  }

}
