package com.generics.sort;

import java.util.Comparator;

public class BookAuthorLenghtComparator implements Comparator<Book> {

  @Override
  public int compare(Book b1, Book b2) {
//    return Integer.compare(b1.getNumOfPages(), b2.getNumOfPages());
    return Integer.compare(b1.getAuthorName().length(), b2.getAuthorName().length());
  }
}
