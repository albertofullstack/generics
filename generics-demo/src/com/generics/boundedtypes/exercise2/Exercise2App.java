package com.generics.boundedtypes.exercise2;

public class Exercise2App {

  public static <T extends Number, V extends Number> T add(T num1, V num2) {
    if (num1 == null || num2 == null) {
      return null;
    }

    if (num1 instanceof Double) {
      return (T) Double.valueOf(Double.sum(num1.doubleValue(), num2.doubleValue()));
    } else if (num1 instanceof Integer) {
      return (T) Integer.valueOf(num1.intValue() + num2.intValue());
    } else if (num1 instanceof Float) {
      return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
    } else {
      throw new IllegalArgumentException("Type " + num1.getClass() + " is not supported by this method");
    }
  }

  public static void main(String[] args) {

    System.out.println(Exercise2App.add(2.4d, 5d));
  }
}
