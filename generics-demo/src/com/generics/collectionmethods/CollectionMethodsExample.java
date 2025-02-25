package com.generics.collectionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethodsExample {

  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();

    nums.add(1);
    nums.add(10);
    nums.add(5);
    nums.add(8);
    nums.add(2);
    nums.add(3);

    Collections.reverse(nums);
    System.out.println(nums);

    // Min and Max finding
    System.out.println(Collections.min(nums));
    System.out.println(Collections.max(nums));

    // we can shuffle the underlying collections
    // bogo sort
    Collections.shuffle(nums);
    System.out.println(nums);

    Collections.rotate(nums, 1);
    System.out.println(nums);

    // replace the items
    Collections.replaceAll(nums, 1, 10);
    System.out.println(nums);
  }
}
