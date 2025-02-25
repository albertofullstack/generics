package com.generics.collectionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {

  public static void main(String[] args) {

    // add and remove methods are synchronized
    // intrinsic lock - not that efficient because threads
    // have to wait for each other even when they want to execute
    // independent methods (operations)
    // CONCURRENT COLLECTIONS !!! (topic discussed in another course)
    List<Integer> nums = Collections.synchronizedList(new ArrayList<>());

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 5000; i++) {
        nums.add(i);
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 5000; i++) {
        nums.add(i);
      }
    });
    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Size of array: " + nums.size());
  }

}
