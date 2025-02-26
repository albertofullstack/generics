package com.generics.streams;

import java.util.ArrayList;
import java.util.List;

public class MatchExample {

  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
    books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
    books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
    books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
    books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
    books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
    books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

    // allMatch() - checking if a Predicate matches all elements
    boolean result = books.stream().allMatch(book -> book.getPages() > 2000);
    System.out.println(result);

    // noneMatch() - opposite of allMatch()
    // short-circuiting: some operations don't need to process the whole
    // stream to produce a result
    boolean result2 = books.stream().noneMatch(book -> book.getPages() > 2000);
    System.out.println(result2);

    // findAny - returns arbitrary element
    // parallelization - use findAny instead of findFirst
    // findFirst - Sequential
    // findAny - with parallelization
    books.stream().filter(b -> b.getType().equals(Type.HISTORY)).findAny().ifPresent(System.out::println);
  }

}
