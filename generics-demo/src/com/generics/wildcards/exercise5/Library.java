package com.generics.wildcards.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Algorithm> {

  private final List<T> algorithmList;

  public Library () {
    this.algorithmList = new ArrayList<>();
  }

  public void add(T source) {
    algorithmList.add(source);
  }

  public T getLast() {
    if (this.algorithmList.isEmpty()) {
      return null;
    }
    return this.algorithmList.remove(this.algorithmList.size() - 1);
  }
}
