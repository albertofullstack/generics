package com.generics.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

  public static void main(String[] args) {

    Map<Person, String> map = new HashMap<>();
    map.put(new Person("Tony", 34), "Tony");
    map.put(new Person("John", 35), "John");
    map.put(new Person("Tony", 35), "Tony");
    System.out.println(map);
  }

}
