package com.generics.boundedtypes;

public class App {

  public static class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge() {
      return age;
    }

    @Override
    public int compareTo(Person o) {

      return Integer.compare(age, o.getAge());
    }

    @Override
    public boolean equals(Object o) {

      Person other = (Person) o;
      if (other == null) {
        return false;
      }
      return this.age == other.getAge();
    }

    @Override
    public String toString() {
      return "Person{" +
          "name='" + name + '\'' +
          ", age=" + age +
          '}';
    }
  }

  public static <T extends Comparable<T>> T calculateMinimum (T t, T v) {

    if (t.compareTo(v) < 0) {
        return t;
    }
    return v;
  }

  public static void main(String[] args) {

    Person person1 = new Person("Ruben", 35);
    Person person2 = new Person("Damian", 56);
    Person person3 = new Person("Lidia", 126);

    System.out.println(calculateMinimum(person1, person2));
    System.out.println(calculateMinimum(person3, person2));
    System.out.println(calculateMinimum(44, 5));
    System.out.println(calculateMinimum("asdf", "asdfg"));
  }
}
