package com.generics.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldVariableExample {

  public static void main(String[] args) {

    Class<Person> personClass = Person.class;
    System.out.println(personClass.getPackage());

    // use getFields for public variables, and getMethods for public methods
    // and getDeclaredFields for private/protected, same with methods, with getDeclaredMethods
//    Field[] fields = personClass.getFields();
    Field[] declaredFields = personClass.getDeclaredFields();
    for (Field field : declaredFields) {
      field.setAccessible(true);
      System.out.println(field.getName());
    }

    Method[] methods = personClass.getMethods();
    for (Method method : methods) {
      System.out.println(method.getName() + " return " + method.getReturnType());
    }
  }

}
