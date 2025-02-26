package com.generics.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelSaveOperation {

  public static final String DIRECTORY = System.getProperty("user.dir") + "/test/";

  public static void main(String[] args) throws IOException {

    // create the directory
    Files.createDirectories(Paths.get(DIRECTORY));

    ParallelSaveOperation app = new ParallelSaveOperation();

    // generate a large number of Person objects
    List<Person> people = app.generatePeople(1000);

    // sequential algorithm
    long start = System.currentTimeMillis();
    people.stream().forEach(ParallelSaveOperation::save);
    System.out.println("Time taken sequential: " + (System.currentTimeMillis() - start));

    // sequential algorithm
    start = System.currentTimeMillis();
    people.stream().parallel().forEach(ParallelSaveOperation::save);
    System.out.println("Time taken sequential: " + (System.currentTimeMillis() - start));

  }

  private static void save(Person person) {
    try (FileOutputStream ignored = new FileOutputStream(
        DIRECTORY + person.getPersonId() + ".txt")) {
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private List<Person> generatePeople(int num) {

    return Stream.iterate(0, n -> n + 1).limit(num).map(Person::new)
        .collect(Collectors.toList());
  }


}
