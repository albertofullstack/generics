package com.generics.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookStreamExample {

  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
    books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
    books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
    books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
    books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
    books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
    books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

    List<String> result = books.stream().filter(book -> Type.NOVEL.equals(book.getType()))
        .sorted(Comparator.comparing(Book::getPages))
        .map(Book::getTitle)
        .collect(Collectors.toList());
    
    result.stream().forEach(System.out::println);
  }
}
