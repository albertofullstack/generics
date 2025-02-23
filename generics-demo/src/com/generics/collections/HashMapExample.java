package com.generics.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

  public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();

    // insert into the map O(1) if there is no collision
    map.put(1, "Adam");
    map.put(2, "Kevin");
    map.put(3, "Ana");
    map.put(4, "John");
    map.put(null, "This is a null");

    // we can retrieve items based on keys O(1)
    System.out.println(map.get(1));
    System.out.println("This key is not in the map: " + map.get(80));
    System.out.println(map.get(null));

    // remove items in O(1)
    map.remove(2);
    map.remove(60);

    System.out.println();
    System.out.println("Loop the keySet");
    // retrieve the keys
    for (Integer key : map.keySet()) {
      System.out.println("The key : " + key + " has the associated value: " + map.get(key));
    }

    System.out.println();
    System.out.println("Loop the entrySet");
    // loop the entrySet
    for (Entry<Integer, String> entry : map.entrySet()) {
      System.out.println("The key : " + entry.getKey() + " has the associated value: " + map.get(entry.getValue()));
    }
   }

}
