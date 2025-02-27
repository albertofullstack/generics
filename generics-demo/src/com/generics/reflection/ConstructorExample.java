package com.generics.reflection;

import java.lang.reflect.Constructor;

public class ConstructorExample {

  public static void main(String[] args) throws Exception {

    Constructor<Test> constructor = Test.class.getDeclaredConstructor();
    System.out.println(constructor.getName());

    // WE CAN INSTANTIATE A CLASS WITH REFLECTION
    // DESPITE THE FACT IT HAS A PRIVATE CONSTRUCTOR
    // Joshua Bloch's solution - ENUMS
    constructor.setAccessible(true);

    // we can instantiate a new class
    Test test = constructor.newInstance();
    Test test2 = constructor.newInstance();
    Test test3 = constructor.newInstance();
    System.out.println(test);
  }
}
