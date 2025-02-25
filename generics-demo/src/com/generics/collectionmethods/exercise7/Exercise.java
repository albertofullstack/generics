package com.generics.collectionmethods.exercise7;

public class Exercise {

  public static void main(String[] args) {
    Cache cache = new Cache();

    cache.search("www.facebook.com");
    cache.search("www.google.com");
    cache.search("www.amazon.com");
    cache.search("www.google.com");
    cache.search("www.facebook.com");
    cache.search("www.twitter.com");
    cache.search("www.globalsoftwaresuppot.com");
    cache.search("www.bbc.com");
    cache.search("www.cnn.com");
    cache.search("www.google.com");
    cache.search("www.amazon.com");
    cache.search("www.google.com");
    cache.search("www.facebook.com");

    // the cache remembers the recently visited URLs (in this case: facebook, google, amazon, cnn, bbc - 5 because the capacity of the cache is 5)

    cache.showCache();

    // I need it to be able to test wether your implmenetation works fine
  }

}
