package com.generics.methods;

public class GenericMethod {

  // the name of the generic type is a Capital Letter (T, S, V...)
  public <V> void displayItem(V item) {
    System.out.println("The item is: " + item.toString());
  }

  public <V> V returnItem(V item) {
    System.out.println("The item returned is: " + item.toString());
    return item;
  }

  public <T> void showItems(T[] items) {
    for (T item : items) {
      System.out.println(item);
    }
  }

  // two generic parameters method
  public <T, V> void printItems(T t, V v) {
    System.out.println("The item t is: " + t.toString());
    System.out.println("The item v is: " + v.toString());
  }
}
