package com.generics.types;

class Store {

  private Object item;

  public void setItem(Object item) {
    this.item = item;
  }

  public Object getItem() {
    return this.item;
  }
}

public class GenericTypeApp {

  public static void main(String[] args) {

    Store store = new Store();
    store.setItem(45.5);
    // we can cast object into any other object
    Integer item = (Integer) store.getItem();
//    Double item2 = (Integer) store.getItem(); //this will throw a compile error
    System.out.println(item);
  }
}
