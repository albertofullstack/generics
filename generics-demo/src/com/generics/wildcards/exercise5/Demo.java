package com.generics.wildcards.exercise5;

import java.util.List;

class Exercise {

  public void runExercise() {

    // you have to implement the other classes such that the following code can run without any error

    Library<Algorithm> library = new Library<>();
    library.add(new SearchAlgorithm());
    library.add(new SortingAlgorithm());
    library.add(new GraphAlgorithm());

    Algorithm item = library.getLast();

    while(item!=null) {
      item.execute();
      item = library.getLast();
    }
  }
}

public class Demo {

  public static void main(String[] args) {

    Exercise exercise = new Exercise();
    exercise.runExercise();

  }

}
