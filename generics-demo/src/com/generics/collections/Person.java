package com.generics.collections;

import java.util.Objects;

public class Person implements Comparable<Person> {

  private String name;

  private int age;

  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  // THERE ARE SOME RULES
  // 1) if two objects are the same then they must have the same hash code
  // 2) if two objects have the same hash code they may or may not be equal

  @Override
  // in a hashmap it may happen (because of collisions)
  // that we have to find the item (Person) in a linked list
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    // hashCode  = hash function
    // it calculates an array index based on the key (keys==Person objects)
    // avoid clustering with prime numbers (31 for example)
    return Objects.hash(name, age);
  }

  @Override
  public int compareTo(Person o) {
//    return Integer.compare(this.age, o.getAge());
    return -this.name.compareTo(o.getName());
  }
}
