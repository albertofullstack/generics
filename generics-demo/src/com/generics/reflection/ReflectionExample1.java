package com.generics.reflection;

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
  }

  public static void checkClass(Vehicle vehicle) {

    Class c = vehicle.getClass();
    System.out.println(c.getName());
  }
}
