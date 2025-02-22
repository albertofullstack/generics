package com.generics.lists;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {

  public static void main(String[] args) {

    // double ended Queue (DEQUE)
    // huge one dimensional array - O(1)

//    Deque<Integer> nums = new ArrayDeque<>();
//    nums.offer(1);
//    nums.offer(10);
//    nums.offer(100);
//    nums.offer(1000);
//
//    while (!nums.isEmpty()) {
//      System.out.println(nums.pollLast());
//    }

    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(1);
    stack.push(10);
    stack.push(100);
    stack.push(1000);
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }

}
