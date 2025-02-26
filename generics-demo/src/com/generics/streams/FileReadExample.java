package com.generics.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReadExample {

  public static void main(String[] args) throws IOException {

    String path = "src/com/generics/streams/names";
    List<String> names;
    try (Stream<String> namesStream = Files.lines(Paths.get(path))) {
      names = namesStream.filter(name -> name.startsWith("A"))
          .collect(Collectors.toList());
    }
    names.forEach(System.out::println);

  }

}
