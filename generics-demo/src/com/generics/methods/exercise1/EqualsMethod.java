package com.generics.methods.exercise1;

public class EqualsMethod {

  public <T,V> boolean checkEquality(T t, V v) {
    return t.equals(v);
  }
}
