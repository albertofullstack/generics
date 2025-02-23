package com.generics.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();

    // FIFO O(1)
    queue.add("Ana");
    queue.add("Kevin");
    queue.add("Adam");
    queue.add("Katy");

    System.out.println("Removing item: " + queue.remove());
    System.out.println("Check item: " + queue.element());

    for (String s : queue) {
      System.out.println(s);
    }

    while (!queue.isEmpty()) {
      System.out.println(queue.remove());
    }
  }

}
