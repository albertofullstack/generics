package com.generics.collectionmethods.exercise7;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Cache {

  // we can store up to 5 items in the cache
  private static final int CAPACITY = 5;
  // let's use a list to store the items (URLs)
  private List<Pair> cache;

  public Cache() {
    this.cache = new LinkedList<>();
  }

  // YOUR IMPLEMENTATION HERE !!!
  public void search(String url) {

    Pair pair = new Pair(url, UUID.randomUUID().toString());
    if (cache.contains(pair)) {
      // if already contains the element it should remove it from the list
      cache.remove(pair);
    } else {
      // if it doesn't contain the element it should check the capacity before adding it
      if (cache.size() == CAPACITY) {
        cache.remove(0);
      }
    }
    // it will add the new element to the end of the list
    cache.add(pair);
    System.out.print("Adding element: " + url + " - current cache is : " + cache + "\n");
  }

  // I need it to test your implementation
  public List<Pair> getCache() {
    return this.cache;
  }

  public void showCache() {
    System.out.println("Final cache");
    for(Pair pair : cache)
      System.out.println(pair);
  }

}
