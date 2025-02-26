package com.generics.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OtherFunctionsExample {

  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
    books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
    books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
    books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
    books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
    books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
    books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

    System.out.println(books.stream().count());

    // the maximum number of pages
    books.stream().map(Book::getPages).reduce(Integer::max).ifPresent(System.out::println);

    // total number
    List<Integer> nums = Arrays.asList(1, 2, 3, 4);
    // we don't get a NullPointerException
    nums.stream().reduce(Integer::min).ifPresent(System.out::println);

    // we want to get the longest book
    books.stream().reduce((b1, b2) -> b1.getPages() > b2.getPages() ? b1 : b2)
        .ifPresent(System.out::println);

    // sum all pages of books
//    books.stream().map(Book::getPages).reduce(Integer::sum).ifPresent(System.out::println);
    int totalNumPages = books.stream().mapToInt(Book::getPages).sum();
    System.out.println(totalNumPages);

    IntStream intStream = books.stream().mapToInt(Book::getPages);
    Stream<Integer> ss = intStream.boxed();

    // [book1, book2, book3, book4, book5] -> mapToInt -> [1, 1, 1, 1].sum() = 4
  }
}
