package com.generics.collections;

import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {
    Stack<String> stringStack = new Stack<>();
    stringStack.push("hola");
    stringStack.push("amigo");
    System.out.println(stringStack);

    System.out.println("Peek: " + stringStack.peek());
    System.out.println(stringStack.pop());
    System.out.println(stringStack);
    System.out.println("Size: " + stringStack.size());
    stringStack.pop();
    System.out.println(stringStack);
    System.out.println("isEmpty stack: " + stringStack.isEmpty());
  }

}
