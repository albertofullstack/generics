package com.generics.wildcards;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.css.Rect;

public class ObjectsListDisplayApp {

  //public static void display(List<Object> objects) { // da error puesto que una lista de enteros
  // no es subclase de una lista de objetos
  public static void display(List<?> objects) {
    for (Object o: objects) {
      System.out.println(o.toString());
    }
  }

  public static <T extends Shape> void drawAll(List<T> shapes) {
    for (T shape : shapes) {
      shape.draw();
    }
  }

  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    nums.add(3);
    nums.add(5);
    display(nums);

    List<Rectangle> rectangles = new ArrayList<>();
    rectangles.add(new Rectangle());
    drawAll(rectangles);
  }

}
