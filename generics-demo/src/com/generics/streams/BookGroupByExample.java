package com.generics.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookGroupByExample {

  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
    books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
    books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
    books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
    books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
    books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
    books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

    Map<Type, List<Book>> booksByType = books.stream()
        .collect(Collectors.groupingBy(Book::getType));
    booksByType.entrySet().stream().forEach(System.out::println);

    // finding two longest books (more than 500 pages)
    List<String> longestBooks = books.stream().filter(book -> book.getPages() > 500)
        .map(Book::getTitle).limit(2).collect(Collectors.toList());
    longestBooks.stream().forEach(System.out::println);

    // short-circuiting and loop fusion
    // filter() and map() are different operations, they
    // are merged into the same pass (loop fusion)
    // short-circuiting: some operations don't need to process the whole
    // stream to produce a result
    // here we are looking for just 2 items - so the algorithm
    // terminates after finding 2 items !!!
    List<String> longestBooks2 = books.stream().filter(book -> {
          System.out.println("Filtering " + book.getTitle());
          return book.getPages() > 500;
        })
        .map(b -> {
          System.out.println("Mapping " + b.getTitle());
          return b.getTitle();
        }).limit(2).collect(Collectors.toList());
  }
}
