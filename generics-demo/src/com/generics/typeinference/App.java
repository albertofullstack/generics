package com.generics.typeinference;

import java.util.ArrayList;
import java.util.List;

class Bucket<T> {

  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
}

public class App {

  public static <T> void addStore(T t, List<Bucket<T>> buckets) {

    Bucket<T> bucket = new Bucket<>();
    bucket.setItem(t);
    buckets.add(bucket);
    System.out.println(t.toString() + " has been added to the list...");
  }

  public static void main(String[] args) {

    List<Bucket<String>> buckets = new ArrayList<>();

    App.addStore("Adam", buckets);

    // "type" witness
    App.addStore("Daniel", buckets);
  }

}
