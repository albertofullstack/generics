package com.generics.methods.exercise1;

public class AppExercise1Test {

  public static void main(String[] args) {

    EqualsMethod equalsMethod = new EqualsMethod();
    System.out.println(equalsMethod.checkEquality(5, 4));
    System.out.println(equalsMethod.checkEquality(5, 5));
    System.out.println(equalsMethod.checkEquality("illo", "juan"));
    System.out.println(equalsMethod.checkEquality("illo", "illo"));
  }
}
