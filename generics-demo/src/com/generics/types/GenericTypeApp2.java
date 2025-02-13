package com.generics.types;

class Store2<T> {

  private T item;

  public void setItem(T item) {
    this.item = item;
  }

  public T getItem() {
    return this.item;
  }
}

class HashTable<K, V> {

  private K key;
  private V value;

  public HashTable(K key, V value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString() {
    return "HashTable{" +
        "key=" + key +
        ", value=" + value +
        '}';
  }
}

public class GenericTypeApp2 {

  public static void main(String[] args) {

    // raw type
    // <> diamond operator
    Store2<Integer> store2 = new Store2<>();
    store2.setItem(3);

    // we can cast Object into any other object
    // it will throw a compile error
    Integer item = store2.getItem();
    System.out.println(item);

    HashTable<String, Integer> hashTable = new HashTable<>("hello", 4);
    System.out.println(hashTable);
  }

}
