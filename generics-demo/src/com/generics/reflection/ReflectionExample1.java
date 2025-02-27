package com.generics.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class ReflectionExample1 {

  public static void main(String[] args) {

    // first method to acquire the class
    Class<Person> person = Person.class;
    System.out.println(person.getName());

    // second approach
    Class personClass2 = null;
    try {
      personClass2 = Class.forName("com.generics.reflection.Person");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    System.out.println(personClass2.getName());
    checkClass(new Car());

    System.out.println(personClass2.getSuperclass().getName());

    // to get interfaces call to getInterfaces()
    Class[] interfaces = personClass2.getInterfaces();
    for (Class inter : interfaces) {
      System.out.println(inter.getName());
    }

    Method[] methods = personClass2.getMethods();
    for (Method method : methods) {
      if (method.isAnnotationPresent(MyAnnotation.class)) {
        System.out.println(method.getName());
      }
    }
  }

  public static void checkClass(Vehicle vehicle) {

    Class c = vehicle.getClass();
    System.out.println(c.getName());
  }
}
