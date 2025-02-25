package com.generics.sort;

import java.util.Arrays;

public class ArraysSortDemo {

  public static void main(String[] args) {

    // QuickSort - to sort primitive types (int, long, double...)
    // MergeSort - to sort reference types (Integer, String...)
    int[] nums = {1, 10, 5, 2, -5, 12, 14, 0, 1, 2};
    Arrays.sort(nums);
    for (int num : nums) {
      System.out.print(num + "  ");
    }

    System.out.println();
    for (int i = nums.length -1; i >= 0; i--) {
      System.out.print(nums[i] + "  ");
    }

    String[] names = {"Kevin", "Ana", "Katy", "Joe", "Adam"};
    Arrays.sort(names);
    System.out.println();
    for (int i = names.length -1; i >= 0; i--) {
      System.out.print(names[i] + "  ");
    }
  }

}
