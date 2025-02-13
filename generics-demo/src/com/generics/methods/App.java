package com.generics.methods;

public class App {

  public static void main(String[] args) {

    GenericMethod genericMethod = new GenericMethod();
    genericMethod.displayItem("545");
    genericMethod.displayItem('E');
    genericMethod.displayItem(34);
    genericMethod.displayItem(56.7);

    genericMethod.returnItem("Juan");
    genericMethod.returnItem(4L);

    System.out.println();
    genericMethod.printItems(4, "Luis");

    System.out.println();
    System.out.println("Showing lists...");

    Integer[] numbers = {1, 5, 4, 3, 2};
    genericMethod.showItems(numbers);

    String[] names = {"Tigre", "Raton", "Murcielago", "Jirafa"};
    genericMethod.showItems(names);

  }
}
