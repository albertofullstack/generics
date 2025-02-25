package com.generics.sort;

public class Book {

  private String authorName;
  private String title;
  private int numOfPages;

  public Book(String authorName, String title, int numOfPages) {
    this.authorName = authorName;
    this.title = title;
    this.numOfPages = numOfPages;
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getTitle() {
    return title;
  }

  public int getNumOfPages() {
    return numOfPages;
  }

  @Override
  public String toString() {
    return "Book{" +
        "authorName='" + authorName + '\'' +
        ", title='" + title + '\'' +
        ", numOfPages=" + numOfPages +
        '}';
  }

//  @Override
//  public int compareTo(Book o) {
////    return Integer.compare(this.numOfPages, o.getNumOfPages());
////    return this.title.compareTo(o.getTitle());
//    if (this.numOfPages > o.getNumOfPages()) {
//      return -1;
//    } else if (this.numOfPages < o.getNumOfPages()) {
//      return 1;
//    }
//    return 0;
//  }
}
