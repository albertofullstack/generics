package com.generics.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
    books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
    books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
    books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
    books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
    books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
    books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

    // map() and flatMap() are similar to selecting a column in SQL
    // transform the original values
    // numbers of characters in every word
    List<String> names = Arrays.asList("Adam", "Ana", "Daniel", "John");
    List<Integer> namesLenght = names.stream().map(String::length).collect(Collectors.toList());
//    namesLenght.forEach(System.out::println);

    // create a list containing the square value
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    List<Integer> squareValues = numbers.stream().map(number -> number * number)
        .collect(Collectors.toList());
//    squareValues.stream().forEach(System.out::println);

    // flatMap - mapping each array not with a stream but with the
    // contents of that stream
    // [[1, 3, 5], [5, 13]] -> [1, 3, 5, 5, 13]
    // "hello", "shell" - get all the unique characters (h, e, l, l, s)
    String[] array = {"hello", "shell"};
    Arrays.stream(array).map(str -> str.split(""))
        .flatMap(Stream::of)
        .distinct()
        .forEach(System.out::println);
//    System.out.println(chars);
  }

}
