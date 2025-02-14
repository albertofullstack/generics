package com.generics.boundedtypes.exercise2;

public class Exercise2App {

  public static <T extends Number, V extends Number> double add(T num1, V num2) {
    return num1.doubleValue() + num2.doubleValue();
  }

  public static void main(String[] args) {

    System.out.println(Exercise2App.add(2.4d, 5d));
    System.out.println(Exercise2App.add(4, 5f));
    System.out.println(Exercise2App.add(3, 5));
    System.out.println(Exercise2App.add(2L, 3.33434));
  }
}
