package com.generics.collections;

import java.util.LinkedList;

public class LinkedListExample {

  public static void main(String[] args) {

    // USUALLY WE USE LINKED LIST (MORE MEMORY!!!)
    LinkedList<Integer> nums = new LinkedList<>();
    nums.add(1);
    nums.add(3);
    nums.add(10);
    nums.add(5);

    for (Integer num : nums) {
      System.out.println(num);
    }

    System.out.println();
    nums.addFirst(11);
    nums.addFirst(20);
    nums.addFirst(40);
    System.out.println(nums);

    nums.removeFirst();
    System.out.println(nums);

    nums.removeLast();
    System.out.println(nums);
    System.out.println("Size: " + nums.size());
    System.out.println("isEmpty: " + nums.isEmpty());
  }

}
