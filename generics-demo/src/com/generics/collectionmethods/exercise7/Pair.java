package com.generics.collectionmethods.exercise7;

import java.util.Objects;

public class Pair {

  // let's store the URL and a data associated with the URL (for example the content of the website)
  // we store these Pair objects in the cache
  // YOUR IMPLEMENTATION HERE !!!
  private String url;

  private String data;

  public Pair(String url, String data) {
    this.url = url;
    this.data = data;
  }

  public String getUrl() {
    return this.url;
  }

  public String toString() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    Pair pair = (Pair) o;
    return Objects.equals(url, pair.getUrl());
  }
}
