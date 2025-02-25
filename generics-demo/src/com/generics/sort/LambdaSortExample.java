package com.generics.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSortExample {

  public static void main(String[] args) {

    List<Person> people = new ArrayList<>();
    people.add(new Person("Adam", 34));
    people.add(new Person("Adam", 23));
    people.add(new Person("Adam", 12));
    people.add(new Person("Adam", 12));
    people.add(new Person("Joe", 12));
    people.add(new Person("Mike", 25));
    people.add(new Person("Ana", 27));
    people.add(new Person("Katy", 78));
    people.add(new Person("Kevin", 45));

    Collections.sort(people, Comparator.comparing(Person::getName)
        .thenComparing(Person::getAge));

    for (Person person : people) {
      System.out.println(person.getName() + "-" + person.getAge());
    }
  }

}
