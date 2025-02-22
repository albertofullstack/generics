package com.generics.lists;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

  public static void main(String[] args) {

    Queue<Person> queue = new PriorityQueue<>();
    queue.add(new Person("Kevin", 22));
    queue.add(new Person("Adam", 12));
    queue.add(new Person("Joe", 45));
    queue.add(new Person("Anna", 37));

    while (queue.peek() != null) {
      System.out.println(queue.poll());
    }
  }

}
